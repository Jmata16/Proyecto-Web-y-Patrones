/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.service;

import com.Proyecto.entity.Usuario;
import com.Proyecto.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo Guerrero
 */
@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    public List<Usuario> getAllUsuario() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Usuario getUsusarioById(long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void delete(long id) {
        usuarioRepository.deleteById(id);
    }
    
    @Override
    public Usuario findByNombre(String username) {
        return usuarioRepository.findByNombre(username);
    }
    
    
}
