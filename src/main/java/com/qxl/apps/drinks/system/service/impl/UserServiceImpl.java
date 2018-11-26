package com.qxl.apps.drinks.system.service.impl;

import com.qxl.apps.drinks.system.dao.IUserDao;
import com.qxl.apps.drinks.system.model.DrinksSysUser;
import com.qxl.apps.drinks.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{
    private final IUserDao userDao;

    @Autowired
    public UserServiceImpl(IUserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public List<DrinksSysUser> findUser(){
        return userDao.findAll();
    }
}
