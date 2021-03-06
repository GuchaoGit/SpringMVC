package com.guc.springmvc.dao;


import com.guc.springmvc.entity.Log;
import com.guc.springmvc.entity.Website;

import java.util.List;

/**
 * @Author guc
 * @Date 2020/1/13 14:00
 * @Description 网页操作
 */
public interface WebsiteDao {

    /**
     * 查询所有
     * @return
     */
    List<Website> queryAll();

    /**
     * 根据id 查询网址
     * @param id id
     * @return Website info
     */
    Website queryById(int id);

    List<Log> queryLogBySiteId(int sid);
}
