package com.Proyecto.service;

import com.Proyecto.entity.Categoria;
import java.util.List;

/**
 *
 * @author Pablo Guerrero
 */
public interface ICategoriaService {
    public List<Categoria> getAllCategoria();
    public Categoria getCategoriaById(long id);
    public void saveCategoria(Categoria categoria);
    public void delete(long id);
    public Categoria findByNombre (String nombre);
}
