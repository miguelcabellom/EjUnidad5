package ej5;

abstract class Poligono {
	protected int numLados;
	
	protected Poligono(int numLados) {
		setNumLados(numLados);
	}
	
	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}
	public int getNumLados() {
		return numLados;
	}
	
	public abstract double area();
	
	@Override
	public String toString() {
		return "numero de lados: "+numLados;
	}
}
