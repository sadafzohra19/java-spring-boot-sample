package com.boot.service;

import com.boot.dao.HomeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HomeServiceImpl implements  HomeService{

    @Autowired
    HomeDao homeDao;

    @Override
    public List<Map<String, Object>> getAllClientsWithoutPagination() {
        return homeDao.getAllClientsWithoutPagination();
    }
}
