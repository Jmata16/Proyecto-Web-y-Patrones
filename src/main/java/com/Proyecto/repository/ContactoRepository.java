/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.repository;

import com.Proyecto.entity.Contacto;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jdmat
 */
public interface ContactoRepository extends CrudRepository<Contacto, Long>{
    
}
