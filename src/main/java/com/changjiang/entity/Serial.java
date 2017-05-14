package com.changjiang.entity;

public class Serial {
    private Integer id;

    private String lastSerialNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastSerialNum() {
        return lastSerialNum;
    }

    public void setLastSerialNum(String lastSerialNum) {
        this.lastSerialNum = lastSerialNum == null ? null : lastSerialNum.trim();
    }
}