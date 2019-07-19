package com.gustavo.lavanderia.resources;

import com.gustavo.lavanderia.models.Cliente;
import com.gustavo.lavanderia.service.AbstractService;
import com.gustavo.lavanderia.service.ClienteService;


import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/clientes")
public class ClienteResource extends AbstractResource<Cliente> {

    @Inject
    private ClienteService service;

    @Override
    protected AbstractService<Cliente> getService() {
        return service;
    }

}
