package com.devsuperior.backend.repository;

import com.devsuperior.backend.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
