package ej4;

class Electrodomestico {
	
	enum consumo {
		A, B, C, D, E, F
	}
	enum colores {
		blanco, negro, rojo, azul, gris
	}
	
	protected double precioBase = 100;
	protected colores color = colores.azul;
	protected consumo consumoEnergetico = consumo.F;
	protected double peso = 5;
	
	Electrodomestico(double precioBase, double peso) {
		setPrecioBase(precioBase);
		setPeso(peso);
	}
	
	Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		setPrecioBase(precioBase);
		comprobarColor(color);
		comprobarConsumoEnergetico(consumoEnergetico);
		setPeso(peso);
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public colores getColor() {
		return color;
	}
	public void setColor(colores color) {
		this.color = color;
	}
	public consumo getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(consumo consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	private void comprobarConsumoEnergetico(char letra) {
		if (letra=='A'||letra=='B'||letra=='C'||letra=='D'||letra=='E'||letra=='F') {
			setConsumoEnergetico(consumo.valueOf(String.valueOf(letra)));
		}
	}
	
	private void comprobarColor(String color) {
		if (color.equals("blanco")||color.equals("negro")||color.equals("rojo")||color.equals("azul")||color.equals("gris")) {
			setColor(colores.valueOf(color));
		}
	}
	
	void precioFinal() {
		switch (consumoEnergetico) {
		case A -> precioBase+=100;
		case B -> precioBase+=80;
		case C -> precioBase+=60;
		case D -> precioBase+=50;
		case E -> precioBase+=30;
		case F -> precioBase+=10;
		}
		
		if (peso>=0&&peso<20) {
			precioBase+=10;
		} else if (peso>=20&&peso<50) {
			precioBase+=50;
		} else if (peso>=50&&peso<80) {
			precioBase+=80;
		} else if (peso>=80) {
			precioBase+=100;
		}
	}
	
}

	
