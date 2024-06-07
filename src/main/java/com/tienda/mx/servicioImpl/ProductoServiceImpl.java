package com.tienda.mx.servicioImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.mx.bean.ProductoBean;
import com.tienda.mx.repository.ProductoRepository;
import com.tienda.mx.servicio.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService  {
	@Autowired
	ProductoRepository productoRepo;
	
	public ProductoBean guardarProducto(ProductoBean bean) {
		if (bean !=null) {
			return productoRepo.save(bean);
		}
		else {
			return null;
		}
	}

	public Iterable<ProductoBean> mostrarProductos() {
		// TODO Auto-generated method stub
		
		return productoRepo.findAll();
	}

	@Override
	public Optional<ProductoBean> mostrarProductosPorId(int id) {
		// TODO Auto-generated method stub
		return productoRepo.findById(id);
	}

}
