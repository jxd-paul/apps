package com.qxl.apps.drinks.system.dao.impl;

import com.qxl.apps.drinks.system.model.DrinksSysUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import javax.annotation.Resource;
import java.util.List;

public class UserDaoImpl extends HibernateDaoSupport{
    /**
     * 定义sessionFactory
     */
    @Resource
    protected SessionFactory sessionFactory;
    /**
     * @return Session
     * @Title: getSession
     * @Description: 获取session
     * @author wanjinyou
     */
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    public List<DrinksSysUser> findUser(){
        StringBuffer hql = new StringBuffer("from DrinksSysUser");
        return getSession().createQuery(hql.toString()).list();
    }

}
