package com.changjiang.entity;

import java.util.Date;

public class WorkstationRecord {
    private Integer id;

    private Integer userId;

    private String userName;

    private String userPhone;

    private Date goWorkTime;

    private Date leaveWorkTime;

    private Integer counterId;

    private Integer sonAreaId;

    private Date workDay;

    private Integer storeId;

    private Integer workStationId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
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

    public Integer getCounterId() {
        return counterId;
    }

    public void setCounterId(Integer counterId) {
        this.counterId = counterId;
    }

    public Integer getSonAreaId() {
        return sonAreaId;
    }

    public void setSonAreaId(Integer sonAreaId) {
        this.sonAreaId = sonAreaId;
    }

    public Date getWorkDay() {
        return workDay;
    }

    public void setWorkDay(Date workDay) {
        this.workDay = workDay;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getWorkStationId() {
        return workStationId;
    }

    public void setWorkStationId(Integer workStationId) {
        this.workStationId = workStationId;
    }
}