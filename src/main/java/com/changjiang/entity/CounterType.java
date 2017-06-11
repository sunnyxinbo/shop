package com.changjiang.entity;
public class CounterType {
    private Integer id;
    private String name;
    private String dbDesc;
    private String state;
    public CounterType() {
        super();
    }
    public CounterType(Integer id,String name,String dbDesc,String state) {
        super();
        this.id = id;
        this.name = name;
        this.dbDesc = dbDesc;
        this.state = state;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
