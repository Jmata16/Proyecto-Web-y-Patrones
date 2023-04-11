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
    
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    

}
