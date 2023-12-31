package com.gestion.empleados.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestion.empleados.entidades.Empleado;
import com.gestion.empleados.repositorios.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService { 
	// estamos agregando la funcionalidad de los metodos

	// inyectamos el repositorio
	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	// para trabajar con transcciones se coloca la anotación 
	@Override
	@Transactional(readOnly = true)
	public List<Empleado> findAll() { // nos pide que haga el catch 
		return (List<Empleado>) empleadoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Empleado> findAll(Pageable pageable) {
		return empleadoRepository.findAll(pageable);
	}

	@Override
	@Transactional
	public void save(Empleado empleado) {
		empleadoRepository.save(empleado);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		empleadoRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Empleado findOne(Long id) {
		return empleadoRepository.findById(id).orElse(null);
	}
	
}
