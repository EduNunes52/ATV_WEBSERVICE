package com.example.AtvPratica.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDate;

@Getter
@Setter

@Data
@Entity
@Table(name = "PEDIDO")
public class PedidoModel {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    @Column (name = "NUMERO_PEDIDO")
    private long NroPedido;

    @Column ( name = "DATA_PEDIDO")
    private LocalDate DatPedido;

}
