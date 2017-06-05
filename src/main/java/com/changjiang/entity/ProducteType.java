package com.changjiang.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 产品类型实体类
 */
public class ProducteType implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3274228460939615707L;
	/**
     * 产品类型id
     */
    private Integer id;
    /**
     * 产品类型名称
     */
    private String name;
    /**
     * 产品类型描述
     */
    private String desc;
    /**
     * 使用一个List<OfficialTrade>集合属性表示产品类型拥有的办公贸易
     */
    List<OfficialTrade> officialTrades;
    /**
     * 使用一个List<StoreProducte>集合属性表示产品类型拥有的店面产品
     */
    List<StoreProducte> storeProductes;
    public ProducteType() {
        super();
    }
    public ProducteType(Integer id,String name,String desc) {
        super();
        this.id = id;
        this.name = name;
        this.desc = desc;
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
    public List<OfficialTrade> getOfficialTrades() {
        return officialTrades;
    }

    public void setOfficialTrades(List<OfficialTrade> officialTrades) {
        this.officialTrades = officialTrades;
    }

    public List<StoreProducte> getStoreProductes() {
        return storeProductes;
    }

    public void setStoreProductes(List<StoreProducte> storeProductes) {
        this.storeProductes = storeProductes;
    }

}
