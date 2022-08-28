/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5a.crudDominguezEdwin.controller;

import com.m5a.crudDominguezEdwin.model.ProductDTO;
import com.m5a.crudDominguezEdwin.repository.IProductDao;
import com.m5a.crudDominguezEdwin.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DELL_USER
 */
@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
    RequestMethod.DELETE})
@RequestMapping("/api/products")
public class ProductController {
    
    @Autowired
    private ProductService productoService;
    
    
    //crear productos
    @PostMapping("/product")
    public ProductDTO create(@Validated @RequestBody ProductDTO p) {
        return productoService.crearP(p);
    }
    //listar 
    @GetMapping("/")
    public List<ProductDTO> readAll() {
        return productoService.findAll();
    }
    
    //modificar un producto
    @PutMapping("/product/{id}")
    public ProductDTO update(@PathVariable String id, @Validated @RequestBody ProductDTO p) {
        return productoService.UpdateP(p);
    }
    
    
    //eliminar un producto
    @DeleteMapping("/product/{id}")
    public void delete(@PathVariable String id) {
        productoService.eliminar(id);
    }
    
}
