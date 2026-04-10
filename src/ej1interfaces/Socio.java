package ej1interfaces;

public class Socio {
	int id;
	String nombre;
	int edad;
	
	Socio(int id, String nombre, int edad) {
		setId(id);
		setNombre(nombre);
		setEdad(edad);
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	@Override
	public String toString() {
		return "Socio, id: "+id+", nombre: "+nombre+", edad: "+edad;
	}
	
}
