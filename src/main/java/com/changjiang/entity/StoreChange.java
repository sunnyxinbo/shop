package com.changjiang.entity;

import java.util.Date;

public class StoreChange {
    private Integer id;

    private String name;

    private Integer storeTypeId;

    private String address;

    private String phone;

    private String legalName;

    private String legalNamePhone;

    private String state;

    private String desc;

    private Integer storeId;

    private String storeName;

    private Date operateTime;

    private String operator;

    private String newName;

    private String newAddress;

    private String newPhone;

    private String newLegalName;

    private String newLegalNamePhone;

    private String newState;

    private String newDesc;

    private Integer newStoreTypeId;

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

    public Integer getStoreTypeId() {
        return storeTypeId;
    }

    public void setStoreTypeId(Integer storeTypeId) {
        this.storeTypeId = storeTypeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName == null ? null : legalName.trim();
    }

    public String getLegalNamePhone() {
        return legalNamePhone;
    }

    public void setLegalNamePhone(String legalNamePhone) {
        this.legalNamePhone = legalNamePhone == null ? null : legalNamePhone.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName == null ? null : newName.trim();
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress == null ? null : newAddress.trim();
    }

    public String getNewPhone() {
        return newPhone;
    }

    public void setNewPhone(String newPhone) {
        this.newPhone = newPhone == null ? null : newPhone.trim();
    }

    public String getNewLegalName() {
        return newLegalName;
    }

    public void setNewLegalName(String newLegalName) {
        this.newLegalName = newLegalName == null ? null : newLegalName.trim();
    }

    public String getNewLegalNamePhone() {
        return newLegalNamePhone;
    }

    public void setNewLegalNamePhone(String newLegalNamePhone) {
        this.newLegalNamePhone = newLegalNamePhone == null ? null : newLegalNamePhone.trim();
    }

    public String getNewState() {
        return newState;
    }

    public void setNewState(String newState) {
        this.newState = newState == null ? null : newState.trim();
    }

    public String getNewDesc() {
        return newDesc;
    }

    public void setNewDesc(String newDesc) {
        this.newDesc = newDesc == null ? null : newDesc.trim();
    }

    public Integer getNewStoreTypeId() {
        return newStoreTypeId;
    }

    public void setNewStoreTypeId(Integer newStoreTypeId) {
        this.newStoreTypeId = newStoreTypeId;
    }
}