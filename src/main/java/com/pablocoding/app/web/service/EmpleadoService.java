package com.pablocoding.app.web.service;

import com.pablocoding.app.web.entity.Empleado;

import java.util.List;

public interface EmpleadoService {

    //metodo que devuelve una lista de empleados de la base de datos
    public List<Empleado> listarEmpleados();

    //metodo que guarda un empleado en la base de datos
    public Empleado guardarEmpleado(Empleado empleado);
}
