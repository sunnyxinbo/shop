package com.changjiang.entity;
public class UserInformation {
    private Integer id;
    private String realname;
    private String nickname;
    private String idNumber;
    private String phone;
    private String password;
    private String desc;
    private String sex;
    private String icon;
    private String address;
    private String qq;
    private String wechat;
    private String email;
    private Integer dutyId;
    private Integer departmentId;
    private String state;
    private Integer storeId;
    public UserInformation() {
        super();
    }
    public UserInformation(Integer id,String realname,String nickname,String idNumber,String phone,String password,String desc,String sex,String icon,String address,String qq,String wechat,String email,Integer dutyId,Integer departmentId,String state,Integer storeId) {
        super();
        this.id = id;
        this.realname = realname;
        this.nickname = nickname;
        this.idNumber = idNumber;
        this.phone = phone;
        this.password = password;
        this.desc = desc;
        this.sex = sex;
        this.icon = icon;
        this.address = address;
        this.qq = qq;
        this.wechat = wechat;
        this.email = email;
        this.dutyId = dutyId;
        this.departmentId = departmentId;
        this.state = state;
        this.storeId = storeId;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealname() {
        return this.realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQq() {
        return this.qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return this.wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDutyId() {
        return this.dutyId;
    }

    public void setDutyId(Integer dutyId) {
        this.dutyId = dutyId;
    }

    public Integer getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getStoreId() {
        return this.storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

}
