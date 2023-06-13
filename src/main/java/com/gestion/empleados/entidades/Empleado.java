package com.gestion.empleados.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity // anotacion de que es una entidad de la base de datos
@Table(name = "empleados") // anotacion para decir que es una tabla y el nombre
public class Empleado {

	// CREAMOS LOS VALORES DEL EMPLEADO
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	private String nombre;

	@NotEmpty
	private String apellido;

	@NotEmpty
	@Email
	private String email;

	@NotNull
	private int telefono;

	@NotEmpty
	private String sexo;

	@NotNull
	private double salario;

	@NotNull // no puede haber una fecha nula
	@Temporal(TemporalType.DATE) // se le indica que es una fecha
	@DateTimeFormat(pattern = "yyyy-MM-dd") // se añade el patron de la fecha 
	private Date fecha;

	// SE CREA EL CONSTRUCTOR VACIO
	public Empleado() {
		super();
	}
	// SE CREAN LOS GETTERS Y SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
