package com.byzoro.yjzhinterface.demo.pojo;

public class Data {

    private String postStr;

    public String getPostStr() {
        return postStr;
    }

    public void setPostStr(String postStr) {
        this.postStr = postStr;
    }

    @Override
    public String toString() {
        return "Data{" +
                "postStr='" + postStr + '\'' +
                '}';
    }
}
