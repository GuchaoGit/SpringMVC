package com.guc.springmvc.service;

import com.guc.springmvc.dao.WebsiteDao;
import com.guc.springmvc.entity.Website;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author guc
 * @Date 2020/1/13 14:13
 * @Description 提供数据
 */
@Transactional(propagation= Propagation.REQUIRED , isolation = Isolation.DEFAULT)
@Service("websiteService")
public class WebsiteServiceImpl {
    @Resource(name="websiteDao")
    private WebsiteDao websiteDao;

    public void setWebsiteDao(WebsiteDao websiteDao) {
        this.websiteDao = websiteDao;
    }
    public List<Website> queryAll() {
        List<Website> websites = websiteDao.queryAll();
        for (Website website:websites){
            website.setLogs(websiteDao.queryLogBySiteId(website.getId()));
        }
        return websites;
    }

    public Website queryById(int id) {
        Website website = websiteDao.queryById(id);
        website.setLogs(websiteDao.queryLogBySiteId(website.getId()));
        return website;
    }
}
