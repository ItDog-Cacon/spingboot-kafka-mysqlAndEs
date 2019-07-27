package com.byzoro.yjzhdatastorage.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatList {
    private String domian;

    private String domainType;

    private String resolveType;

    public String getDomian() {
        return domian;
    }

    public void setDomian(String domian) {
        this.domian = domian;
    }

    public String getDomainType() {
        return domainType;
    }

    public void setDomainType(String domainType) {
        this.domainType = domainType;
    }

    public String getResolveType() {
        return resolveType;
    }

    public void setResolveType(String resolveType) {
        this.resolveType = resolveType;
    }

    @Override
    public String toString() {
        return "StatList{" +
                "domian='" + domian + '\'' +
                ", domainType='" + domainType + '\'' +
                ", resolveType='" + resolveType + '\'' +
                '}';
    }
}
