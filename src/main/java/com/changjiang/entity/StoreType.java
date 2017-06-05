package com.changjiang.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 店面类型
 */
public class StoreType implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 2966826507075087114L;
	/**
     * 店面类型id
     */
    private Integer id;
    /**
     * 店面类型名称
     */
    private String storeTypeName;
    /**
     * 状态
     */
    private String state;
    /**
     * 描述
     */
    private String desc;
    /**
     * 使用一个List<Store>集合属性表示店面类型拥有的店面
     */
    private List<Store> stores;
    public StoreType() {
        super();
    }
    public StoreType(Integer id,String storeTypeName,String state,String desc) {
        super();
        this.id = id;
        this.storeTypeName = storeTypeName;
        this.state = state;
        this.desc = desc;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoreTypeName() {
        return this.storeTypeName;
    }

    public void setStoreTypeName(String storeTypeName) {
        this.storeTypeName = storeTypeName;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

}
