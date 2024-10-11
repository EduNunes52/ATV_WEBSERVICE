package com.example.AtvPratica.resource;

import com.example.AtvPratica.DTO.Produto;
import com.example.AtvPratica.Interfaces.IResource;
import com.example.AtvPratica.service.ProdutoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/produto")
public class ProdutoResource implements IResource <Produto, Integer> {


    final ProdutoService produtoService;

    public ProdutoResource( ProdutoService produtoService){
        this.produtoService = produtoService;
    }


    @Override
    @PostMapping (
            consumes ={MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Produto creat(@RequestBody Produto entity) {
        log.info("ProdutoResource::creat");
        return null;
    }

    @Override
    @GetMapping (
            value ="/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Produto get(@PathVariable Integer id) {
        log.info("ProdutoResource::get(id)");
        return null;
    }

    @Override
    @GetMapping (produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Produto> get() {
        log.info("ProdutoResource::get()");
        return List.of();
    }

    @Override
    @PutMapping (
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Produto updat(@PathVariable Integer id,
                         @RequestBody Produto entity) {
        log.info("ProdutoResource::update(id, entity)");
        return null;
    }

    @Override
    @DeleteMapping (value = "/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("ProdutoResource::delete(id)");

    }
}
