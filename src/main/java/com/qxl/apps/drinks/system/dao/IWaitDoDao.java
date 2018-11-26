package com.qxl.apps.drinks.system.dao;

import com.qxl.apps.drinks.system.model.DrinksWaitDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IWaitDoDao extends JpaRepository<DrinksWaitDo, String>, JpaSpecificationExecutor<DrinksWaitDo> {
}
