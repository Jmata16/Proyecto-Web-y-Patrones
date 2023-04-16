package com.Proyecto.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/**
 * MyT = Mouse y teclado
 *
 * @author jdmat
 */
@Entity
@Table(name = "mouse_y_teclado")
public class MyT implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre_myt;
    private double precio_myt;
    @ManyToOne
    @JoinColumn(name = "marcas_id")
    private Marca marca;
    
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

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

    public double getPrecio_myt() {
        return precio_myt;
    }

    public void setPrecio_myt(double precio_myt) {
        this.precio_myt = precio_myt;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    

}
