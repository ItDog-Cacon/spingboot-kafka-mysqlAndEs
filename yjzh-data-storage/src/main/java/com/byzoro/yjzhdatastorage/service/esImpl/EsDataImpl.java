package com.byzoro.yjzhdatastorage.service.esImpl;

import com.alibaba.fastjson.JSONObject;
import com.byzoro.yjzhdatastorage.pojo.JsonData;
import com.byzoro.yjzhdatastorage.util.StringUtil;
import com.byzoro.yjzhdatastorage.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class EsDataImpl implements ConsumerService {

    @Autowired
    private EsDataUtils esUtils;

    private static EsDataUtils es;

    @PostConstruct
    public void init() {
        es = this.esUtils;
    }

    @Override
    public JsonData getData(String data) {
        JsonData result = null;
        if(StringUtil.checkData(data)){
            result = StringUtil.getResult(data);
            insertData(result);
        }

        return result;
    }

    @Override
    public void insertData(JsonData jsonData) {
        String intfId = jsonData.getIntfId();
        String subsysId = jsonData.getSubsysId();
        String orgId = jsonData.getOrgId();
        String data = jsonData.getData();

        JSONObject esJsonObject = new JSONObject();
        JSONObject headJsonObject = new JSONObject();
        headJsonObject.put("orgId",intfId);
        headJsonObject.put("subsysId",subsysId);
        headJsonObject.put("intfId",orgId);
        JSONObject bodyJsonObject = JSONObject.parseObject(data);
        //System.out.println("hello body: "+bodyJsonObject);
        esJsonObject.putAll(headJsonObject);
        esJsonObject.putAll(bodyJsonObject);
        //System.out.println("hello es data: "+esJsonObject);
        es.addDataByBulk(esJsonObject, intfId, intfId);
    }
}
