package com.Proyecto.service;

import com.Proyecto.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo Guerrero
 */
@Service
public class UserService implements UserDetailsService{
    
    @Autowired
    public IUsuarioService usuarioService;
    
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        Usuario usuario = this.usuarioService.findByNombre(username);
        Userprincipal userPrincipal = new Userprincipal(usuario);
        return userPrincipal;
    }
}
