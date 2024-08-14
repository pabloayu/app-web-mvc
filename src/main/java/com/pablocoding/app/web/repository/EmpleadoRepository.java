package com.pablocoding.app.web.repository;

import com.pablocoding.app.web.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    @Query("SELECT e FROM Empleado e WHERE CONCAT(e.nombre,e.apellido,e.email,e.telefono) LIKE %?1%")
    public List<Empleado> searchData(String datoBuscado);
}


