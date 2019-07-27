package com.byzoro.yjzhdatastorage.service;


import com.byzoro.yjzhdatastorage.pojo.JsonData;

public interface ConsumerService {
        JsonData getData(String data);
        void insertData(JsonData jsonData);
}
