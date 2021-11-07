package com.devsuperior.backend.dto;

import com.devsuperior.backend.entities.Seller;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class SaleSuccessDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSuccessDTO(Seller seller, Long visited, Long deals) { // Agrupar os dados por seller, nao pelo atributo
        this.sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;

    }

    public SaleSuccessDTO() {
    }
}
