package com.guc.springmvc.controller;

import com.guc.springmvc.service.WebsiteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author guc
 * @Date 2020/1/15 15:10
 * @Description 获取网站数据
 */
@Controller
public class WebsiteController {
    @Resource(name = "websiteService")
    @Autowired
    private WebsiteServiceImpl websiteServiceImpl;
    public void setWebsiteServiceImpl(WebsiteServiceImpl websiteService){
        this.websiteServiceImpl = websiteService;
    }
    @RequestMapping(value = "/websites",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String getAllWebsites(){
        return websiteServiceImpl.queryAll().toString();
    }

    @RequestMapping(value = "/website/{id}",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String getWebsiteById(@PathVariable String id){
        int idd = Integer.valueOf(id);
        return websiteServiceImpl.queryById(idd).toString();
    }
}
