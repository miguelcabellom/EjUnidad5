package ej4;

public class Lavadora extends Electrodomestico {
	private double carga = 5;
	
	public Lavadora(double precio, double peso) {
		super(precio, peso);
	}
	public Lavadora(double precio, String color, char consumo, double peso, double carga) {
		super(precio, color, consumo, peso);
		setCarga(carga);
	}
	
	public double getCarga() {
		return carga;
	}
	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	@Override
	void precioFinal() {
		super.precioFinal();
		if (carga>30) precioBase+=50;
	}
	
}
