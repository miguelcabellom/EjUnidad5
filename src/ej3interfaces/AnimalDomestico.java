package ej3interfaces;

public abstract class AnimalDomestico implements Vivir {
	protected String nombre;
	protected String raza;
	protected double peso;
	protected String color;
	
	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		setNombre(nombre);
		setRaza(raza);
		setPeso(peso);
		setColor(color);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void vacunar() {
		System.out.println(nombre + " vacunado");
	}
	
	public abstract boolean hacerCaso();
	
	@Override
	public void dormir() {
		System.out.println(nombre + " se ha dormido");
	}
	
	@Override
	public void comer() {
		System.out.println(nombre + " ha comido");
	}
	
}
