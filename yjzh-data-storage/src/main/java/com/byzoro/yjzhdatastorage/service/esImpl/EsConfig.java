package com.byzoro.yjzhdatastorage.service.esImpl;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Configuration
public class EsConfig {

    /**
     * elk集群地址
     */
    @Value("${elasticsearch.ip}")
    private String hostName;
    /**
     * 端口
     */
    @Value("${elasticsearch.port}")
    private String port;
    /**
     * 集群名称
     */
    @Value("${elasticsearch.cluster.name}")
    private String clusterName;

    /**
     * 连接池
     */
    @Value("${elasticsearch.pool}")
    private String poolSize;

    @Bean
    public TransportClient init() {

        TransportClient transportClient = null;

        try {
            // 配置信息
            Settings esSetting = Settings.builder()
                    .put("cluster.name", clusterName)
                    .put("client.transport.sniff", true)//增加嗅探机制，找到ES集群
                    .put("thread_pool.search.size", Integer.parseInt(poolSize))//增加线程池个数，暂时设为5
                    .build();

//            //配置信息Settings自定义
//            transportClient = new PreBuiltTransportClient(esSetting);
//            TransportAddress transportAddress = new TransportAddress(InetAddress.getByName(hostName), Integer.valueOf(port));
//            transportClient.addTransportAddresses(transportAddress);
            if(transportClient == null){
                synchronized (TransportClient.class){
                    transportClient = new PreBuiltTransportClient(esSetting);
                    try {
                        String[] allHost = hostName.split(",");
                        for (String str:allHost) {
                            TransportAddress transportAddress = new TransportAddress(InetAddress.getByName(hostName), Integer.valueOf(port));
                            transportClient.addTransportAddresses(transportAddress);
                            //transportClient.addTransportAddresses(new TransportAddress(InetAddress.getByName(str), port));
                        }
                    } catch (UnknownHostException e) {
                        e.printStackTrace();
                    }
                }
            }

        } catch (Exception e) {
            //LOGGER.error("elasticsearch TransportClient create error!!!", e);
        }

        return transportClient;
    }
}