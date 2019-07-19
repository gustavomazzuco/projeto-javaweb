package com.gustavo.lavanderia.service;

import com.gustavo.lavanderia.models.OrdemServico;
import com.gustavo.lavanderia.utils.GenericDao;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class OrdemServicoService extends AbstractService<OrdemServico> {

	@Inject
	private GenericDao<OrdemServico> dao;

	@Override
	protected GenericDao<OrdemServico> getDao() {
		return dao;
	}
}
