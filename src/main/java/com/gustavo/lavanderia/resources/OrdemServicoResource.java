package com.gustavo.lavanderia.resources;

import com.gustavo.lavanderia.models.OrdemServico;
import com.gustavo.lavanderia.service.AbstractService;
import com.gustavo.lavanderia.service.OrdemServicoService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/ordens")
public class OrdemServicoResource extends AbstractResource<OrdemServico> {

    @Inject
    private OrdemServicoService service;

    @Override
    protected AbstractService<OrdemServico> getService() {
        return service;
    }

}
