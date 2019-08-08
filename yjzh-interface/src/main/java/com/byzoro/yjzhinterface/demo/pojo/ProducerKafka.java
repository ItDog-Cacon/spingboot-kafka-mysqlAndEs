package com.byzoro.yjzhinterface.demo.pojo;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * @Description: kafka生产者工具类
 * @Param:
 * @return:
 * @Author:xiaopang
 * @Date:2019/7/15
 */
@Component
public class ProducerKafka {
    public void producer(Properties properties,String topic,String msg){
        Producer<String, String> producer = null;
        try {
            producer = new KafkaProducer<String, String>(properties);
            producer.send(new ProducerRecord<String, String>(topic,msg));
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            producer.close();
        }
    }
    
    /**
     *@Description: 无参数配置kafka生产者
     *@Param:[config]
     *@return:java.util.Properties
     *@Author:xiaopang
     *@Date:2019/7/15
     */
    public Properties producerConfig(){
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "192.168.124.100:9092");
        properties.put("acks", "all");
        properties.put("retries", 0);
        properties.put("batch.size", 16384);
        properties.put("linger.ms", 1);
        properties.put("buffer.memory", 33554432);
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        return properties;
    }

    /**
     *@Description: 有参数配置kafka
     *@Param:[config]
     *@return:java.util.Properties
     *@Author:xiaopang
     *@Date:2019/7/15
     */
    public Properties producerConfig(Config config){
        Properties properties = new Properties();
        properties.put("bootstrap.servers",config.getBootstrapServers());
        properties.put("acks", config.getAcks());
        properties.put("retries",config.getRetries());
        properties.put("batch.size",config.getBatchSize());
        properties.put("linger.ms",config.getLingerMs());
        properties.put("buffer.memory",config.getBufferMemory());
        properties.put("key.serializer",config.getKeySerializer());
        properties.put("value.serializer",config.getValueSerializer());

        return properties;
    }
}
