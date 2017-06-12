package com.changjiang.controller;

import com.changjiang.common.Assist;
import com.changjiang.entity.SerialNumber;
import com.changjiang.service.SerialNumberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 
 * @author a1996_000
 * 流水号
 */
@Controller
@RequestMapping("/serialnumber")
public class SerialNumberController {
	@Autowired
	private SerialNumberService serialNumberService;

    /**
     * 查询所有的流水号
     * @return
     */
	@RequestMapping(value = "/querySerialNumber")
    public String queryAllSerialNumbers() {
		Assist assisit  = new Assist();
        List<SerialNumber> serialNumbers =  serialNumberService.selectSerialNumber(assisit);
        if(serialNumbers != null && serialNumbers.size() > 0){
            for(SerialNumber serialNumber : serialNumbers){
                System.out.println("流水号是  ：" + serialNumber.getLastSerialNum() + "流水号id是 ：" + serialNumber.getId());
            }
        }
       return "index";
    }
}
