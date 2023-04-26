/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.controller;

import com.Proyecto.entity.Contacto;
import com.Proyecto.service.IContactoService;
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
public class ContactoController {
        @Autowired
    private IContactoService contactoService; 
     @GetMapping("/contactos")
    public String index(Model model) {
        model.addAttribute("contacto", new Contacto());
        return "contactos";
    }
    @PostMapping("/saveContacto")
    public String guardarContacto(@ModelAttribute Contacto contacto) {
        contactoService.saveContactos(contacto);
         return "redirect:/contactos";
    }
       @GetMapping("/1verComentarios")
    public String getComentario(Model model) {
        List<Contacto> listaContacto = contactoService.getAll();
        model.addAttribute("titulo", "Contacto");
        model.addAttribute("contacto", listaContacto);
        return "1vercomentarios";
    } 
}
