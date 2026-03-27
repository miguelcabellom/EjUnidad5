package ej3;

public class Perecedero extends Producto {
	protected int diasCaducar;
	
	public Perecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);
		setDiasCaducar(diasCaducar);
	}

	public int getDiasCaducar() {
		return diasCaducar;
	}
	public void setDiasCaducar(int diasCaducar) {
		this.diasCaducar = diasCaducar;
	}
	
	@Override
	public double calcular(int numeroProductos) {
		double precioFinal = precio*numeroProductos;
		if (diasCaducar == 1) {
			precioFinal /= 4;
		} else if (diasCaducar == 2) {
			precioFinal /= 3;
		} else if (diasCaducar == 3) {
			precioFinal /= 2;
		}
		return precioFinal;
	}

	@Override
	public String toString() {
		return super.toString()+" Perecedero, caduca en "+diasCaducar+" dias";
	}
}
