package com.qxl.apps.drinks.system.dao;

import com.qxl.apps.drinks.system.model.DrinksSysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IUserDao extends JpaRepository<DrinksSysUser,String> {
}
