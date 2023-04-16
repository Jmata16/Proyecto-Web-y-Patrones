package com.Proyecto.controller;

import com.Proyecto.entity.Audifono;
import com.Proyecto.entity.Categoria;
import com.Proyecto.entity.Marca;
import com.Proyecto.entity.MyT;
import com.Proyecto.entity.Monitor;
import com.Proyecto.service.MarcaService;
import com.Proyecto.service.AudifonoService;
import com.Proyecto.service.CartItemService;
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
import org.springframework.web.bind.annotation.RequestParam;
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
    
    @Autowired
    private CartItemService cartService;
    
    @GetMapping("/shop")
    public String shopScreen(Model model){
        model.addAttribute("categorias",categoriaService.getAllCategoria());
        model.addAttribute("audifonos",audifonoService.getAll());
        model.addAttribute("monitores",monitorService.getAll());
        model.addAttribute("myt",mytService.getAll());
        return "shop";
    }
    
    @GetMapping("shop/monitor/{id}")
    public String mostrarMonitor(@PathVariable("id") Long id, Model model){
        Monitor monitor = monitorService.getMonitorById(id);
        model.addAttribute("monitor", monitor);
        return "monitor_producto";
    }
    
    @GetMapping("shop/audifono/{id}")
    public String mostrarAudifono(@PathVariable("id") Long id, Model model){
        Audifono audifono = audifonoService.getAudifonoById(id);
        model.addAttribute("audifono", audifono);
        return "audifono_producto";
    }
    
    @GetMapping("shop/myt/{id}")
    public String mostrarMyt(@PathVariable("id") Long id, Model model){
        MyT myt = mytService.getMyTById(id);
        model.addAttribute("myt", myt);
        return "myt_producto";
    }
    
    
//    CARRITO DE COMPRAS 
    
    @PostMapping("/add-audifono-to-cart")
    public String addAudifonoToCart(@RequestParam Long audifonoId){
        Audifono audifono = audifonoService.getAudifonoById(audifonoId);
        cartService.addAudifonoToCart(audifono);
        return "redirect:/shop";
    }
}
