package com.byzoro.yjzhdatastorage.entity;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonResolve {
    private String nodeId;

    // TODO: 7/20/2019 topic 52,59
    private List<JSONObject> statList;

    // TODO: 7/20/2019 topic 53
    private List<JSONObject> tldList;

    // TODO: 7/20/2019 topic 54
    private List<JSONObject> rootList;

    private String rootListString;

    // TODO: 7/20/2019 topic 55，56
    private List<JSONObject> monList;

    private String monListString;

    // TODO: 7/20/2019 topic 55(该类型发生的异常信息)
    private List<JSONObject> abnormalInfo;

    // TODO: 7/20/2019 topic 55(拔测统计信息)
    private List<JSONObject> testStat;

    private String testStatString;

    // TODO: 7/20/2019 topic 56 监测列表和基准数据的统计
    private List<JSONObject> dataStat;

    private String dataStatString;

    // TODO: 7/20/2019 topic 60 应急响应节点
    private List<JSONObject> resStat;

    private String resStatString;

    private String timeStamp;

    private String cityId;

    private Integer serverNum;

    private String nodeStatus;

    private String statusMsg;

    private String nodeQps;

    private String date;

    private String statListString;

    private String tldListString;

    private Long queryCnt;

    private Long sucRespCnt;

    private Integer resolveAvgT;

    private Long aQueryCnt;

    private Long aaaaQueryCnt;

    private Double payloadRate;

    private String data;

    private String hashMode;

    private String dataHash;

    private String randVal;

    private String intfId;

    private String statPeriod;

    private Long rcopyRCnt;

    private Long rcopyRAvgT;

    private Long domainCheckNum;

    private Long domainNum;

    private Long tldNum;

    public Long getDomainCheckNum() {
        return domainCheckNum;
    }

    public void setDomainCheckNum(Long domainCheckNum) {
        this.domainCheckNum = domainCheckNum;
    }

    public String getTldListString() {
        return tldListString;
    }

    public void setTldListString(String tldListString) {
        this.tldListString = tldListString;
    }

    public String getStatListString() {
        return statListString;
    }

    public void setStatListString(String statListString) {
        this.statListString = statListString;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }

    public Double getPayloadRate() {
        return payloadRate;
    }

    public void setPayloadRate(Double payloadRate) {
        this.payloadRate = payloadRate;
    }

    public List<JSONObject> getStatList() {
        return statList;
    }

    public void setStatList(List<JSONObject> statList) {
        this.statList = statList;
    }

    public List<JSONObject> getTestStat() {
        return testStat;
    }

    public void setTestStat(List<JSONObject> testStat) {
        this.testStat = testStat;
    }

    public List<JSONObject> getTldList() {
        return tldList;
    }

    public void setTldList(List<JSONObject> tldList) {
        this.tldList = tldList;
    }

    public String getData() {
        return data;
    }

    public List<JSONObject> getRootList() {
        return rootList;
    }

    public void setRootList(List<JSONObject> rootList) {
        this.rootList = rootList;
    }

    public List<JSONObject> getMonList() {
        return monList;
    }

    public void setMonList(List<JSONObject> monList) {
        this.monList = monList;
    }

    public List<JSONObject> getDataStat() {
        return dataStat;
    }

    public void setDataStat(List<JSONObject> dataStat) {
        this.dataStat = dataStat;
    }

    public List<JSONObject> getAbnormalInfo() {
        return abnormalInfo;
    }

    public void setAbnormalInfo(List<JSONObject> abnormalInfo) {
        this.abnormalInfo = abnormalInfo;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHashMode() {
        return hashMode;
    }

    public void setHashMode(String hashMode) {
        this.hashMode = hashMode;
    }

    public String getDataHash() {
        return dataHash;
    }

    public void setDataHash(String dataHash) {
        this.dataHash = dataHash;
    }

    public String getRandVal() {
        return randVal;
    }

    public void setRandVal(String randVal) {
        this.randVal = randVal;
    }

    public String getIntfId() {
        return intfId;
    }

    public void setIntfId(String intfId) {
        this.intfId = intfId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getStatPeriod() {
        return statPeriod;
    }

    public void setStatPeriod(String statPeriod) {
        this.statPeriod = statPeriod;
    }

    public List<JSONObject> getResStat() {
        return resStat;
    }

    public void setResStat(List<JSONObject> resStat) {
        this.resStat = resStat;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public Integer getServerNum() {
        return serverNum;
    }

    public void setServerNum(Integer serverNum) {
        this.serverNum = serverNum;
    }

    public String getNodeStatus() {
        return nodeStatus;
    }

    public void setNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
    }

    public String getNodeQps() {
        return nodeQps;
    }

    public void setNodeQps(String nodeQps) {
        this.nodeQps = nodeQps;
    }

    public Long getQueryCnt() {
        return queryCnt;
    }

    public void setQueryCnt(Long queryCnt) {
        this.queryCnt = queryCnt;
    }

    public Long getSucRespCnt() {
        return sucRespCnt;
    }

    public void setSucRespCnt(Long sucRespCnt) {
        this.sucRespCnt = sucRespCnt;
    }

    public Integer getResolveAvgT() {
        return resolveAvgT;
    }

    public void setResolveAvgT(Integer resolveAvgT) {
        this.resolveAvgT = resolveAvgT;
    }

    public Long getaQueryCnt() {
        return aQueryCnt;
    }

    public void setaQueryCnt(Long aQueryCnt) {
        this.aQueryCnt = aQueryCnt;
    }

    public Long getAaaaQueryCnt() {
        return aaaaQueryCnt;
    }

    public void setAaaaQueryCnt(Long aaaaQueryCnt) {
        this.aaaaQueryCnt = aaaaQueryCnt;
    }

    public String getRootListString() {
        return rootListString;
    }

    public void setRootListString(String rootListString) {
        this.rootListString = rootListString;
    }

    public Long getRcopyRCnt() {
        return rcopyRCnt;
    }

    public void setRcopyRCnt(Long rcopyRCnt) {
        this.rcopyRCnt = rcopyRCnt;
    }

    public Long getRcopyRAvgT() {
        return rcopyRAvgT;
    }

    public void setRcopyRAvgT(Long rcopyRAvgT) {
        this.rcopyRAvgT = rcopyRAvgT;
    }

    public String getMonListString() {
        return monListString;
    }

    public void setMonListString(String monListString) {
        this.monListString = monListString;
    }

    public String getTestStatString() {
        return testStatString;
    }

    public void setTestStatString(String testStatString) {
        this.testStatString = testStatString;
    }

    public String getDataStatString() {
        return dataStatString;
    }

    public void setDataStatString(String dataStatString) {
        this.dataStatString = dataStatString;
    }

    public String getResStatString() {
        return resStatString;
    }

    public void setResStatString(String resStatString) {
        this.resStatString = resStatString;
    }

    public Long getDomainNum() {
        return domainNum;
    }

    public void setDomainNum(Long domainNum) {
        this.domainNum = domainNum;
    }

    public Long getTldNum() {
        return tldNum;
    }

    public void setTldNum(Long tldNum) {
        this.tldNum = tldNum;
    }
}
