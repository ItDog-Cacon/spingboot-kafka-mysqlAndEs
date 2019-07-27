package com.byzoro.yjzhinterface.demo.service.impl;

import com.byzoro.yjzhinterface.demo.pojo.Config;
import com.byzoro.yjzhinterface.demo.pojo.ProducerKafka;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.stereotype.Service;
import com.byzoro.yjzhinterface.demo.service.YjzhService;

import javax.annotation.Resource;
import java.util.Properties;

/**
*@Description: 接收到数据后将数据灌入到kafka中
*@Param:
*@return:
*@Author:xiaopang
*@Date:2019/7/15
*/
@Service
public class YjzhServiceImpl implements YjzhService {
    @Resource
    private Config config;

    @Override
    public void insertKafka(String topic,String msg) {
        ProducerKafka producerKafka = new ProducerKafka();
        Properties properties = producerKafka.producerConfig(config);
        producerKafka.producer(properties,topic,msg);
    }
}
