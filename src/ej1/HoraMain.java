package ej1;

public class HoraMain {
	
	public static void main(String[] args) {
		HoraExacta hora = new HoraExacta(23, 59, 59);
		hora.inc();
		System.out.println(hora);
	}
}