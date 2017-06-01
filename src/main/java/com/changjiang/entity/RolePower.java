package com.changjiang.entity;
public class RolePower {
    private Integer id;
    private String functionName;
    private Integer roleId;
    private Integer functionId;
    public RolePower() {
        super();
    }
    public RolePower(Integer id,String functionName,Integer roleId,Integer functionId) {
        super();
        this.id = id;
        this.functionName = functionName;
        this.roleId = roleId;
        this.functionId = functionId;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFunctionName() {
        return this.functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getFunctionId() {
        return this.functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

}
