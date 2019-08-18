package com.byzoro.yjzhdatastorage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.byzoro.yjzhdatastorage.dao.*;
import com.byzoro.yjzhdatastorage.entity.IntfId;
import com.byzoro.yjzhdatastorage.entity.JsonResolve;
import com.byzoro.yjzhdatastorage.pojo.*;
import com.byzoro.yjzhdatastorage.util.StringUtil;
import org.springframework.stereotype.Service;
import com.byzoro.yjzhdatastorage.service.ConsumerService;
import utils.JSONUtils;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Service
public class ComsumerServiceImpl implements ConsumerService {
    @Resource
    private BsNodeStatusMapper bsNodeStatusMapper;
    @Resource
    private BsForceResolveMapper bsForceResolveMapper;
    @Resource
    private BsCacheMapper bsCacheMapper;
    @Resource
    private BsIterationMapper bsIterationMapper;
    @Resource
    private BsInitiativeNodeMapper bsInitiativeNodeMapper;
    @Resource
    private BsPassiveNodeMapper bsPassiveNodeMapper;
    @Resource
    private BsInformationExtractMapper bsInformationExtractMapper;
    @Resource
    private BsMultiCollectNodeMapper bsMultiCollectNodeMapper;
    @Resource
    private BsDatabaseNodeMapper bsDatabaseNodeMapper;
    @Resource
    private BsRecursiveDrMapper bsRecursiveDrMapper;
    @Resource
    private BsIterationDrMapper bsIterationDrMapper;
    @Resource
    private BsEmergencyNodeMapper bsEmergencyNodeMapper;
    @Resource
    private BsUserMapper bsUserMapper;
    @Resource
    private BsWarningBusinessMapper bsWarningBusinessMapper;

    /**
     * @param data :
     * @describe
     * @return com.byzoro.yjzhdatastorage.pojo.JsonData
     * @auther: xiaopang
     * @date: 7/24/2019 11:45 AM
     */
    @Override
    public JsonData getData(String data) {
        JsonData result = null;
        if (StringUtil.checkData(data)) {
            result = StringUtil.getResult(data);
            insertData(result);
        }
        return result;
    }

    /**
     * @param jsonData :
     * @return void
     * @describe 根据topic判断插入数据库接口
     * @auther: xiaopang
     * @date: 7/24/2019 11:42 AM
     */
    @Override
    public void insertData(JsonData jsonData) {
        String intfId = jsonData.getIntfId();
        String data = jsonData.getData();
        JSONObject jsonObject = JSONObject.parseObject(data);
        String timeStamp = null;
        if (jsonObject.get("timeStamp") != null) {
            timeStamp = jsonObject.get("timeStamp").toString();
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+0"));
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf1.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        JsonResolve jsonResolve = null;
        Date date = null;
        String format = null;
        try {
            date = sdf.parse(timeStamp);
            format = sdf1.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        IntfId emum = IntfId.fromTypeName(intfId);
        switch (emum) {
            // TODO: 7/21/2019 节点运行状态51 bs_node_status
            case BsNodeStatusTopic:
                try {
                    jsonResolve = JSONUtils.json2pojo(data, JsonResolve.class);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jsonResolve.setDate(format);
                bsNodeStatusMapper.insertData(jsonData, jsonResolve);
                break;
            // TODO: 7/21/2019 递归节点强制域名统计上报52 bs_force_resolve
            case BsForceResolveTopic:
                try {
                    jsonResolve = JSONUtils.json2pojo(data, JsonResolve.class);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jsonResolve.setDate(format);
                jsonResolve.setStatListString(jsonResolve.getStatList().toString());
                bsForceResolveMapper.insertData(jsonData, jsonResolve);
                break;
            // TODO: 7/21/2019 递归节点缓存测53 bs_cache
            case BsCacheTopic:
                try {
                    jsonResolve = JSONUtils.json2pojo(data, JsonResolve.class);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jsonResolve.setDate(format);
                jsonResolve.setTldListString(jsonResolve.getTldList().toString());
                bsCacheMapper.insertData(jsonResolve, jsonData);
                break;
            // TODO: 7/21/2019 递归节点迭代侧 54 bs_iterationt
            case BsIterationtTopic:
                try {
                    jsonResolve = JSONUtils.json2pojo(data, JsonResolve.class);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jsonResolve.setDate(format);
                jsonResolve.setTldListString(jsonResolve.getTldList().toString());
                jsonResolve.setRootListString(jsonResolve.getRootList().toString());
                bsIterationMapper.insertData(jsonResolve, jsonData);
                break;
            // TODO: 7/20/2019 主动监测节点上报55 bs_initiative_node
            case BsInitiativeNodeTopic:
                try {
                    jsonResolve = JSONUtils.json2pojo(data, JsonResolve.class);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jsonResolve.setDate(format);
                jsonResolve.setMonListString(jsonResolve.getMonList().toString());
                jsonResolve.setTestStatString(jsonResolve.getTestStat().toString());
                jsonResolve.setNsListString(jsonResolve.getNsList().toString());
                bsInitiativeNodeMapper.insertData(jsonData, jsonResolve);
                break;
            // TODO: 7/20/2019 被动监测节点56 bs_passive_node
            case BsPassiveNodeTopic:
                try {
                    jsonResolve = JSONUtils.json2pojo(data, JsonResolve.class);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jsonResolve.setDate(format);
                jsonResolve.setMonListString(jsonResolve.getMonList().toString());
                jsonResolve.setDataStatString(jsonResolve.getDataStat().toString());
                bsPassiveNodeMapper.insertData(jsonData, jsonResolve);
                break;
            // TODO: 7/20/2019 信息提取节点57 bs_information_extract
            case BsInformationExtractTopic:
                try {
                    jsonResolve = JSONUtils.json2pojo(data, JsonResolve.class);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jsonResolve.setDate(format);
                jsonResolve.setDataStatString(jsonResolve.getDataStat().toString());
                bsInformationExtractMapper.insertData(jsonData, jsonResolve);
                break;
            // TODO: 7/20/2019 多源采集节点 58 bs_multi_collect_node
            case BsMultiCollectNodeTopic:
                try {
                    jsonResolve = JSONUtils.json2pojo(data, JsonResolve.class);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jsonResolve.setDate(format);
                jsonResolve.setDataStatString(jsonResolve.getDataStat().toString());
                bsMultiCollectNodeMapper.insertData(jsonData, jsonResolve);
                break;
            // TODO: 7/20/2019 数据节点统计上报59 bs_database_node
            case BsDatabaseNodeTopic:
                try {
                    jsonResolve = JSONUtils.json2pojo(data, JsonResolve.class);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jsonResolve.setDate(format);
                jsonResolve.setStatListString(jsonResolve.getStatList().toString());
                bsDatabaseNodeMapper.insertData(jsonData, jsonResolve);
                break;
            // TODO: 7/20/2019 应急响应节点上报60 bs_emergency_node
            case BsEmergencyNodeTopic:
                try {
                    jsonResolve = JSONUtils.json2pojo(data, JsonResolve.class);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jsonResolve.setDate(format);
                jsonResolve.setResStatString(jsonResolve.getResStat().toString());
                bsEmergencyNodeMapper.insertData(jsonData, jsonResolve);
                break;
            // TODO: 7/21/2019 61 预警分析节点上报 bs_warning_business
            case BsWaringBusinessTopic:
                try {
                    jsonResolve = JSONUtils.json2pojo(data, JsonResolve.class);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jsonResolve.setDate(format);
                jsonResolve.setStatListString(jsonResolve.getStatList().toString());
                bsWarningBusinessMapper.insertData(jsonData, jsonResolve);
                break;

            // TODO: 7/21/2019 用户侧域名解析排行62 bs_user
            case BsUserTopic:
                try {
                    jsonResolve = JSONUtils.json2pojo(data, JsonResolve.class);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jsonResolve.setDate(format);
                jsonResolve.setStatListString(jsonResolve.getStatList().toString());
                bsUserMapper.insertData(jsonData, jsonResolve);
                break;

            // TODO: 7/20/2019 递归节点递归侧顶级域名解析 63 bs_recursive_dr
            case BsRecursiveDrTopic:
                try {
                    jsonResolve = JSONUtils.json2pojo(data, JsonResolve.class);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jsonResolve.setDate(format);
                jsonResolve.setStatListString(jsonResolve.getStatList().toString());
                bsRecursiveDrMapper.insertData(jsonData, jsonResolve);
                break;
            // TODO: 7/21/2019 递归节点迭代侧顶级域名解析64 bs_iteration_dr
            case BsIterationDrTopic:
                try {
                    jsonResolve = JSONUtils.json2pojo(data, JsonResolve.class);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jsonResolve.setDate(format);
                jsonResolve.setStatListString(jsonResolve.getStatList().toString());
                bsIterationDrMapper.insertData(jsonData, jsonResolve);
                break;
        }
    }

}
