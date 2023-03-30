package com.Proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author jdmat
 */
@Entity
@Table(name = "audifonos")
public class Audifono implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre_audifono;
    private String precio_audifono;

    @ManyToOne
    @JoinColumn(name = "marcas_id")
    private Marca marca;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

}
