package com.gustavo.lavanderia.resources;

import com.gustavo.lavanderia.models.Item;
import com.gustavo.lavanderia.service.AbstractService;
import com.gustavo.lavanderia.service.ItemService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/itens")
public class ItemResource extends AbstractResource<Item> {

    @Inject
    private ItemService service;

    @Override
    protected AbstractService<Item> getService() {
        return service;
    }

}
