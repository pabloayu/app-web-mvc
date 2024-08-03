package com.pablocoding.app.web.repository;

import com.pablocoding.app.web.entity.Empleado;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}
