package com.clicko.e_commerce.model;

import java.lang.annotation.Inherited;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "carritos")
public class Carrito {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;

	@ManyToMany(mappedBy = "carritos")
	private List<Producto> productos = new ArrayList<>();



}
