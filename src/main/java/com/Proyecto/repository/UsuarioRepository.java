package com.Proyecto.repository;

import com.Proyecto.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pablo Guerrero
 */
@Repository
public interface UsuarioRepository extends CrudRepository <Usuario,Long>{
    Usuario findByNombre (String nombre);
}
