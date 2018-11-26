package com.qxl.apps.drinks.system.service.impl;

import com.qxl.apps.drinks.system.dao.IWaitDoDao;
import com.qxl.apps.drinks.system.model.DrinksWaitDo;
import com.qxl.apps.drinks.system.service.IWaitDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class WaitDoServiceImpl implements IWaitDoService {
    private final IWaitDoDao waitDoDao;

    @Autowired
    public WaitDoServiceImpl(IWaitDoDao waitDoDao) {
        this.waitDoDao = waitDoDao;
    }

    /**
     * 查询所有待办信息
     *
     * @return 待办信息列表
     */
    @Override
    public List<DrinksWaitDo> getAllWaitDo(String name, String date) throws JpaSystemException {
        return waitDoDao.findAll(new Specification<DrinksWaitDo>() {
            @Nullable
            @Override
            public Predicate toPredicate(Root<DrinksWaitDo> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                if (!"".equals(name)) {
                    predicates.add(criteriaBuilder.like(root.get("businessName"), "%" + name + "%"));
                }
                if (!"".equals(date)) {
                    predicates.add(criteriaBuilder.like(root.get("date"), "%" + date + "%"));
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        });
    }

    /**
     * 查看待办详情
     * @param id 待办id
     * @return 待办实体对象
     */
    @Override
    public DrinksWaitDo showDetail(String id){
        return waitDoDao.getOne(id);
    }
}
