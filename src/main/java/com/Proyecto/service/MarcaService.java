package com.Proyecto.service;

import com.Proyecto.entity.Marca;
import com.Proyecto.repository.MarcaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo Guerrero
 */
@Service
public class MarcaService implements IMarcaService {

    @Autowired
    private MarcaRepository marcaRepository;
    
    @Override
    public List<Marca> getAll() {
        return (List<Marca>) marcaRepository.findAll();
    }

    @Override
    public Marca getMarcaById(long id) {
        return marcaRepository.findById(id).orElse(null);
    }

    @Override
    public void saveMarca(Marca marca) {
        marcaRepository.save(marca);
    }

    @Override
    public void delete(long id) {
        marcaRepository.deleteById(id);
    }
}
