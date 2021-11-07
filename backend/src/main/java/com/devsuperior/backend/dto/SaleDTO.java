package com.devsuperior.backend.dto;

import com.devsuperior.backend.entities.Seller;

import java.io.Serializable;
import java.time.LocalDate;

public class SaleDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;
    private Seller seller;

    public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
        this.seller = seller;
    }
}
