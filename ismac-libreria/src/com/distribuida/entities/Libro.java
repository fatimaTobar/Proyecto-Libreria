package com.distribuida.entities;

import java.util.Date;

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
@Table(name= "libro")
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_libro")
	//id_libro,titulo,editorial,num_paginas,edicion,idioma,fecha_publicacion,descripcion,tipo_pasta,ISBN,num_ejemplares,portada,presentacion,precio,id_categoria,id_autor:
	private int idLibro;
    @Column(name="id_libro")
	private String titulo;
    @Column(name="titulo")
	private String editorial;
    @Column(name="editorial")
	private int numPaginas;
    @Column(name="numPaginas")
	private String edicion;
    @Column(name="edicion")
	private String idioma;
    @Column(name="idioma")
	private Date fechaPublicacion;
    @Column(name="fechaPublicacion")
	private String descripcion;
    @Column(name="descripcion")
	private String id_Libro;
    @Column(name="idlibro")
	private String iSBN;
    @Column(name="iSBN")
	private int numEjemplares;
    @Column(name="numEjemplares")
	private String portada;
    @Column(name="portada")
	private String presentacion;
    @Column(name="presentacion")
	private double precio;
    @Column(name="precio")

	private Categoria categoria; //private int idCategoria;
	private Autor autor;         //private int id_autor
	
	
	@JoinColumn(name = "id_")
    @ManyToOne(cascade = { CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Libro libro;
	private String tipoPasta;
	
	
	public Libro() {}

	public Libro(int idLibro, String titulo, String editorial, int numPaginas, String edicion, String idioma,
			Date fechaPublicacion, String descripcion, String tipoPasta, String iSBN, int numEjemplares, String portada,
			String presentacion, double precio ){
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.editorial = editorial;
		this.numPaginas = numPaginas;
		this.edicion = edicion;
		this.idioma = idioma;
		this.fechaPublicacion = fechaPublicacion;
		this.descripcion = descripcion;
		this.tipoPasta = tipoPasta;
		this.iSBN = iSBN;
		this.numEjemplares = numEjemplares;
		this.portada = portada;
		this.presentacion = presentacion;
		this.precio = precio;
		//this.categoria = categoria;
		//this.autor = autor;
	}


	public int getIdLibro() {
		return idLibro;
	}


	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public int getNumPaginas() {
		return numPaginas;
	}


	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}


	public String getEdicion() {
		return edicion;
	}


	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}


	public String getIdioma() {
		return idioma;
	}


	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}


	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}


	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getTipoPasta() {
		return tipoPasta;
	}


	public void setTipoPasta(String tipoPasta) {
		this.tipoPasta = tipoPasta;
	}


	public String getiSBN() {
		return iSBN;
	}


	public void setiSBN(String iSBN) {
		this.iSBN = iSBN;
	}


	public int getNumEjemplares() {
		return numEjemplares;
	}


	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}


	public String getPortada() {
		return portada;
	}


	public void setPortada(String portada) {
		this.portada = portada;
	}


	public String getPresentacion() {
		return presentacion;
	}


	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titulo=" + titulo + ", editorial=" + editorial + ", numPaginas="
				+ numPaginas + ", edicion=" + edicion + ", idioma=" + idioma + ", fechaPublicacion=" + fechaPublicacion
				+ ", descripcion=" + descripcion + ", tipoPasta=" + tipoPasta + ", iSBN=" + iSBN + ", numEjemplares="
				+ numEjemplares + ", portada=" + portada + ", presentacion=" + presentacion + ", precio=" + precio
				+ ", categoria=" + categoria + ", autor=" + autor + "]";
	}
	

}
