package com.devsuperior.backend.dto;

import com.devsuperior.backend.entities.Seller;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class SaleSumDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sellerName;
    private double sum;

    public SaleSumDTO(Seller seller, double sum) { // Agrupar os dados por seller, nao pelo atributo
        this.sellerName = seller.getName();
        this.sum = sum;
    }

    public SaleSumDTO() {
    }

}
