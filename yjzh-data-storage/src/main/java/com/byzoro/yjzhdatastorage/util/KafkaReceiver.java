package com.byzoro.yjzhdatastorage.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaReceiver {
//    @KafkaListener(topics = {"${topic}"})
    public void listen(ConsumerRecord<?, ?> record) {
        record.value();
        record.offset();
        System.out.println(record.toString());
        }
    }