package com.devsuperior.backend.service;

import com.devsuperior.backend.dto.SaleDTO;
import com.devsuperior.backend.dto.SaleSuccessDTO;
import com.devsuperior.backend.dto.SaleSumDTO;
import com.devsuperior.backend.entities.Sale;
import com.devsuperior.backend.repository.SaleRepository;
import com.devsuperior.backend.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SellerRepository sellerRepository;


    @Transactional(readOnly = true) // Garantir que toda operação do banco seja resolvida no service e fazer uma operação somente de busca no banco
    public Page<SaleDTO> findAll(Pageable pageable){
        this.sellerRepository.findAll(); // Para armazenar os vendedores em cache e não precisar buscar novamente no banco
        Page<Sale> listSale = this.saleRepository.findAll(pageable);
        return listSale.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller(){
        return this.saleRepository.amountGroupedBySeller();
    }
    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller(){
        return this.saleRepository.successGroupedBySeller();
    }
}
