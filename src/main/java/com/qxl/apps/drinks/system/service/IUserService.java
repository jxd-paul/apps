package com.qxl.apps.drinks.system.service;

import com.qxl.apps.drinks.system.model.DrinksSysUser;

import java.util.List;

public interface IUserService {
    List<DrinksSysUser> findUser();
}
