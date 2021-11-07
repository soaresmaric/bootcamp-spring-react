package com.devsuperior.backend.service;

import com.devsuperior.backend.entities.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleService saleService;

    public List<Sale> findAll(){
        return this.saleService.findAll();
    }
}
