package ej3interfaces;

public class Gato extends AnimalDomestico {
	public Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}
	
	public void toserBolaPelo() {
		System.out.println(nombre + " ha tosido una bola de pelo");
	}
	
	@Override
	public void hacerRuido() {
		System.out.println("Miau!");
	}
	
	@Override
	public boolean hacerCaso() {
		return Math.random() < 0.05;
	}
}
