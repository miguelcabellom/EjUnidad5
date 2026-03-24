package ej1;

public class Hora {
	protected int hora;
	protected int minuto;
	
	public Hora(int hora, int minuto) {
		if (!setHora(hora)) setHora(0);
		if (!setMinuto(minuto)) setMinuto(0);
	}

	public int getHora() {
		return hora;
	}
	public boolean setHora(int hora) {
		boolean posible = false;
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
			posible = true;
		}
		return posible;
	}
	public int getMinuto() {
		return minuto;
	}
	public boolean setMinuto(int minuto) {
		boolean posible = false;
		if (minuto >= 0 && minuto < 60) {
			this.minuto = minuto;
			posible = true;
		}
		return posible;
	}
	
	public void inc() {
		minuto++;
		this.verificarHora();
	}
	
	public void verificarHora() {
		if (minuto >= 60) {
			minuto = 0;
			hora++;
			if (hora >= 24) {
				hora = 0;
			}
		}
	}

	@Override
	public String toString() {
		String stringHora = "";
		String stringMinuto = ":";
		if (hora < 10) stringHora += "0";
		if (minuto < 10) stringMinuto += "0";
		return stringHora+hora+stringMinuto+minuto;
	}
}
