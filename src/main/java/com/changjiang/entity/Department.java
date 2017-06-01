package com.changjiang.entity;
public class Department {
    private Integer id;
    private String number;
    private String name;
    private String desc;
    private Integer storeId;
    private String departmentGrade;
    public Department() {
        super();
    }
    public Department(Integer id,String number,String name,String desc,Integer storeId,String departmentGrade) {
        super();
        this.id = id;
        this.number = number;
        this.name = name;
        this.desc = desc;
        this.storeId = storeId;
        this.departmentGrade = departmentGrade;
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

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getStoreId() {
        return this.storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getDepartmentGrade() {
        return this.departmentGrade;
    }

    public void setDepartmentGrade(String departmentGrade) {
        this.departmentGrade = departmentGrade;
    }

}
