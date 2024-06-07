package com.tienda.mx.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tienda.mx.bean.ProductoBean;
@Repository
public interface ProductoRepository extends CrudRepository<ProductoBean, Integer> {


}
