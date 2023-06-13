package com.gestion.empleados.servicio;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gestion.empleados.entidades.Empleado;

public interface EmpleadoService {
	// creamos los metodos

	public List<Empleado> findAll(); // se usa para que busque todos los empleado

	public Page<Empleado> findAll(Pageable pageable); // para la paginación

	public void save(Empleado empleado); // el empleado que vamos a guardar

	public Empleado findOne(Long id); // para agregar el empkeado

	public void delete(Long id);// para borrar los registros 
}
