/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.service;

import com.Proyecto.entity.Comentario;

import java.util.List;

/**
 *
 * @author jdmat
 */
public interface IComentarioService {

    public List<Comentario> getAll();

    public Comentario getComentarioById(long id);

    public void saveComentario(Comentario comentario);

    public void delete(long id);
}
