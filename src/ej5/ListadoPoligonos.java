package ej5;

import java.util.ArrayList;

public class ListadoPoligonos {
	private ArrayList<Poligono> listadoPoligonos;
	
	public ListadoPoligonos() {
		listadoPoligonos = new ArrayList<>();
	}
	
	public void agregarTriangulo(double lado1, double lado2, double lado3) {
		listadoPoligonos.add(new Triangulo(lado1, lado2, lado3));
	}
	
	public void agregarRectangulo(double lado1, double lado2) {
		listadoPoligonos.add(new Rectangulo(lado1, lado2));
	}
	
	public void mostrarPoligonos() {
		for (Poligono poligono : listadoPoligonos) {
			System.out.println(poligono);
			System.out.println("Area: " + poligono.area());
			System.out.println("");
		}
	}
}
