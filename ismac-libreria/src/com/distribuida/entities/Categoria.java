package com.distribuida.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table (name = "categoria")
public class Categoria {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_categoria")
	private int idCategoria;
	@Column(name= "categoria")
	private String categoria1;
	@Column(name= "descripcion")
	private String descripcion;
	
	
	@JoinColumn(name = "id_cliente")
    @ManyToOne(cascade = { CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Categoria  categoria;
	public Categoria() { }

	public Categoria(int idCategoria, String categoria, String descripcion) {
		
		this.idCategoria = idCategoria;
		this.categoria1 = categoria;
		this.descripcion = descripcion;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCategoria() {
		return categoria1;
	}

	public void setCategoria(String categoria) {
		this.categoria1 = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", categoria=" + categoria1 + ", descripcion=" + descripcion
				+ "]";
	}
	
	

}
