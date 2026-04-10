package ej5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ListadoPoligonos poligonos = new ListadoPoligonos();
		int eleccion;
		do {
			mostrarMenu();
			eleccion = obtenerEleccion();
			eleccion(poligonos, eleccion);
		} while (eleccion != 4);
		scanner.close();
	}
	
	public static void mostrarMenu() {
		System.out.println("MENU DE POLIGONOS");
		System.out.println("=================");
		System.out.println("1. Introducir Triangulo");
		System.out.println("2. Introducir Rectangulo");
		System.out.println("3. Mostrar Poligonos");
		System.out.println("4. Salir");
	}
	
	public static int obtenerEleccion() {
		int eleccion = 0;
		boolean eleccionValida = false;
		do {
			try {
				eleccion = scanner.nextInt();
				if (eleccion > 0 && eleccion <= 4) {
					eleccionValida = true;
				} else {
					System.out.println("Eleccion Invalida");
				}
			} catch (InputMismatchException e) {
				System.out.println("Eleccion Invalida");
			}
		} while (!eleccionValida);
		return eleccion;
	}
	
	public static void eleccion(ListadoPoligonos poligonos, int eleccion) {
		switch (eleccion) {
			case 1 -> {
				double[] lados = new double[3];
				boolean trianguloValido = false;
				do {
					lados = obtenerLados(3);
					if (existeTriangulo(lados[0], lados[1], lados[2]))
						trianguloValido = true;
					else
						System.out.println("El triangulo no existe");
				} while (!trianguloValido);
				poligonos.agregarTriangulo(lados[0], lados[1], lados[2]);
			}
			case 2 -> {
				double[] lados = new double[2];
				lados = obtenerLados(2);
				poligonos.agregarRectangulo(lados[0], lados[1]);
			}
			case 3 -> {
				poligonos.mostrarPoligonos();
			}
			case 4 -> {
				System.out.println("FINALIZANDO PROGRAMA");
			}
		}
	}
	
	public static double[] obtenerLados(int numLados) {
		double[] lados = new double[numLados];
		for (int i = 0; i < lados.length; i++) {
			boolean ladoValido = false;
			System.out.println("Introduce el lado "+(i+1));
			do {
				try {
					double ladoActual = scanner.nextDouble();
					if (ladoActual <= 0) {
						System.out.println("Lado invalido, intente de nuevo");
					} else {
						lados[i] = ladoActual;
						ladoValido = true;
					}
				} catch (InputMismatchException e) {
					System.out.println("Lado invalido, intente de nuevo");
				}
			} while (!ladoValido);
		}
		return lados;
	}
	
	public static boolean existeTriangulo(double lado1, double lado2, double lado3) {
		boolean existe = false;
		if (lado1+lado2>lado3 && lado2+lado3>lado1 && lado1+lado3>lado2) existe = true;
		return existe;
	}
}
