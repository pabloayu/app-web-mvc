package com.pablocoding.app.web.ServiceImpl;

import com.pablocoding.app.web.entity.Proveedor;
import com.pablocoding.app.web.repository.ProveedorRepository;
import com.pablocoding.app.web.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServiceImpl implements ProveedorService{
	
	@Autowired
	private ProveedorRepository proveedorRepository;
	
	@Override
	public List<Proveedor> listaProveedor(String dato) {
		if(dato != null) {
			return proveedorRepository.filterName(dato);
		}else {
			return proveedorRepository.findAll();
		}
		
	}

}
