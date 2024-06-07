package com.tienda.mx.servicio;

import com.tienda.mx.bean.CarritoBean;

public interface CarritoService {
	CarritoBean guardarCarrito(CarritoBean bean);
	Iterable<CarritoBean> mostrarProductos();
}
