/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.controller;

import com.Proyecto.entity.Comentario;
import com.Proyecto.service.IComentarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author jdmat
 */
@Controller
public class ComentarioController {

    @Autowired
    private IComentarioService comentariosService;
    
    
    
    @GetMapping("/comentario")
    public String index(Model model) {
        model.addAttribute("comentarios", new Comentario());
        return "comentarios";
    }
    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Comentario comentario) {
        comentariosService.saveComentario(comentario);
        return "redirect:/shop";
    }
    
    
    
    
    
    
    
    
    
    
}
