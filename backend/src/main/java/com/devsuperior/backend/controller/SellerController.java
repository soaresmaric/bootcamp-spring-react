package com.devsuperior.backend.controller;

import com.devsuperior.backend.dto.SellerDTO;
import com.devsuperior.backend.entities.Seller;
import com.devsuperior.backend.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sellers")
public class SellerController {

    @Autowired
    private SellerService sellerService;


    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll(){
        List<SellerDTO> sellerDTOS = this.sellerService.findAll();
        return ResponseEntity.ok(sellerDTOS);
    }
}
