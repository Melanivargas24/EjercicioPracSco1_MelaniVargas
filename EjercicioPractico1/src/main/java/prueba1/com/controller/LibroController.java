/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1.com.controller;

import prueba1.com.service.LibroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/libro")
public class LibroController {
    
    @Autowired
    private LibroService libro;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var libros = libro.getLibros();
        model.addAttribute("categorias", libros);
        model.addAttribute("totalLibros", libros.size());
        return "/libro/listado";
    }
}
