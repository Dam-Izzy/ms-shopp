package com.tienda.mx.servicioImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.mx.bean.CarritoBean;
import com.tienda.mx.repository.CarritoRepository;
import com.tienda.mx.servicio.CarritoService;
@Service
public class CarritoServiceImpl implements CarritoService {

	@Autowired
	CarritoRepository reporsitory;
	
	public CarritoBean guardarCarrito(CarritoBean bean) {
		// TODO Auto-generated method stub
		if (bean!=null) {
			return reporsitory.save(bean);

		}
		return null;
	}

	public Iterable<CarritoBean> mostrarProductos() {
		// TODO Auto-generated method stub
		return reporsitory.findAll();
	}

	
}
