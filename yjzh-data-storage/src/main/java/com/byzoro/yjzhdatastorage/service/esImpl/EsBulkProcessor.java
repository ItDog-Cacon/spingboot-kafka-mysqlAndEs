package com.byzoro.yjzhdatastorage.service.esImpl;

import org.elasticsearch.action.bulk.BulkProcessor;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.unit.ByteSizeUnit;
import org.elasticsearch.common.unit.ByteSizeValue;
import org.elasticsearch.common.unit.TimeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class EsBulkProcessor {
    @Autowired
    private TransportClient transportClient;

    private TransportClient client;
    /**单例批量处理实例*/
    private BulkProcessor bulkProcessor;

    @PostConstruct
    public void init() {
        client = this.transportClient;
    }

    /** 初始化批量配置属性，符合其中一些条件，即会触发批量操作*/
    @Bean
    public BulkProcessor initBulkProcessor(){
        bulkProcessor = BulkProcessor.builder(client, new BulkProcessor.Listener() {
            public void beforeBulk(long id, BulkRequest req) {
                System.out.println("id: "+id+" req: "+req);//发送请求前，可以做一些事情
            }
            public void afterBulk(long id, BulkRequest req, Throwable cause) {
                System.out.println("id: "+id+"  req: "+req+"  cause: "+cause.getMessage());//发送请求失败，可以做一些事情
            }
            public void afterBulk(long id, BulkRequest req, BulkResponse rep) {
                System.out.println("id: "+id+"  req: "+req+"  rep: "+rep);//发送请求成功后，可以做一些事情
            }
        }).setBulkActions(10000)//达到批量100万请求处理一次
                .setBulkSize(new ByteSizeValue(10, ByteSizeUnit.MB))//达到100M批量处理一次
                .setConcurrentRequests(10)//设置多少个并发处理线程
                .setFlushInterval(TimeValue.timeValueSeconds(30))//设置flush索引周期
                .build();//构建BulkProcessor

        return bulkProcessor;
    }
}
