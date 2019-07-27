package com.byzoro.yjzhdatastorage.pojo;

import java.util.Date;

public class BsWarningBusiness {
    private Integer id;

    private String nodeId;

    private String orgId;

    private String subsysId;

    private String intfId;

    private String statList;

    private String statPeriod;

    private Date timeStamp;

    private String dataTag;

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

    public String getStatList() {
        return statList;
    }

    public void setStatList(String statList) {
        this.statList = statList == null ? null : statList.trim();
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