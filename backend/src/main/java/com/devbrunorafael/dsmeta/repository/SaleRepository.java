package com.devbrunorafael.dsmeta.repository;

import com.devbrunorafael.dsmeta.entities.Sale;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.time.LocalDate;

@Repository
public interface SaleRepository extends JpaRepository <Sale, Long>{
//     relatório das melhores quantias de venda em ordem decrescente em determinado intervalo de tempo
    @Query("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
    Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pageable);

}