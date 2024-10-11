package com.example.AtvPratica.service;

import com.example.AtvPratica.DTO.ItensPedido;
import com.example.AtvPratica.Interfaces.IService;
import com.example.AtvPratica.repository.ItensPedidoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ItensPedidoService implements IService <ItensPedido, Integer> {

    @Autowired
    private ItensPedidoRepository itensPedidoRepository;

    /**
     * Este metodo cria um itens pedido
     * @param entity
     * @return
     */
    @Override
    public ItensPedido create(ItensPedido entity) {
        log.info("ItensPedidoService::create");
        return null;
    }

    /**
     * Este metodo visuliza itens pedido
     * @param id
     * @return
     */
    @Override
    public ItensPedido read(Integer id) {
        log.info("ItensPedidoService::read(id)");
        return null;
    }

    /**
     * Este metodo lista itens pedido
     * @return
     */
    @Override
    public List<ItensPedido> read() {
        log.info("ItensPedidoService::read()");
        return List.of();
    }

    /**
     * Este metodo altera itens pedido
     * @param id
     * @param entity
     * @return
     */
    @Override
    public ItensPedido update(Integer id, ItensPedido entity) {
        log.info("ItensPedidoService::update(id, entity)");
        return null;
    }

    /**
     * Este metodo deleta itens pedido
     * @param id
     */
    @Override
    public void delete(Integer id) {
        log.info("ItensPedidoService::detele(id)");

    }
}
