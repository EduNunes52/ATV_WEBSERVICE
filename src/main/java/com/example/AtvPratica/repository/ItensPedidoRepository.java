package com.example.AtvPratica.repository;

import com.example.AtvPratica.Model.ItensPedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItensPedidoRepository extends JpaRepository<ItensPedidoModel, Integer> {

}
