package ej2interfaces;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Futbolista[] futbolistas = new Futbolista[] {
			new Futbolista(10, "Axel", 12, 1000),
			new Futbolista(1, "Mark", 12, 5),
			new Futbolista(7, "Jude", 12, 900),
			new Futbolista(2, "Kevin", 12, 700),
			new Futbolista(2, "Jordan", 12, 200)
		};
		Arrays.sort(futbolistas);
		System.out.println(Arrays.deepToString(futbolistas));
	}
}