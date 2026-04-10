package ej5;

class Triangulo extends Poligono {
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);
		setLado1(lado1);
		setLado2(lado2);
		setLado3(lado3);
	}
	
	public Triangulo() {
		super(3);
		setLado1(1);
		setLado2(1);
		setLado3(1);
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
	void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	public double getLado3() {
		return lado3;
	}
	
	@Override
	public double area() {
		double s = (lado1+lado2+lado3)/2;
		return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
	}
	
	@Override
	public String toString() {
		return "Triangulo, "+super.toString()+",lado 1: "+lado1+", lado 2:"+lado2+", lado 3: "+lado3;
	}
}