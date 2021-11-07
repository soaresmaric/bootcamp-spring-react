package com.devsuperior.backend.service;

import com.devsuperior.backend.dto.SellerDTO;
import com.devsuperior.backend.entities.Seller;
import com.devsuperior.backend.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerDTO> findAll(){
        List<Seller> listSeller = this.sellerRepository.findAll();
        /** Expressão Lambda, funciona para cada x da lista, transforma-la em um objeto de um novo tipo e depois transforma-la
        novamente em uma coleção **/
        return listSeller.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
