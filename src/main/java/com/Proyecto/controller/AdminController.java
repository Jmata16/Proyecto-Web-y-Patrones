package com.Proyecto.controller;

import com.Proyecto.entity.Categoria;
import com.Proyecto.service.CategoriaService;
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
public class AdminController {
    @Autowired
    CategoriaService categoriaService;

    @GetMapping("/admin")
    public String admin_home() {
        return "admin_home";
    }

    @GetMapping("/admin/categorias")
    public String getCategorias(Model model) {
        model.addAttribute("categorias", categoriaService.getAllCategoria());
        return "categorias2";
    }

    @GetMapping("/admin/categorias/add")
    public String getCategoriasAdd(Model model) {
        model.addAttribute("categoria", new Categoria());
        return "categoriasAdd";
    }
    
    @PostMapping("/admin/categorias/add")
    public String postCategoriasAdd(@ModelAttribute("categoria") Categoria categoria) {
        categoriaService.addCategoria(categoria);
        return "redirect:/admin/categorias";
    }
    
    @GetMapping("/admin/categorias/borrar/{id}")
    public String borrarCategoria(@PathVariable int id){
        categoriaService.delete(id);
        return "redirect:/admin/categorias";
    }
}
