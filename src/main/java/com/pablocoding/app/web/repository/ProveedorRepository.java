package com.pablocoding.app.web.repository;

import com.pablocoding.app.web.entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long>{

	
	@Query("SELECT p FROM Proveedor p WHERE p.nombre LIKE %?1%")
	public List<Proveedor> filterName(String nombre);
	
	List<Proveedor> findByNombre(String nombre);
	

}
