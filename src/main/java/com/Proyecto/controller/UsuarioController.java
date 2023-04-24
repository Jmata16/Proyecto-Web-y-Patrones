package com.Proyecto.controller;

import org.springframework.stereotype.Controller;

import com.Proyecto.entity.Usuario;
import com.Proyecto.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {
    
    @Autowired
    private IUsuarioService usuarioService;
    
    @GetMapping("/registro")
    public String getRegistro(Model model){
        model.addAttribute("usuario",new Usuario());
        return "registro";
    }
    
    @PostMapping("/registro/save")
    public String guardarUsuario(@ModelAttribute Usuario usuario){
        usuarioService.saveUsuario(usuario);
        return "redirect:/login";
    }
    
        @GetMapping("/admin/usuarios")
    public String index(Model model) {

        List<Usuario> listaUsuarios = usuarioService.getAllUsuario();
        model.addAttribute("titulo", "Tabla De usuarios");
        model.addAttribute("usuarios", listaUsuarios);
        return "admin_Usuarios";
    }
    
    
    
        @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        usuarioService.delete(id);
        return "redirect:/admin/usuarios";
    }

}
