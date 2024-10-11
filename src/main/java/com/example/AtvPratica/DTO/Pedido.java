package com.example.AtvPratica.DTO;


import lombok.Data;

import java.time.LocalDate;

@Data

public class Pedido {

    private Integer id;

    private long NroPedido;
    
    private LocalDate DatPedido;
}
