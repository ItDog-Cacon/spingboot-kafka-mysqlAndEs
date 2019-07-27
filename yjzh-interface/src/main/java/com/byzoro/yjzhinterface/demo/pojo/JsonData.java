package com.byzoro.yjzhinterface.demo.pojo;

import java.io.Serializable;

public class JsonData implements Serializable {
    private String uuid;

    private String orgId;

    private String subsysId;

    private String intfId;

    private String intfVer;

    private String timeStamp;

    private String randVal;

    private String pwdHash;

    private String encryptMode;

    private String hashMode;

    private String compressMode;

    private String dataTag;

    private String data;

    private String dataHash;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getSubsysId() {
        return subsysId;
    }

    public void setSubsysId(String subsysId) {
        this.subsysId = subsysId;
    }

    public String getIntfId() {
        return intfId;
    }

    public void setIntfId(String intfId) {
        this.intfId = intfId;
    }

    public String getIntfVer() {
        return intfVer;
    }

    public void setIntfVer(String intfVer) {
        this.intfVer = intfVer;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getRandVal() {
        return randVal;
    }

    public void setRandVal(String randVal) {
        this.randVal = randVal;
    }

    public String getPwdHash() {
        return pwdHash;
    }

    public void setPwdHash(String pwdHash) {
        this.pwdHash = pwdHash;
    }

    public String getEncryptMode() {
        return encryptMode;
    }

    public void setEncryptMode(String encryptMode) {
        this.encryptMode = encryptMode;
    }

    public String getHashMode() {
        return hashMode;
    }

    public void setHashMode(String hashMode) {
        this.hashMode = hashMode;
    }

    public String getCompressMode() {
        return compressMode;
    }

    public void setCompressMode(String compressMode) {
        this.compressMode = compressMode;
    }

    public String getDataTag() {
        return dataTag;
    }

    public void setDataTag(String dataTag) {
        this.dataTag = dataTag;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDataHash() {
        return dataHash;
    }

    public void setDataHash(String dataHash) {
        this.dataHash = dataHash;
    }

    @Override
    public String toString() {
        return "JsonData{" +
                "uuid='" + uuid + '\'' +
                ", orgId='" + orgId + '\'' +
                ", subsysId='" + subsysId + '\'' +
                ", intfId='" + intfId + '\'' +
                ", intfVer='" + intfVer + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", randVal='" + randVal + '\'' +
                ", pwdHash='" + pwdHash + '\'' +
                ", encryptMode='" + encryptMode + '\'' +
                ", hashMode='" + hashMode + '\'' +
                ", compressMode='" + compressMode + '\'' +
                ", dataTag='" + dataTag + '\'' +
                ", data='" + data + '\'' +
                ", dataHash='" + dataHash + '\'' +
                '}';
    }
}
