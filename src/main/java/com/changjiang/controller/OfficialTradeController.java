package com.changjiang.controller;

import com.changjiang.common.Assist;

/**
 * Created by a1996_000 on 2017/6/2.
 */

import com.changjiang.entity.OfficialTrade;
import com.changjiang.service.OfficialTradeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 办公贸易控制层
 */
@Controller
@RequestMapping("/officialtrade")
public class OfficialTradeController {
    @Autowired
    private OfficialTradeService officialTradeService;
    /**
     * 查询所有的办公贸易信息
     * @return
     */
    @RequestMapping(value = "/queryAll")
    public String queryAll(){
    	Assist assist = new Assist();
        List<OfficialTrade> officialTrades = officialTradeService.selectOfficialTrade(assist);
        System.out.println("officialTrades.size() :" + officialTrades.size());
        if(officialTrades != null && officialTrades.size() > 0){
            for (OfficialTrade officialTrade:officialTrades){
                System.out.println(officialTrade.getOfficialName());
            }
        }
        return "index1";
    }
}
