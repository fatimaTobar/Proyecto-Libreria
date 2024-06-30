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
@Table(name="factura_detalle")
public class FacturaDetalle {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_factura_detalle")
	private int FacturaDetalle;
	@Column(name = "facturaDetalle")
	private int cantidad;
	@Column(name = "cantidad")
	private double subtotal;
	@Column(name = "subtotal")

	
	private Factura factura1; //private int idFactura;
	private Libro libro1;     //private int idLibro;
	
	@JoinColumn(name = "id_factura")
    @ManyToOne(cascade = { CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Factura factura;
	
	@JoinColumn(name = "id_Libro")
    @ManyToOne(cascade = { CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Libro libro;
	private int idFacturaDetalle;
	
	public FacturaDetalle() {}
	
	public FacturaDetalle(int idFacturaDetalle, int cantidad, double subtotal) {
		this.idFacturaDetalle = idFacturaDetalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		//this.factura = factura;
		//this.libro = libro;
	}

	public int getIdFacturaDetalle() {
		return idFacturaDetalle;
	}

	public void setIdFacturaDetalle(int idFacturaDetalle) {
		this.idFacturaDetalle = idFacturaDetalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public Factura getFactura() {
		return factura1;
	}

	public void setFactura(Factura factura) {
		this.factura1 = factura;
	}

	public Libro getLibro() {
		return libro1;
	}

	public void setLibro(Libro libro) {
		this.libro1 = libro;
	}

	@Override
	public String toString() {
		return "FacturaDetalle [idFacturaDetalle=" + idFacturaDetalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", factura=" + factura1 + ", libro=" + libro1 + "]";
	}
	
	
	
	
}
