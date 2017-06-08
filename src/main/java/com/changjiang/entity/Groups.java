package com.changjiang.entity;
public class Groups {
    private Integer id;
    private String groupName;
    private String desc;
    public Groups() {
        super();
    }
    public Groups(Integer id,String groupName,String desc) {
        super();
        this.id = id;
        this.groupName = groupName;
        this.desc = desc;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
