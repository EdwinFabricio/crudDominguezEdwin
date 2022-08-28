/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.crudDominguezEdwin.service;

import com.m5a.crudDominguezEdwin.model.ProductDTO;
import com.m5a.crudDominguezEdwin.repository.IProductDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL_USER
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private IProductDao repository;

    @Override
    public ProductDTO crearP(ProductDTO p) {

        return repository.insert(p);

    }

    @Override
    public ProductDTO UpdateP(ProductDTO p) {

        return repository.save(p);

    }

    @Override
    public List<ProductDTO> findAll() {

        return repository.findAll();

    }

    @Override
    public void eliminar(String id) {
        repository.deleteById(id);
    }

}
