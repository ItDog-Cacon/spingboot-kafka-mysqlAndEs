package com.byzoro.yjzhdatastorage.util;

import com.byzoro.yjzhdatastorage.entity.Config;
import com.byzoro.yjzhdatastorage.service.esImpl.EsDataImpl;
import com.byzoro.yjzhdatastorage.service.impl.ComsumerServiceImpl;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class BatchListener {

    @Autowired
    private KafkaListenerEndpointRegistry registry;
    @Resource
    private EsDataImpl consumerServiceEs;
    @Resource
    private ComsumerServiceImpl consumerServiceSql;
    @Resource
    private Config config;

    private Map<String, Object> consumerProps() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, config.getBootstrapServers());
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, config.getEnableAutoCommit());
        props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, config.getAutoCommitIntervalMs());
        props.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, config.getSessionTimeoutMs());
        //一次拉取消息数量
        props.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, config.getMaxPollRecords());
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, IntegerDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        return props;
    }

    @Bean("batchContainerFactory")
    public ConcurrentKafkaListenerContainerFactory listenerContainer() {
        ConcurrentKafkaListenerContainerFactory container = new ConcurrentKafkaListenerContainerFactory();
        container.setConsumerFactory(new DefaultKafkaConsumerFactory(consumerProps()));
        //设置并发量，小于或等于Topic的分区数
        if(!config.getSqlEnable().equalsIgnoreCase("1")){
            System.out.println("Sql database not ready, kafka listener waiting... ...");
            container.setAutoStartup(false);
        }
        if(!config.getEsEnable().equalsIgnoreCase("1")){
            System.out.println("Es database not ready, kafka listener waiting... ...");
            container.setAutoStartup(false);
        }
        container.setConcurrency(config.getBatchConsumer());
        //设置为批量监听
        container.setBatchListener(true);
        return container;
    }

    //监听事件，Mysql入库
    @KafkaListener(id = "batch1", clientIdPrefix = "batch1", topics = "#{'${topic}'.split(',')}", containerFactory = "batchContainerFactory")
    public void batchListener1(List<String> data) {
        for (String s:data
             ) {
            consumerServiceSql.getData(s);
        }
    }
    //监听事件，ES入库
    @KafkaListener(id = "batch2", clientIdPrefix = "batch2", topics = "#{'${topic}'.split(',')}", containerFactory = "batchContainerFactory")
    public void batchListener2(List<String> data) {
        for (String s:data
        ) {
            consumerServiceEs.getData(s);
        }
    }
}
