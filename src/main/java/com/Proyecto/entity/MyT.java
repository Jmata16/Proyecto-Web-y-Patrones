package com.Proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private String marca_myt;
    private String nombre_myt;
    private String precio_myt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca_myt() {
        return marca_myt;
    }

    public void setMarca_myt(String marca_myt) {
        this.marca_myt = marca_myt;
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

}
