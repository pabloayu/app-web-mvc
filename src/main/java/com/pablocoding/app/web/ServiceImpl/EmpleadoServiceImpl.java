package com.pablocoding.app.web.ServiceImpl;

import java.util.List;
import com.pablocoding.app.web.entity.Empleado;
import com.pablocoding.app.web.repository.EmpleadoRepository;
import com.pablocoding.app.web.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> listarEmpleados(String dato) {
        if (dato != null) {
            return empleadoRepository.searchData(dato);
        } else {
            return empleadoRepository.findAll();
        }
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado obtenerEmpleado(Long id) {
        return empleadoRepository.findById(id).get();
    }

    @Override
    public Empleado actualizarEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Long id) {
        empleadoRepository.deleteById(id);
    }
}