package com.changjiang.controller;

/**
 * Created by a1996_000 on 2017/6/2.
 */

import com.changjiang.entity.StoreProducte;
import com.changjiang.service.StoreProducteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 店面产品控制层
 */
@Controller
@RequestMapping("/storeproducte")
public class StoreProducteController {
    @Autowired
    private StoreProducteService storeProducteService;
    /**
     * 查询所有的店面产品
     * @return
     */
    @RequestMapping(value = "/queryall")
    public String queryAll(){
        List<StoreProducte> storeProductes = storeProducteService.selectStoreProducte();
        if (storeProductes != null && storeProductes.size() > 0){
            for (StoreProducte storeProducte : storeProductes){
                System.out.println(storeProducte.getName());
            }
        }
        return null;
    }
}
