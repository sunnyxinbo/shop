package com.changjiang.entity;

import java.util.Date;

public class WorkStation {
    private Integer id;

    private String name;

    private Integer userId;

    private Date goWorkTime;

    private Date leaveWorkTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getGoWorkTime() {
        return goWorkTime;
    }

    public void setGoWorkTime(Date goWorkTime) {
        this.goWorkTime = goWorkTime;
    }

    public Date getLeaveWorkTime() {
        return leaveWorkTime;
    }

    public void setLeaveWorkTime(Date leaveWorkTime) {
        this.leaveWorkTime = leaveWorkTime;
    }
}