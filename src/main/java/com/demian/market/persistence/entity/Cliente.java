package com.demian.market.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String apellidos;
    private Integer celular;
    private String direccion;

    @Column(name = "correo_electronico")
    private String email;

    @OneToMany(mappedBy = "cliente") //Va el nombre de la variable con el cual se creo en compras
    private List<Compra> compras;
}
