package com.changjiang.entity;

import java.io.Serializable;

public class StoreProducte implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -1327746073409455235L;
	private Integer id;
    private String name;
    private String desc;
    private String video;
    private String rawMaterial;
    private Double price;
    private Double specialPrice;
    private Integer officialTrade;
    private Integer type;
    public StoreProducte() {
        super();
    }
    public StoreProducte(Integer id,String name,String desc,String video,String rawMaterial,Double price,Double specialPrice,Integer officialTrade,Integer type) {
        super();
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.video = video;
        this.rawMaterial = rawMaterial;
        this.price = price;
        this.specialPrice = specialPrice;
        this.officialTrade = officialTrade;
        this.type = type;
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

    public String getVideo() {
        return this.video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getRawMaterial() {
        return this.rawMaterial;
    }

    public void setRawMaterial(String rawMaterial) {
        this.rawMaterial = rawMaterial;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSpecialPrice() {
        return this.specialPrice;
    }

    public void setSpecialPrice(Double specialPrice) {
        this.specialPrice = specialPrice;
    }

    public Integer getOfficialTrade() {
        return this.officialTrade;
    }

    public void setOfficialTrade(Integer officialTrade) {
        this.officialTrade = officialTrade;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}
