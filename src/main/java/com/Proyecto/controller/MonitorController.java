package com.Proyecto.controller;
import com.Proyecto.entity.Monitor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.Proyecto.service.IMonitorService;

/**
 *
 * @author jdmat
 */
@Controller
public class MonitorController {
    
    @Autowired
    private IMonitorService monitoresService;

    
    @GetMapping("/monitor")
    public String index(Model model) {
        List<Monitor> listaMonitor = monitoresService.getAll();
        model.addAttribute("titulo", "Monitores");
        model.addAttribute("monitores", listaMonitor);
        return "monitores";
    }   

}