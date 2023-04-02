package com.Proyecto.controller;

import com.Proyecto.entity.Audifono;
import com.Proyecto.entity.Categoria;
import com.Proyecto.entity.Marca;
import com.Proyecto.service.MarcaService;
import com.Proyecto.service.AudifonoService;
import com.Proyecto.service.CategoriaService;
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
public class AdminController {
    @Autowired
    CategoriaService categoriaService;
    
    @Autowired
    AudifonoService audifonoService;
    
    @Autowired
    MarcaService marcaService;

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
    
    @GetMapping("/admin/productos")
    public String productos_home(){
        return "productos";
    }
    
    @GetMapping("/admin/productos/audifonos")
    public String getAudifonos(Model model){
        model.addAttribute("audifonos", audifonoService.getAll());
        return "admin_audifonos";
    }
    
    @GetMapping("/admin/productos/audifonos/delete{id}")
    public String eliminarAudifono(@PathVariable("id") Long idAudifono){
        audifonoService.delete(idAudifono);
        return "redirect:/persona";
    }
    
    @GetMapping("/admin/productos/audifonos/add")
    public String crearAudifono(Model model){
        List<Marca> listaMarcas = marcaService.getAll();
        List<Categoria> listaCategorias=categoriaService.getAllCategoria();
        model.addAttribute("audifono",new Audifono());
        model.addAttribute("marcas", listaMarcas);
        model.addAttribute("categorias", listaCategorias);
        return "admin_audifonos_add";
    }
    
}
