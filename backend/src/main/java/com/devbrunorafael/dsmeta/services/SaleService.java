package com.devbrunorafael.dsmeta.services;

import com.devbrunorafael.dsmeta.entities.Sale;
import com.devbrunorafael.dsmeta.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

@Service // declara que está classe é um componente do sistema
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales(String minDate, String maxDate){

        LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
        LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
        LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);

        return this.repository.findSales(min, max);
    }

}