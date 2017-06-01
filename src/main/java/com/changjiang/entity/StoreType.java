package com.changjiang.entity;
public class StoreType {
    private Integer id;
    private String storeTypeName;
    private String state;
    private String desc;
    public StoreType() {
        super();
    }
    public StoreType(Integer id,String storeTypeName,String state,String desc) {
        super();
        this.id = id;
        this.storeTypeName = storeTypeName;
        this.state = state;
        this.desc = desc;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoreTypeName() {
        return this.storeTypeName;
    }

    public void setStoreTypeName(String storeTypeName) {
        this.storeTypeName = storeTypeName;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
