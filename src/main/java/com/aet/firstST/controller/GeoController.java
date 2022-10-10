package com.aet.firstST.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.aet.firstST.entity.Customer;

/**
 *地理情報 Controller
 */
@Controller
public class GeoController {

    
    @GetMapping(value = "/geo")
    public String test(Model model) {
    	
    	List<Customer> customers = new ArrayList<Customer>();
    	customers.add(new Customer(1 , "Miura", "Kazuyoshi"));
    	customers.add(new Customer(2 , "Kitazawa", "Tsuyoshi"));
    	customers.add(new Customer(3 , "Hashiratani", "Tetsuji"));
    	
    	Customer ct = new Customer();
    	ct.setFirstName("zhang");
    	ct.setLastName("san");
    	ct.setId(4);
    	
    	customers.add(ct);
    	
    	model.addAttribute("customers", customers);
    	model.addAttribute("mag", "地理情報");
    	model.addAttribute("msg", "地理情報地理情報地理情報地理情報");
    	
       return "test/aaa.html";
    }
    
    @GetMapping(value = "/geo2")
    public String test2(Model model) {
    	//访问数据库，取得数据
    	//把数据绑定到变量 变量为网页模板所用
    	//返回网页模板地址
    	return "geo/geo222";
    }
    
    
}