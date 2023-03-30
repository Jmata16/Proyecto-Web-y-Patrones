package com.Proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * MyT = Mouse y teclado
 *
 * @author jdmat
 */
@Entity
@Table(name = "mouse_y_teclado")
public class MyT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre_myt;
    private String precio_myt;
    @ManyToOne
    @JoinColumn(name = "marcas_id")
    private Marca marca;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre_myt() {
        return nombre_myt;
    }

    public void setNombre_myt(String nombre_myt) {
        this.nombre_myt = nombre_myt;
    }

    public String getPrecio_myt() {
        return precio_myt;
    }

    public void setPrecio_myt(String precio_myt) {
        this.precio_myt = precio_myt;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

}
