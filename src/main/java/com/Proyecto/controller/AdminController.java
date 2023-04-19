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
public class AdminController {
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
    
    
    /////////  AUDIFONOS/////////////
    
    
    @GetMapping("/admin/productos/audifonos")
    public String getAudifonos(Model model){
        model.addAttribute("audifonos", audifonoService.getAll());
        return "admin_audifonos";
    }
    
    @GetMapping("/admin/productos/audifonos/borrar/{id}")
    public String eliminarAudifono(@PathVariable("id") Long idAudifono){
        audifonoService.delete(idAudifono);
        return "redirect:/admin/productos/audifonos";
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
    
    @PostMapping("/admin/productos/audifonos/save")
    public String guardarAudifono(@ModelAttribute Audifono audifono){
        audifonoService.saveAudifono(audifono);
        return "redirect:/admin/productos/audifonos";
    }
    
    @GetMapping("/admin/productos/audifonos/editar/{id}")
    public String editarAudifonos(@PathVariable("id") Long idAudifono, Model model){
        Audifono audifono = audifonoService.getAudifonoById(idAudifono);
        List<Marca> listaMarcas = marcaService.getAll();
        List<Categoria> listaCategorias=categoriaService.getAllCategoria();
        model.addAttribute("audifono", audifono);
        model.addAttribute("marcas", listaMarcas);
        model.addAttribute("categorias", listaCategorias);
        return "admin_audifonos_add";
    }
    
    
    /////////// MONITORES //////////////////
    
    
    @GetMapping("/admin/productos/monitores")
    public String getMonitores(Model model){
        model.addAttribute("monitores", monitorService.getAll());
        return "admin_monitores";
    }
    
    @GetMapping("/admin/productos/monitores/borrar/{id}")
    public String eliminarMonitor(@PathVariable("id") Long idMonitor){
        monitorService.delete(idMonitor);
        return "redirect:/admin/productos/monitores";
    }
    
    @GetMapping("/admin/productos/monitores/add")
    public String crearMonitor(Model model){
        List<Marca> listaMarcas = marcaService.getAll();
        List<Categoria> listaCategorias=categoriaService.getAllCategoria();
        model.addAttribute("monitor",new Monitor());
        model.addAttribute("marcas", listaMarcas);
        model.addAttribute("categorias", listaCategorias);
        return "admin_monitores_add";
    }
    
    @PostMapping("/admin/productos/monitores/save")
    public String guardarMonitor(@ModelAttribute Monitor monitor){
        monitorService.saveMonitor(monitor);
        return "redirect:/admin/productos/monitores";
    }
    
    @GetMapping("/admin/productos/monitores/editar/{id}")
    public String editarMonitor(@PathVariable("id") Long idMonitor, Model model){
        Monitor monitor = monitorService.getMonitorById(idMonitor);
        List<Marca> listaMarcas = marcaService.getAll();
        List<Categoria> listaCategorias=categoriaService.getAllCategoria();
        model.addAttribute("monitor", monitor);
        model.addAttribute("marcas", listaMarcas);
        model.addAttribute("categorias", listaCategorias);
        return "admin_monitores_add";
    }
    
    
    
    
    /////////// MOUSE Y TECLADO //////////////////
    
    
    @GetMapping("/admin/productos/myt")
    public String getMyT(Model model){
        model.addAttribute("myt", mytService.getAll());
        return "admin_myt";
    }
    
    @GetMapping("/admin/productos/myt/borrar/{id}")
    public String eliminarMyT(@PathVariable("id") Long idMyT){
        mytService.delete(idMyT);
        return "redirect:/admin/productos/myt";
    }
    
    @GetMapping("/admin/productos/myt/add")
    public String crearMyT(Model model){
        List<Marca> listaMarcas = marcaService.getAll();
        List<Categoria> listaCategorias=categoriaService.getAllCategoria();
        model.addAttribute("myt",new MyT());
        model.addAttribute("marcas", listaMarcas);
        model.addAttribute("categorias", listaCategorias);
        return "admin_myt_add";
    }
    
    @PostMapping("/admin/productos/myt/save")
    public String guardarMyT(@ModelAttribute MyT myt){
        mytService.saveMyT(myt);
        return "redirect:/admin/productos/monitores";
    }
    
    @GetMapping("/admin/productos/myt/editar/{id}")
    public String editarMyT(@PathVariable("id") Long idMyT, Model model){
        MyT myt = mytService.getMyTById(idMyT);
        List<Marca> listaMarcas = marcaService.getAll();
        List<Categoria> listaCategorias=categoriaService.getAllCategoria();
        model.addAttribute("myt", myt);
        model.addAttribute("marcas", listaMarcas);
        model.addAttribute("categorias", listaCategorias);
        return "admin_myt_add";
    }
}
