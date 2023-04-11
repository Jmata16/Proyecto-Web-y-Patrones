package com.Proyecto.service;

/**
 *
 * @author Pablo Guerrero
 */
import com.Proyecto.entity.Usuario;
import java.util.List;

public interface IUsuarioService {
    public List<Usuario> getAllUsuario();
    public Usuario getUsusarioById(long id);
    public void saveUsuario(Usuario usuario);
    public void delete(long id);
    public Usuario findByNombre (String username);
}
