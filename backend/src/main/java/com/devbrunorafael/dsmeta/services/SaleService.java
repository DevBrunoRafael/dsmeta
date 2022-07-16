package com.devbrunorafael.dsmeta.services;

import com.devbrunorafael.dsmeta.entities.Sale;
import com.devbrunorafael.dsmeta.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // declara que está classe é um componente do sistema
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales(){
        return repository.findAll();
    }

}
