package com.tienda.mx.bussines;

import com.tienda.mx.bean.CarritoBean;
import com.tienda.mx.bean.ProductoBean;

public class CarritoBussines {

	
	public static double obtenerTotalCarrito( CarritoBean bean, ProductoBean producto) {
		bean.setTotalCarrito(bean.getCantidadProductos()* producto.getPrecio());
		return bean.getTotalCarrito();
	}
}
