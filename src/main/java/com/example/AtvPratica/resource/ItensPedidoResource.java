package com.example.AtvPratica.resource;


import com.example.AtvPratica.DTO.ItensPedido;
import com.example.AtvPratica.Interfaces.IResource;
import com.example.AtvPratica.service.ItensPedidoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping
@RestController (value = "/api/vi/ItensPedido")
public class ItensPedidoResource implements IResource <ItensPedido, Integer> {


    @Autowired
    private ItensPedidoService itensPedidoService;

    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )

    public ItensPedido creat(@RequestBody ItensPedido entity) {
        log.info("ItensPedidoResource::creat");
        return null;
    }

    @Override
    @GetMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ItensPedido get(Integer id) {
        log.info("ItensPedidoResource::get(id)");
        return null;
    }

    @Override
    @GetMapping ( produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ItensPedido> get() {
        log.info("PedidoResource::get()");
        return List.of();
    }

    @Override
    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ItensPedido updat(@PathVariable Integer id,
                             @RequestBody ItensPedido entity) {
        log.info("PedidoResource::updat(id, entity");
        return null;
    }

    @Override
    @DeleteMapping (value = "/{id}")
    public void delete(Integer id) {
        log.info("PedidoResource::delete(id)");
    }
}
