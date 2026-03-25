package ej3;

public class Producto {
	protected String nombre;
	protected double precio;
	
	public Producto(String nombre, double precio) {
		setNombre(nombre);
		setPrecio(precio);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double calcular(int numeroProductos) {
		return precio*numeroProductos;
	}
	
}
