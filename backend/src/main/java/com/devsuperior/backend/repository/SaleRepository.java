package com.devsuperior.backend.repository;

import com.devsuperior.backend.dto.SaleSuccessDTO;
import com.devsuperior.backend.dto.SaleSumDTO;
import com.devsuperior.backend.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.devsuperior.backend.dto.SaleSumDTO(obj.seller, SUM(obj.amount))" +
            "FROM Sale AS obj GROUP BY obj.seller") // o método faz uma busca através de uma consulta sql (jpql)!!!
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.devsuperior.backend.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))" +
            "FROM Sale AS obj GROUP BY obj.seller") // o método faz uma busca através de uma consulta sql (jpql)!!!
    List<SaleSuccessDTO> successGroupedBySeller();
}
