package com.changjiang.entity;
public class ProducteType {
    private Integer id;
    private String name;
    private String desc;
    public ProducteType() {
        super();
    }
    public ProducteType(Integer id,String name,String desc) {
        super();
        this.id = id;
        this.name = name;
        this.desc = desc;
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

}
