package com.demian.market.persistence;

import com.demian.market.persistence.crud.ProductoCrudRepository;
import com.demian.market.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAllProducts(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getAllByIdCategoria(Integer idCategoria){
        return productoCrudRepository.findByIdCategoria(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(Integer cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }
}
