package com.Proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Pablo Guerrero
 */
@Controller
public class OuathSecurityController {
    @GetMapping("/auth")
    public String getRequest(){
        return "shop";
    }
    
}
