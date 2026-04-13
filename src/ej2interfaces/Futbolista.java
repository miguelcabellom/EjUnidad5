package ej2interfaces;

public class Futbolista implements Comparable {
	private int numCamiseta;
	private String nombre;
	private int edad;
	private int numGoles;
	
	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		setNumCamiseta(numCamiseta);
		setNombre(nombre);
		setEdad(edad);
		setNumGoles(numGoles);
	}

	public int getNumCamiseta() {
		return numCamiseta;
	}
	public void setNumCamiseta(int numCamiseta) {
		this.numCamiseta = numCamiseta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getNumGoles() {
		return numGoles;
	}
	public void setNumGoles(int numGoles) {
		this.numGoles = numGoles;
	}
	
	@Override
	public String toString() {
		return "Futbolista: "+nombre+", numero: "+numCamiseta+", edad: "+edad+", goles: "+numGoles;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		Futbolista otroFutbolista = (Futbolista) obj;
		if (numCamiseta == otroFutbolista.numCamiseta && nombre.equals(otroFutbolista.nombre)) iguales = true;
		return iguales;
	}
	
	@Override
	public int compareTo(Object objeto) {
		int res = 0;
		Futbolista otroFutbolista = (Futbolista) objeto;
		if (numCamiseta < otroFutbolista.numCamiseta) {
			res = -1;
		} else if (numCamiseta > otroFutbolista.numCamiseta) {
			res = 1;
		} else {
			res = nombre.compareToIgnoreCase(otroFutbolista.nombre);
		}
		return res;
	}
	
	
	
}
