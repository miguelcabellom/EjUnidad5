package ej5;

class Rectangulo extends Poligono {
	private double lado1;
	private double lado2;
	
	public Rectangulo(double lado1, double lado2) {
		super(4);
		setLado1(lado1);
		setLado2(lado2);
	}
	
	public Rectangulo() {
		super(2);
		setLado1(1);
		setLado2(1);
	}
	
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getLado1() {
		return lado1;
	}
	void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public double getLado2() {
		return lado2;
	}
	
	@Override
	public double area() {
		return lado1*lado2;
	}
	
	@Override
	public String toString() {
		return "Rectangulo, "+super.toString()+",lado 1: "+lado1+", lado 2:"+lado2;
	}
}
