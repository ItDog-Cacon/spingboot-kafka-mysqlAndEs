package com.byzoro.yjzhdatastorage.pojo;

import java.util.Date;

public class BsDomainWarning {
    private Integer id;

    private String orgId;

    private String subsysId;

    private String intfId;

    private String alertUuid;

    private String alertDomain;

    private String domainType;

    private String alertOperate;

    private String alertTtl;

    private String alertTag;

    private String domainTag;

    private String alertTatus;

    private Date alertTime;

    private String alertInfo;

    private String statPeriod;

    private Date timeStamp;

    private String dataPag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getAlertUuid() {
        return alertUuid;
    }

    public void setAlertUuid(String alertUuid) {
        this.alertUuid = alertUuid == null ? null : alertUuid.trim();
    }

    public String getAlertDomain() {
        return alertDomain;
    }

    public void setAlertDomain(String alertDomain) {
        this.alertDomain = alertDomain == null ? null : alertDomain.trim();
    }

    public String getDomainType() {
        return domainType;
    }

    public void setDomainType(String domainType) {
        this.domainType = domainType == null ? null : domainType.trim();
    }

    public String getAlertOperate() {
        return alertOperate;
    }

    public void setAlertOperate(String alertOperate) {
        this.alertOperate = alertOperate == null ? null : alertOperate.trim();
    }

    public String getAlertTtl() {
        return alertTtl;
    }

    public void setAlertTtl(String alertTtl) {
        this.alertTtl = alertTtl == null ? null : alertTtl.trim();
    }

    public String getAlertTag() {
        return alertTag;
    }

    public void setAlertTag(String alertTag) {
        this.alertTag = alertTag == null ? null : alertTag.trim();
    }

    public String getDomainTag() {
        return domainTag;
    }

    public void setDomainTag(String domainTag) {
        this.domainTag = domainTag == null ? null : domainTag.trim();
    }

    public String getAlertTatus() {
        return alertTatus;
    }

    public void setAlertTatus(String alertTatus) {
        this.alertTatus = alertTatus == null ? null : alertTatus.trim();
    }

    public Date getAlertTime() {
        return alertTime;
    }

    public void setAlertTime(Date alertTime) {
        this.alertTime = alertTime;
    }

    public String getAlertInfo() {
        return alertInfo;
    }

    public void setAlertInfo(String alertInfo) {
        this.alertInfo = alertInfo == null ? null : alertInfo.trim();
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

    public String getDataPag() {
        return dataPag;
    }

    public void setDataPag(String dataPag) {
        this.dataPag = dataPag == null ? null : dataPag.trim();
    }
}