package es.texto;

import java.util.function.BooleanSupplier;

/**
 * Notas rápidas para que el alumnado haga TDD “bien”

Empieza implementando constructores + getters + longitud().

Luego anadirFinal(char) y anadirInicio(char).

Después anadirFinal(String) y anadirInicio(String) con regla “todo o nada” (si no cabe, no modifica).

Finalmente contarVocales().
 */
public class Texto {
	private int maxLongitud;
	private String contenido;


public Texto (int maxLongitud) {
	if (maxLongitud <= 0) {
		throw new IllegalArgumentException("maxLongitud debe ser > 0");
	}
	this.maxLongitud = maxLongitud;
	this.contenido = "";
}

public Texto (String contenido, int maxLongitud) {
	if (contenido == null) {
		throw new IllegalArgumentException("contenidoInicial no puede ser null");
	}
	
	if (maxLongitud <= 0) {
		throw new IllegalArgumentException("maxLongitud debe ser > 0");
	}	
	if (contenido.length() > maxLongitud) {
		throw new IllegalArgumentException("contenidoInicial supera maxLongitud");
	}
	this.maxLongitud = maxLongitud;
	this.contenido = contenido;
}


public String getContenido () {
	return contenido;
}



public boolean anadirInicio(char c) {
	if (longitud() == maxLongitud) {
		return false;
	} else {
		contenido = c + contenido;
		return true;
	}
}

public boolean anadirInicio(String c) {
	if (c == null) {
		throw new IllegalArgumentException("cadena no puede ser null");
	}
	
	if (longitud() + c.length() > maxLongitud) {
		return false;
	} else {
		contenido = c + contenido;
		return true;
	}
}

public int longitud() {

	return contenido.length();
}

public boolean anadirFinal(char c) {
	if (longitud() == maxLongitud) {
		return false;
	} else {
		contenido += c;
		return true;
	}
}

public boolean anadirFinal(String c) {
	if (c == null) {
		throw new IllegalArgumentException("cadena no puede ser null");
	}
	
	if (longitud() + c.length() > maxLongitud) {
		return false;
	} else {
		contenido = contenido + c;
		return true;
	}
}

public String toString() {
	return contenido;
}

public int contarVocales() {
	int contador = 0;
	String vocales = "aeiou";
	for (int i = 0; i < longitud(); i++) {
		if (vocales.indexOf(contenido.toLowerCase().charAt(i)) != -1) {
			contador ++;
		}
		
		
	}
	return contador;
	
}






}