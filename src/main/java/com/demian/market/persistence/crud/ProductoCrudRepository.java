package com.demian.market.persistence.crud;

import com.demian.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> findByIdCategoria(Integer idCategoria);
    List<Producto> findByIdCategoriaOrderByNombreAsc(Integer idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(Integer cantidadStock, Boolean estado);


    /*TODO: Forma nativa de hacer consultas*/
    @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    List<Producto> findByCategoria(Integer idCategoria);


}
