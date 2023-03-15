/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author jdmat
 */

@Entity
@Table(name = "audifonos")
public class Audifono {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String marca_audifono;
    private String nombre_audifono;
    private String precio_audifono;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca_audifono() {
        return marca_audifono;
    }

    public void setMarca_audifono(String marca_audifono) {
        this.marca_audifono = marca_audifono;
    }

    public String getNombre_audifono() {
        return nombre_audifono;
    }

    public void setNombre_audifono(String nombre_audifono) {
        this.nombre_audifono = nombre_audifono;
    }

    public String getPrecio_audifono() {
        return precio_audifono;
    }

    public void setPrecio_audifono(String precio_audifono) {
        this.precio_audifono = precio_audifono;
    }
    
    
}
