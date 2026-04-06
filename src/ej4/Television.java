package ej4;

public class Television extends Electrodomestico {
	private double resolucion = 20;
	private boolean sintonizadorTDT = false;
	
	Television(double precio, double peso) {
		super(precio, peso);
	}
	
	Television(double precio, String color, char consumo, double peso, double resolucion, boolean sintonizadorTDT) {
		super(precio, color, consumo, peso);
		setResolucion(resolucion);
		setSintonizadorTDT(sintonizadorTDT);
	}

	public double getResolucion() {
		return resolucion;
	}
	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	@Override
	void precioFinal() {
		super.precioFinal();
		if (resolucion>40) precioBase*=1.3;
		if (sintonizadorTDT) precioBase+=50;
	}
	
}
