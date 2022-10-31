package com.demian.market.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "compras")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_cliente")
    private String idCliente;

    private LocalDateTime fecha;

    @Column(name = "medio_pago")
    private String medioPago;

    private String comentario;

    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false) //Para que no permita crear nuevos clientes a partir de esta relacion
    private Cliente cliente;

    @OneToMany(mappedBy = "producto")
    private List<ComprasProducto> productos;
}
