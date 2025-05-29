package com.clicko.e_commerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clicko.e_commerce.repository.ProductoRepository;
import com.clicko.e_commerce.model.Producto;
import java.util.List;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductoService {
	private final ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> getTodosProductos() {
        return this.productoRepository.findAll();
    }

    public Producto getProductoPorId(Long id) {
        return this.productoRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Producto no encontrado con el id:" + id)
        );
    }

    public Producto guardarProducto(Producto producto) {
        return this.productoRepository.save(producto);
    }

    public Producto actualizarProducto(Producto producto) {
        if (this.productoRepository.existsById(producto.getId())) {
            return this.productoRepository.save(producto);
        }
        return null;
    }
}
