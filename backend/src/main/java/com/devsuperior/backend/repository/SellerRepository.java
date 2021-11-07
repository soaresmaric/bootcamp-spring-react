package com.devsuperior.backend.repository;

import com.devsuperior.backend.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
