package com.gustavo.lavanderia.service;



import com.gustavo.lavanderia.models.Item;
import com.gustavo.lavanderia.utils.GenericDao;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class ItemService extends AbstractService<Item> {

    @Inject
    private GenericDao<Item> dao;
    
    @Override
    protected GenericDao<Item> getDao() {
        return dao;
    }
    
}
