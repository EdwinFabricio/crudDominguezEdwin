/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.m5a.crudDominguezEdwin.service;

import com.m5a.crudDominguezEdwin.model.ProductDTO;
import java.util.List;

/**
 *
 * @author DELL_USER
 */
public interface ProductService {
    
  ProductDTO crearP(ProductDTO p);

    public ProductDTO UpdateP(ProductDTO p);

    public List<ProductDTO> findAll();

    public void eliminar(String id);
    
}
