package com.TonySun.demo.service.impl;

import com.TonySun.demo.dao.FavoriteDao;
import com.TonySun.demo.dao.impl.FavoriteDaoImpl;
import com.TonySun.demo.domain.Favorite;
import com.TonySun.demo.service.FavoriteService;

public class FavoriteServiceImpl implements FavoriteService {

    private FavoriteDao favoriteDao = new FavoriteDaoImpl();

    @Override
    public boolean isFavorite(String rid, int uid) {

        Favorite favorite = favoriteDao.findByRidAndUid(Integer.parseInt(rid), uid);

        return favorite != null;//如果对象有值，则为true，反之，则为false
    }

    @Override
    public void add(String rid, int uid) {
        favoriteDao.add(Integer.parseInt(rid),uid);
    }
}
