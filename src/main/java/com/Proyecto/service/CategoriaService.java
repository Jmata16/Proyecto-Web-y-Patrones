package com.Proyecto.service;

import com.Proyecto.entity.Categoria;
import com.Proyecto.repository.CategoriaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo Guerrero
 */
@Service
public class CategoriaService implements ICategoriaService{
    @Autowired
    
    private CategoriaRepository categoriaRepository;
    
    @Override
    public List<Categoria> getAllCategoria(){
        return (List<Categoria>) categoriaRepository.findAll();
    }
    
    public void addCategoria(Categoria categoria){
        categoriaRepository.save(categoria);
    }

    @Override
    public Categoria getCategoriaById(long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @Override
    public void saveCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @Override
    public void delete(long id) {
        categoriaRepository.deleteById(id);
    }

    @Override
    public Categoria findByNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
