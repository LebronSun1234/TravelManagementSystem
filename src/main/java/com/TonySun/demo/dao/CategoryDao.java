package com.TonySun.demo.dao;


import com.TonySun.demo.domain.Category;

import java.util.List;

public interface CategoryDao {
    /**
     * 查询所有
     * @return
     */
    public List<Category> findAll();
}
