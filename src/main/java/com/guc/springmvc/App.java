package com.guc.springmvc;

import com.guc.springmvc.entity.Website;
import com.guc.springmvc.service.WebsiteServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author guc
 * @Date 2020/1/14 13:45
 * @Description 程序入口
 */
public class App {
    private static ApplicationContext context;
    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("springmvc-config.xml");
        WebsiteServiceImpl service = context.getBean("websiteService", WebsiteServiceImpl.class);

        List<Website> websites = service.queryAll();
        System.out.println("所有网站");
        if (websites!=null){
            for (Website a:websites){
                System.out.println(a);
            }
        }
    }
}
