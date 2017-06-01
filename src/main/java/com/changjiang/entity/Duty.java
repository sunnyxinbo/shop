package com.changjiang.entity;
public class Duty {
    private Integer id;
    private String name;
    private String desc;
    private Integer gradeId;
    private Integer storeId;
    private String state;
    public Duty() {
        super();
    }
    public Duty(Integer id,String name,String desc,Integer gradeId,Integer storeId,String state) {
        super();
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.gradeId = gradeId;
        this.storeId = storeId;
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

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getGradeId() {
        return this.gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getStoreId() {
        return this.storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
