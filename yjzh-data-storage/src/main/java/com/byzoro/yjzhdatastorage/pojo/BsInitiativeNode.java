package com.byzoro.yjzhdatastorage.pojo;

import java.util.Date;

public class BsInitiativeNode {
    private Integer id;

    private String nodeId;

    private String orgId;

    private String subsysId;

    private String intfId;

    private String monList;

    private String testStat;

    private Long domainCheckNum;

    private String statPeriod;

    private Date timeStamp;

    private String dataTag;

    private String nsList;

    public String getNsList() {
        return nsList;
    }

    public void setNsList(String nsList) {
        this.nsList = nsList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getSubsysId() {
        return subsysId;
    }

    public void setSubsysId(String subsysId) {
        this.subsysId = subsysId == null ? null : subsysId.trim();
    }

    public String getIntfId() {
        return intfId;
    }

    public void setIntfId(String intfId) {
        this.intfId = intfId == null ? null : intfId.trim();
    }

    public String getMonList() {
        return monList;
    }

    public void setMonList(String monList) {
        this.monList = monList == null ? null : monList.trim();
    }

    public String getTestStat() {
        return testStat;
    }

    public void setTestStat(String testStat) {
        this.testStat = testStat == null ? null : testStat.trim();
    }

    public Long getDomainCheckNum() {
        return domainCheckNum;
    }

    public void setDomainCheckNum(Long domainCheckNum) {
        this.domainCheckNum = domainCheckNum;
    }

    public String getStatPeriod() {
        return statPeriod;
    }

    public void setStatPeriod(String statPeriod) {
        this.statPeriod = statPeriod == null ? null : statPeriod.trim();
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getDataTag() {
        return dataTag;
    }

    public void setDataTag(String dataTag) {
        this.dataTag = dataTag == null ? null : dataTag.trim();
    }
}