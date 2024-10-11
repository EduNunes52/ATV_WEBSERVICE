package com.example.AtvPratica.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.print.attribute.standard.MediaSize;
import javax.print.attribute.standard.PrinterInfo;
import java.security.PrivateKey;

@Data
@Entity
@Getter
@Setter
@Table (name = "PRODUTO")
public class ProdutoModel {


    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String DesPro;

    @Column
    private double DtaProduto;

    @Column
    private double ValProduto;

}
