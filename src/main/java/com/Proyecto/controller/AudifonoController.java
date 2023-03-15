/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.controller;

import com.Proyecto.entity.Audifono;
import com.Proyecto.service.IAudifonoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author jdmat
 */
@Controller
public class AudifonoController {

    @Autowired
    private IAudifonoService audifonoService;

    @GetMapping("/audifono")
    public String index(Model model) {
        List<Audifono> listaAudifono = audifonoService.getAll();
        model.addAttribute("titulo", "Audifonos");
        model.addAttribute("audifonos", listaAudifono);
        return "audifonos";
    }
}
