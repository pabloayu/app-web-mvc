package com.pablocoding.app.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.pablocoding.app.web.entity.Testeo;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PruebaController {

    @GetMapping("/circulo")
    public String prueba(Model modelo) {
        List<Testeo> Listaza = new ArrayList<Testeo>();
        Testeo objtesteo = new Testeo();
        objtesteo.setId(1);
        objtesteo.setNombre("Semenazo");
        Testeo objtesteo2 = new Testeo();
        objtesteo2.setId(2);
        objtesteo2.setNombre("Pajazo");
        Listaza.add(objtesteo);
        Listaza.add(objtesteo2);

        modelo.addAttribute("key", Listaza);
        return "coche";
    }
}
