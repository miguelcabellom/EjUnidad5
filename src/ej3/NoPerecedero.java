package ej3;

public class NoPerecedero extends Producto {
	protected String tipo;
	
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		setTipo(tipo);
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString()+" No Perecedero, tipo: "+tipo;
	}
}
