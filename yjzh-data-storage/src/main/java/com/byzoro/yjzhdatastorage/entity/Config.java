package com.byzoro.yjzhdatastorage.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Config {
    @Value("${spring.kafka.bootstrap.servers}")
    private String bootstrapServers;

    @Value("${auto.commit.interval.ms}")
    private String autoCommitIntervalMs;

    @Value("${session.timeout.ms}")
    private String sessionTimeoutMs;

    @Value("${enable.auto.commit}")
    private String enableAutoCommit;

    @Value("${max.poll.records}")
    private String maxPollRecords;

    @Value("${batchConsumer}")
    private Integer batchConsumer;

    @Value("${password}")
    private String password;

    @Value("${authKey}")
    private String authKey;

    @Value("${sqlEnable}")
    private String sqlEnable;

    @Value("${esEnable}")
    private String esEnable;

    public Integer getBatchConsumer() {
        return batchConsumer;
    }

    public void setBatchConsumer(Integer batchConsumer) {
        this.batchConsumer = batchConsumer;
    }

    public String getBootstrapServers() {
        return bootstrapServers;
    }

    public void setBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
    }

    public String getAutoCommitIntervalMs() {
        return autoCommitIntervalMs;
    }

    public void setAutoCommitIntervalMs(String autoCommitIntervalMs) {
        this.autoCommitIntervalMs = autoCommitIntervalMs;
    }

    public String getSessionTimeoutMs() {
        return sessionTimeoutMs;
    }

    public void setSessionTimeoutMs(String sessionTimeoutMs) {
        this.sessionTimeoutMs = sessionTimeoutMs;
    }

    public String getEnableAutoCommit() {
        return enableAutoCommit;
    }

    public void setEnableAutoCommit(String enableAutoCommit) {
        this.enableAutoCommit = enableAutoCommit;
    }

    public String getMaxPollRecords() {
        return maxPollRecords;
    }

    public void setMaxPollRecords(String maxPollRecords) {
        this.maxPollRecords = maxPollRecords;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public String getSqlEnable() {
        return sqlEnable;
    }

    public void setSqlEnable(String sqlEnable) {
        this.sqlEnable = sqlEnable;
    }

    public String getEsEnable() {
        return esEnable;
    }

    public void setEsEnable(String esEnable) {
        this.esEnable = esEnable;
    }
}
