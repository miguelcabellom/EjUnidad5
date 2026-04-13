package ej1interfaces;

public class Socio implements Comparable {
	private int id;
	private String nombre;
	private int edad;
	
	public Socio(int id, String nombre, int edad) {
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

	public int compareTo(Object obj){
		int res = 0;
		Socio socio = (Socio) obj;
		if (id < socio.id) {
			res = -1;
		} else if (id > socio.id) {
			res = 1;
		}
		return res;
	}
	
	@Override
	public String toString() {
		return "Socio, id: "+id+", nombre: "+nombre+", edad: "+edad;
	}
	
	
}
