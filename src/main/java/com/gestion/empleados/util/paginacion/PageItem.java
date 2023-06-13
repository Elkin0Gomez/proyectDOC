package com.gestion.empleados.util.paginacion;

public class PageItem {
	// creamos la paginación
	private int numero;
	private boolean actual;

	//creamos un constructor
	public PageItem(int numero, boolean actual) { // comprobamos en que pagina estamos
		super();
		this.numero = numero;
		this.actual = actual;
	}

	//creamos getters y setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isActual() {
		return actual;
	}

	public void setActual(boolean actual) {
		this.actual = actual;
	}

}
