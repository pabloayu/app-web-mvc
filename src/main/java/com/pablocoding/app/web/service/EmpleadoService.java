package com.pablocoding.app.web.service;

import com.pablocoding.app.web.entity.Empleado;

import java.util.List;

public interface EmpleadoService {

    //metodo que devuelve una lista de empleados de la base de datos
    public List<Empleado> listarEmpleados(String dato);

    //metodo que guarda un empleado en la base de datos
    public Empleado guardarEmpleado(Empleado empleado);

    //metodo para obtener empleado por id
    public Empleado obtenerEmpleado(Long id);

    //metodo para actualizar un empleado
    public Empleado actualizarEmpleado(Empleado empleado);

    //metodo para eliminar un empleado
    public void eliminarEmpleado(Long id);
}
