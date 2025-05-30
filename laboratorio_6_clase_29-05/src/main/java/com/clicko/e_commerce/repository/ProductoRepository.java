package com.clicko.e_commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.clicko.e_commerce.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
