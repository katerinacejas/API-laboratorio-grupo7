package com.clicko.e_commerce.model;

import java.lang.annotation.Inherited;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "categorias")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;

    @ManyToMany(mappedBy = "categorias")
    private List<Producto> productos = new ArrayList<>();



}
