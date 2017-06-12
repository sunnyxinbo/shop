package com.changjiang.entity;
public class VipGoups {
    private Integer id;
    private String number;
    private String name;
    private String dbDesc;
    private Integer discount;
    private Integer storeNumber;
    private String state;
    public VipGoups() {
        super();
    }
    public VipGoups(Integer id,String number,String name,String dbDesc,Integer discount,Integer storeNumber,String state) {
        super();
        this.id = id;
        this.number = number;
        this.name = name;
        this.dbDesc = dbDesc;
        this.discount = discount;
        this.storeNumber = storeNumber;
        this.state = state;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDbDesc() {
        return this.dbDesc;
    }

    public void setDbDesc(String dbDesc) {
        this.dbDesc = dbDesc;
    }

    public Integer getDiscount() {
        return this.discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getStoreNumber() {
        return this.storeNumber;
    }

    public void setStoreNumber(Integer storeNumber) {
        this.storeNumber = storeNumber;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
