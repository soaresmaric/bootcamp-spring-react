package com.devsuperior.backend.dto;

import com.devsuperior.backend.entities.Seller;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class SellerDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public SellerDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public SellerDTO(Seller entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public SellerDTO() {
    }

}
