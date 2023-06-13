package com.gestion.empleados.util.paginacion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;

public class PageRender<T> { // T representa un tipo, una clase

	private String url;
	private Page<T> page; // representamos la clase page
	private int totalPaginas;
	private int numElementosPorPagina;
	private int paginaActual;
	private List<PageItem> paginas; //guarda el numero de la pagina, y comprueba con un booleano

	// creamos un constructor
	public PageRender(String url, Page<T> page) {
		this.url = url;
		this.page = page;
		this.paginas = new ArrayList<PageItem>(); //

		
		numElementosPorPagina = 5; // se usa para la paginacion, solo para el recorrido de las paginas
		totalPaginas = page.getTotalPages(); // 
		paginaActual = page.getNumber() + 1;

		int desde, hasta;
		if (totalPaginas <= numElementosPorPagina) { // si hace el if, para mostrar las pginas del front 
			desde = 1;
			hasta = totalPaginas;
		} else {
			if (paginaActual <= numElementosPorPagina / 2) { // hacemos el proceso de fornt en backend
				desde = 1;
				hasta = numElementosPorPagina;
			} else if (paginaActual >= totalPaginas - numElementosPorPagina / 2) {
				desde = totalPaginas - numElementosPorPagina + 1;
				hasta = numElementosPorPagina;
			} else {
				desde = paginaActual - numElementosPorPagina / 2;
				hasta = numElementosPorPagina;
			}
		}

		for (int i = 0; i < hasta; i++) {
			paginas.add(new PageItem(desde + i, paginaActual == desde + i));
		}
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public int getPaginaActual() {
		return paginaActual;
	}

	public void setPaginaActual(int paginaActual) {
		this.paginaActual = paginaActual;
	}

	public List<PageItem> getPaginas() {
		return paginas;
	}

	public void setPaginas(List<PageItem> paginas) {
		this.paginas = paginas;
	}
	
	public boolean isFirst() {
		return page.isFirst();
	}
	
	public boolean isLast() {
		return page.isLast();
    }
	
	public boolean isHasNext() {
		return page.hasNext();
	}
	
	public boolean isHasPrevius() {
		return page.hasPrevious();
	}
}
