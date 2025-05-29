package com.clicko.e_commerce.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "productos")

public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String nombre;
	private double precio;
}
