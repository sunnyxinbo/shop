package com.changjiang.entity;

import java.io.Serializable;

public class Counter implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6063247701548840457L;
	private Integer id;
    private String name;
    private String desc;
    private Integer type;
    private Integer store;
    private String state;
    private Integer area;
    public Counter() {
        super();
    }
    public Counter(Integer id,String name,String desc,Integer type,Integer store,String state,Integer area) {
        super();
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.type = type;
        this.store = store;
        this.state = state;
        this.area = area;
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

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStore() {
        return this.store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getArea() {
        return this.area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

}
