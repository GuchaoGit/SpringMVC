package com.guc.springmvc.dao;

import com.guc.springmvc.entity.Log;
import com.guc.springmvc.entity.Website;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * @Author guc
 * @Date 2020/1/13 14:06
 * @Description 网页操作
 */
public class WebsiteDaoImpl extends JdbcDaoSupport implements WebsiteDao {
    @Override
    public List<Website> queryAll() {
        return this.getJdbcTemplate().query("select * from websites", new BeanPropertyRowMapper<Website>(Website.class));
    }

    @Override
    public Website queryById(int id) {
        return this.getJdbcTemplate().queryForObject("select * from websites where id = ?",new BeanPropertyRowMapper<Website>(Website.class),id);
    }

    @Override
    public List<Log> queryLogBySiteId(int sid) {
        return this.getJdbcTemplate().query("select * from log where site_id = ?", new BeanPropertyRowMapper<Log>(Log.class),sid);
    }
}
