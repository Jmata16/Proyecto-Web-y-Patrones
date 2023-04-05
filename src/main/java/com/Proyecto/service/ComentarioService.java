/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.service;

import com.Proyecto.entity.Comentario;
import com.Proyecto.repository.ComentarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jdmat
 */
@Service
public class ComentarioService implements IComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;

    @Override
    public List<Comentario> getAll() {
        return (List<Comentario>) comentarioRepository.findAll();
    }

    @Override
    public Comentario getComentarioById(long id) {
        return comentarioRepository.findById(id).orElse(null);
    }

    @Override
    public void saveComentario(Comentario comentario) {
        comentarioRepository.save(comentario);
    }

    @Override
    public void delete(long id) {
        comentarioRepository.deleteById(id);
    }

}
