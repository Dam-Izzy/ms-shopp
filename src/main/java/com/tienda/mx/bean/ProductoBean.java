package com.tienda.mx.bean;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class ProductoBean {
	@Id
	private int idProducto;
	
	private String nombre;
	private int cantidad;
	private int codigoInterno;
	private double precio;
	private Date fechaIngreso;
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getCodigoInterno() {
		return codigoInterno;
	}
	public void setCodigoInterno(int codigoInterno) {
		this.codigoInterno = codigoInterno;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
	
}
