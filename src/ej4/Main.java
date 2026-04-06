package ej4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
		
		electrodomesticos.add(new Lavadora(300, "blanco", 'C', 45, 10));
		electrodomesticos.add(new Television(400, "azul", 'B', 10, 35, false));
		electrodomesticos.add(new Television(400, "rojo", 'A', 15, 45, true));
		
		System.out.println("PRECIOS BASE");
		System.out.println(electrodomesticos.get(0).getPrecioBase());
		System.out.println(electrodomesticos.get(1).getPrecioBase());
		System.out.println(electrodomesticos.get(2).getPrecioBase());
		System.out.println("===============");
		
		precioTotal(electrodomesticos);

	}

	public static void precioTotal(ArrayList<Electrodomestico> electrodomesticos) {
		System.out.println("PRECIOS FINALES");
		double precioTotal = 0;
		double precioTotalTVs = 0;
		double precioTotalLavadoras = 0;
		for (Electrodomestico electrodomestico : electrodomesticos) {
			electrodomestico.precioFinal();
			System.out.println(electrodomestico.getPrecioBase());
			if (electrodomestico instanceof Television) {
				precioTotalTVs += electrodomestico.getPrecioBase();
			} else if (electrodomestico instanceof Lavadora) {
				precioTotalLavadoras += electrodomestico.getPrecioBase();
			}
			precioTotal += electrodomestico.getPrecioBase();
		}
		System.out.println("Precio Total Televisores: " + precioTotalTVs);
		System.out.println("Precio Total Lavadoras: " + precioTotalLavadoras);
		System.out.println("Precio Total: " + precioTotal);
	}
}
