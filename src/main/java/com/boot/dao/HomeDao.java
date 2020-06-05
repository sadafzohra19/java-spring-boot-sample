package com.boot.dao;

import java.util.List;
import java.util.Map;

public interface HomeDao {
    public List<Map<String, Object>>  getAllClientsWithoutPagination();

}
