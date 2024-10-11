package com.example.AtvPratica.service;

import com.example.AtvPratica.DTO.Pedido;
import com.example.AtvPratica.Interfaces.IService;
import com.example.AtvPratica.repository.PedidoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class PedidoService implements IService<Pedido, Integer> {


    @Autowired
    private PedidoRepository pedidoRepository;

    /**
     * Este metodo cria um pedido
     * @param entity
     * @return
     */
    @Override
    public Pedido create(Pedido entity) {
        log.info("PedidoService::create");
        return null;
    }

    /**
     * Este metodo visualiza o pedido
     * @param id
     * @return
     */
    @Override
    public Pedido read(Integer id) {
        log.info("PedidoService::read(id)");
        return null;
    }

    /**
     * Este metodo lista um produto
     * @return
     */
    @Override
    public List<Pedido> read() {
        log.info("PedidoService::read()");
        return List.of();
    }

    /**
     * Este metodo altera um pedido
     * @param id
     * @param entity
     * @return
     */
    @Override
    public Pedido update(Integer id, Pedido entity) {
        log.info("PedidoService::update(id, entity)");
        return null;
    }

    /**
     * Este metodo deleta um pedido
     * @param id
     */
    @Override
    public void delete(Integer id) {
        log.info("PedidoService::(Delete(id)");

    }
}
