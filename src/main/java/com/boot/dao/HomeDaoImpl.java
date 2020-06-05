package com.boot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Repository
public class HomeDaoImpl  extends JdbcDaoSupport implements  HomeDao{

    @Autowired
    DataSource ds;

    @PostConstruct
    public void initialize() {
        setDataSource(ds);
    }

    @Override
    public List<Map<String, Object>>  getAllClientsWithoutPagination() {

        String sql = "select id, email, is_enable, created_on, first_name, last_name from client order by id";
        return getJdbcTemplate().queryForList("Select * from client");
    }
}
