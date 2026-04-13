package ej3interfaces;

public class Perro extends AnimalDomestico {
	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	public void sacarPaseo() {
		System.out.println(nombre + " ha salido de paseo");
	}
	
	@Override
	public void hacerRuido() {
		System.out.println("Guau!");
	}
	
	@Override
	public boolean hacerCaso() {
		return Math.random() < 0.9;
	}
}
