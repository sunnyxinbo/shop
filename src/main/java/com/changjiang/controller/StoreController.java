package com.changjiang.controller;

import com.changjiang.common.Assist;

/**
 * Created by a1996_000 on 2017/6/2.
 */

import com.changjiang.entity.Store;
import com.changjiang.service.StoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 店面控制层
 */
@Controller
@RequestMapping("/store")
public class StoreController {
    //店面业务层
    @Autowired
    private StoreService storeService;

    /**
     * 查询所有的店面信息
     * @return
     */
    @RequestMapping(value = "/queryAll")
    public String queryAllStores(){
    	Assist assist = new Assist();
        List<Store> stores = storeService.selectStore(assist);
        if(stores != null && stores.size() > 0){
            for(Store store:stores){
                System.out.println(store.getName());
            }
        }
        return "index";
    }
}
