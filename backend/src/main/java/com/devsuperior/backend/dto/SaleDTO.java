package com.devsuperior.backend.dto;

import com.devsuperior.backend.entities.Sale;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
public class SaleDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;
    private SellerDTO sellerDTO;

    public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO sellerDTO) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
        this.sellerDTO = sellerDTO;
    }

    public SaleDTO() {
    }

    public SaleDTO(Sale entity) {
        this.id = entity.getId();
        this.visited = entity.getVisited();
        this.deals = entity.getDeals();
        this.amount = entity.getAmount();
        this.date = entity.getDate();
        this.sellerDTO = new SellerDTO(entity.getSeller());
    }
}

