/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.m5a.crudDominguezEdwin.repository;

import com.m5a.crudDominguezEdwin.model.ProductDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DELL_USER
 */

@Repository
public interface IProductDao extends MongoRepository<ProductDTO, String>{
    
    
    
    
}
