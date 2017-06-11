package com.changjiang.entity;

import java.util.List;

public class ProducteType {
    private Integer id;
    private String name;
    private String dbDesc;
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
    public ProducteType(Integer id,String name,String dbDesc) {
        super();
        this.id = id;
        this.name = name;
        this.dbDesc = dbDesc;
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

    public String getDbDesc() {
        return this.dbDesc;
    }

    public void setDbDesc(String dbDesc) {
        this.dbDesc = dbDesc;
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
