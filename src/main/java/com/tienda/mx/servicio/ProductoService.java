package com.tienda.mx.servicio;

import java.util.Optional;

import com.tienda.mx.bean.ProductoBean;

public interface ProductoService {
	ProductoBean guardarProducto(ProductoBean bean);
	Iterable<ProductoBean> mostrarProductos();
	Optional<ProductoBean> mostrarProductosPorId(int id);

}
