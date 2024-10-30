package com.ecommerce.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.model.Productos;
import com.ecommerce.ecommerce.service.ProductosService;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
@CrossOrigin("*")
public class ControllerProductos {

    private  ProductosService productoService;

    public ControllerProductos(@Autowired ProductosService productoService){
        this.productoService = productoService;
    }

    @GetMapping("/productos")
    public List<Productos> GelAllProdutos() {
        return productoService.getAllProductos();
    }
    

}
