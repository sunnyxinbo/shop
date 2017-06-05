package com.changjiang.entity;

import java.io.Serializable;

public class CounterType implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -6395202289958497595L;
	private Integer id;
    private String name;
    private String desc;
    private String state;
    public CounterType() {
        super();
    }
    public CounterType(Integer id,String name,String desc,String state) {
        super();
        this.id = id;
        this.name = name;
        this.desc = desc;
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

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
