package com.ecommerce.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.ecommerce.model.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Integer> {
    @Query(value = "Select * from productos",nativeQuery  = true)
     List<Productos> findAllProductos();
}
