package com.changjiang.controller;

/**
 * Created by a1996_000 on 2017/6/2.
 */

import com.changjiang.entity.OfficialTrade;
import com.changjiang.entity.ProducteType;
import com.changjiang.entity.StoreProducte;
import com.changjiang.service.ProducteTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 产品类型控制层
 */
@Controller
@RequestMapping("/producttype")
public class ProductTypeController {
    @Autowired
    private ProducteTypeService producteTypeService;

    /**
     * 查询所有的产品类型
     * @return
     */
    @RequestMapping(value = "/queryAll")
    public String queryAllProductTypes(){
        List<ProducteType> producteTypes = producteTypeService.selectProducteType();
        if(producteTypes != null && producteTypes.size() > 0){
            for (ProducteType producteType:producteTypes){
                System.out.println(producteType.getName());
            }
        }
        return null;
    }

    /**
     * 通过产品类型查询所有的店面产品以及办公贸易
     * @param
     * @return
     */
    @RequestMapping(value = "/queryproducttype")
    public String queryProductType(){
        int id = 1;
        List<ProducteType> producteTypes = producteTypeService.selectOfficialTradeAndProductByTypeId(id);
        if(producteTypes != null && producteTypes.size() > 0){
            for(ProducteType producteType:producteTypes){
                //办公贸易
                List<OfficialTrade> officialTrades = producteType.getOfficialTrades();
                System.out.print("officialTrades.size() :"  + officialTrades.size());
                for (OfficialTrade officialTrade:officialTrades){
                    System.out.println("officialTrade.getOfficialName() :" + officialTrade.getOfficialName());
                }
                //店面产品
                List<StoreProducte> storeProductes = producteType.getStoreProductes();
                System.out.println("storeProductes.size() :" + storeProductes.size());
                for (StoreProducte storeProducte:storeProductes){
                    System.out.println("storeProducte.getName() :" + storeProducte.getName());
                }
            }
        }
        return null;
    }
    /**
     * 通过产品类型查询所有的店面产品
     * @param
     * @return
     */
    @RequestMapping(value = "/querystoreproduct")
    public String queryStoreProducteByType(){
        int id = 2;
        List<ProducteType> producteTypeList = producteTypeService.selectStoreProductByTypeId(id);
        if (producteTypeList != null && producteTypeList.size() > 0){
            System.out.println(" producteTypeList.size() :" + producteTypeList.size());
            for (ProducteType producteType:producteTypeList){
                System.out.println("producteType.getStoreProductes().size() :" + producteType.getStoreProductes().size());
            }
        }

        return null;
    }
    /**
     * 通过产品类型查询所有的店面产品
     * @param
     * @return
     */
}
