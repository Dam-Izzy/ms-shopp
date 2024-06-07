package com.tienda.mx.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tienda.mx.bean.CarritoBean;
@Repository
public interface CarritoRepository extends CrudRepository<CarritoBean, Integer> {


}
