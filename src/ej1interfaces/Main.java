package ej1interfaces;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Socio[] socios = new Socio[] {
			new Socio(3, "Juan", 20),
			new Socio(1, "Alba", 27),
			new Socio(2, "Lucia", 22)
		};
		Arrays.sort(socios);
		System.out.println(Arrays.deepToString(socios));
	}

}
