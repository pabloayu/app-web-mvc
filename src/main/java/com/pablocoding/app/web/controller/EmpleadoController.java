package com.pablocoding.app.web.controller;

import com.pablocoding.app.web.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/trabajadores") //mapeamos la url
    public String index(Model modelo) {
        modelo.addAttribute("trabajadores", empleadoService.listarEmpleados()); //agregamos la lista de empleados al modelo
        return "coche"; //retornamos el nombre de la vista
    }

    @GetMapping("/trabajadores/new")
    public String newEmpleadoForm() {
        return "crear_empleado";
    }
}