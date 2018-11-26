package com.qxl.apps.drinks.system.dao.impl;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class WaitDoDaoImpl {
    @Query
    public void getAll(){


    }
}
