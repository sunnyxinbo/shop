package com.changjiang.entity;

import java.io.Serializable;

public class User implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -6806345516724103644L;
	private Integer id;
    private String username;
    private String password;
    private Integer roleId;
    private String store;
    private Integer userInformation;
    public User() {
        super();
    }
    public User(Integer id,String username,String password,Integer roleId,String store,Integer userInformation) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.roleId = roleId;
        this.store = store;
        this.userInformation = userInformation;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getStore() {
        return this.store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public Integer getUserInformation() {
        return this.userInformation;
    }

    public void setUserInformation(Integer userInformation) {
        this.userInformation = userInformation;
    }

}
