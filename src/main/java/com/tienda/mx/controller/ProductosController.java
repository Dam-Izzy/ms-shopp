package com.tienda.mx.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.mx.bean.ProductoBean;
import com.tienda.mx.servicio.ProductoService;
import com.tienda.mx.servicioImpl.ProductoServiceImpl;

@RestController
@RequestMapping("/productos")
public class ProductosController {
	private ProductoService productoService;
	public ProductosController(ProductoServiceImpl productoService) {
		this.productoService =productoService;
	}
	@RequestMapping(value="/inicio", method = RequestMethod.GET)
	public Iterable<ProductoBean> inicio() {
		return productoService.mostrarProductos();
	}
	@RequestMapping( value = "/guardar", method = RequestMethod.POST )
    public ProductoBean guardarProducto(@RequestBody ProductoBean productoBean){
        return productoService.guardarProducto(productoBean);
    }
	
}
