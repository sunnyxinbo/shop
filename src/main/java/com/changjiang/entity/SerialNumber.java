package com.changjiang.entity;
public class SerialNumber {
    private Integer id;
    private String lastSerialNum;
    public SerialNumber() {
        super();
    }
    public SerialNumber(Integer id,String lastSerialNum) {
        super();
        this.id = id;
        this.lastSerialNum = lastSerialNum;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastSerialNum() {
        return this.lastSerialNum;
    }

    public void setLastSerialNum(String lastSerialNum) {
        this.lastSerialNum = lastSerialNum;
    }

}
