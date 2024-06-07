package com.tienda.mx.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class CarritoBean {
@Id
private int idCarrito;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "idProducto")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

private ProductoBean bean;
private int cantidadProductos;
private double totalCarrito;

public int getIdCarrito() {
	return idCarrito;
}
public void setIdCarrito(int idCarrito) {
	this.idCarrito = idCarrito;
}
public ProductoBean getBean() {
	return bean;
}
public void setBean(ProductoBean bean) {
	this.bean = bean;
}
public int getCantidadProductos() {
	return cantidadProductos;
}
public void setCantidadProductos(int cantidadProductos) {
	this.cantidadProductos = cantidadProductos;
}
public double getTotalCarrito() {
	return totalCarrito;
}
public void setTotalCarrito(double totalCarrito) {
	this.totalCarrito = totalCarrito;
}

}
