package ej1;

public class HoraExacta extends Hora {
	int segundo;
	
	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		if (!setSegundo(segundo)) setSegundo(0);
	}

	public int getSegundo() {
		return segundo;
	}
	public boolean setSegundo(int segundo) {
		boolean posible = false;
		if (segundo >= 0 && segundo < 60) {
			this.segundo = segundo;
			posible = true;
		}
		return posible;
	}
	
	public void verificarSegundos() {
		if (segundo >= 60) {
			segundo = 0;
			super.inc();
		}
	}
	
	@Override
	public void inc() {
		segundo++;
		verificarSegundos();
	}

	@Override
	public String toString() {
		String stringSegundo = ":";
		if (segundo < 10) stringSegundo += "0";
		return super.toString()+stringSegundo+segundo;
	}
	
	
	
	
}
