package com.qxl.apps.drinks.system.service;

import com.qxl.apps.drinks.system.model.DrinksWaitDo;

import java.util.List;

public interface IWaitDoService {
    /**
     * 查询所有待办信息
     * @return 待办信息列表
     */
    List<DrinksWaitDo> getAllWaitDo(String name, String date);
    /**
     * 查看待办详情
     * @param id 待办id
     * @return 待办实体对象
     */
    DrinksWaitDo showDetail(String id);
}
