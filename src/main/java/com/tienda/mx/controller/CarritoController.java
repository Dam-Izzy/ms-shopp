package com.tienda.mx.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.mx.bean.CarritoBean;
import com.tienda.mx.bean.ProductoBean;
import com.tienda.mx.bussines.CarritoBussines;
import com.tienda.mx.servicio.CarritoService;
import com.tienda.mx.servicio.ProductoService;
import com.tienda.mx.servicioImpl.CarritoServiceImpl;
import com.tienda.mx.servicioImpl.ProductoServiceImpl;

@RestController
@RequestMapping("/carrito")
public class CarritoController {

	private CarritoService carritoService;
	private ProductoService productoService;
	public CarritoController(CarritoServiceImpl carritoService) {
		this.carritoService =carritoService;
	}
	
	@RequestMapping(value="/resumen", method = RequestMethod.GET)
	public Iterable<CarritoBean> inicio() {
		return carritoService.mostrarProductos();
	}
	@RequestMapping( value = "/agregar", method = RequestMethod.POST )
    public CarritoBean guardarProducto(@RequestBody CarritoBean carritoBean){
	
        return carritoService.guardarCarrito(carritoBean);
    }
	
}
