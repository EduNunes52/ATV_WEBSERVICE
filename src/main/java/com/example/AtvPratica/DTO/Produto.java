package com.example.AtvPratica.DTO;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class Produto {

    private Integer id;

    private String DesPro;

    private double DtaProduto;

    private double ValProduto;
}
