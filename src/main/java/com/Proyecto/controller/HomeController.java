package com.Proyecto.controller;

import com.Proyecto.entity.Audifono;
import com.Proyecto.entity.Categoria;
import com.Proyecto.entity.Marca;
import com.Proyecto.entity.MyT;
import com.Proyecto.entity.Monitor;
import com.Proyecto.service.MarcaService;
import com.Proyecto.service.AudifonoService;
import com.Proyecto.service.CategoriaService;
import com.Proyecto.service.MonitorService;
import com.Proyecto.service.MyTService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author Pablo Guerrero
 */
@Controller
public class HomeController {
    @Autowired
    CategoriaService categoriaService;
    
    @Autowired
    AudifonoService audifonoService;
    
    @Autowired
    MonitorService monitorService;
    
    @Autowired
    MarcaService marcaService;
    
    @Autowired
    MyTService mytService;
    
    @GetMapping("/shop")
    public String shopScreen(Model model){
        model.addAttribute("categorias",categoriaService.getAllCategoria());
        model.addAttribute("audifonos",audifonoService.getAll());
        model.addAttribute("monitores",monitorService.getAll());
        model.addAttribute("myt",mytService.getAll());
        return "shop";
    }
}
