package com.devsuperior.backend.controller;

import com.devsuperior.backend.dto.SaleDTO;
import com.devsuperior.backend.dto.SaleSuccessDTO;
import com.devsuperior.backend.dto.SaleSumDTO;
import com.devsuperior.backend.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        Page<SaleDTO> salesDTOS = this.saleService.findAll(pageable);
        return ResponseEntity.ok(salesDTOS);
    }

    @GetMapping(value = "/sum-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
        List<SaleSumDTO> salesSums = this.saleService.amountGroupedBySeller();
        return ResponseEntity.ok(salesSums);
    }
    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller() {
        List<SaleSuccessDTO> salesSums = this.saleService.successGroupedBySeller();
        return ResponseEntity.ok(salesSums);
    }
}
