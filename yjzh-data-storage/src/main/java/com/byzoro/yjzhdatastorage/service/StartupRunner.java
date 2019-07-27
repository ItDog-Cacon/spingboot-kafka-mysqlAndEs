package com.byzoro.yjzhdatastorage.service;

import com.byzoro.yjzhdatastorage.entity.Config;
import com.byzoro.yjzhdatastorage.service.esImpl.EsDataUtils;
import com.byzoro.yjzhdatastorage.service.esImpl.EsMappingDef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Iterator;

@Component
@Order(value = 2)
public class StartupRunner implements CommandLineRunner {

    @Autowired
    private EsDataUtils esUtils;

    @Resource
    private Config config;

    private static EsDataUtils es;

    @PostConstruct
    public void init() {
        es = this.esUtils;
    }
    @Override
    public void run(String... args) throws Exception {

        if(!config.getEsEnable().equalsIgnoreCase("1")){
            System.out.println("Es database not ready, StartupRunner exit!");
            return;
        }
        System.out.println("Create mapping start... ...");
        Iterator<String> it = EsMappingDef.ES_TABLEMAP.keySet().iterator();
        while(it.hasNext()){
            String index = it.next();
            try {
                es.createIndex(index);
            }catch (Exception e){
                System.out.println("Error: create mapping error, please check the connect for elasticsearch");
            }

        }
    }
}
