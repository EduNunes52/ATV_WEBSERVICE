package com.example.AtvPratica.service;

import com.example.AtvPratica.DTO.Produto;
import com.example.AtvPratica.Interfaces.IService;
import com.example.AtvPratica.repository.ProdutoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProdutoService implements IService<Produto, Integer> {

    @Autowired
    private ProdutoRepository produtoRepository;

    /**
     * Este metodo cria um produto
     * @param entity
     * @return
     */
    @Override
    public Produto create(Produto entity) {
        log.info("ProdutoService::create");
        return null;
    }

    /**
     * Este metodo visualiza o produto
     * @param id
     * @return
     */
    @Override
    public Produto read(Integer id) {
        log.info("ProdutoService::read(id)");
        return null;
    }

    /**
     * Este metodo lista um produto
     * @return
     */
    @Override
    public List<Produto> read() {
        log.info("ProdutoService::read()");
        return List.of();
    }

    /**
     * Este metodo altera um produto
     * @param id
     * @param entity
     * @return
     */
    @Override
    public Produto update(Integer id, Produto entity) {
        log.info("ProdutoService::update(id, entity");
        return null;
    }

    /**
     * Este metodo deleta um produto
     * @param id
     */
    @Override
    public void delete(Integer id) {
        log.info("ProdutoService::Delete(id)");

    }
}
