package com.Proyecto.controller;
import com.Proyecto.entity.MyT;
import com.Proyecto.service.IMyTService;
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
public class MyTController {
  
    @Autowired
    private IMyTService mytService;

    @GetMapping("/myt")
    public String index(Model model) {
        List<MyT> listaMyT = mytService.getAll();
        model.addAttribute("titulo", "Mouse y teclado");
        model.addAttribute("myt", listaMyT);
        return "mouse_y_teclado";
    }  
}
