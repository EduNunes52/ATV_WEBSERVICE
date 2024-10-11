package com.example.AtvPratica.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Data
@Entity
@Table(name = "ITENS_PEDIDO")
public class ItensPedidoModel {

    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private Integer id;

    @Column (name = "QUANTIDADE_ITEM")
    private double QtdDeItem;

    @Column (name = "VALOR_UNIDADE")
    private double ValUnidade;


}
