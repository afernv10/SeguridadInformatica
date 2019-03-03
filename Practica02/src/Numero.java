import java.util.ArrayList;

public class Numero {
	
	private ArrayList<Integer> referencias = new ArrayList<Integer>();
	private double valor;
	private int posicion;
	
	public Numero(double valor, int posicion) {

		this.valor = valor;
	}
	
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public ArrayList<Integer> getReferencias() {
		return referencias;
	}


	public int getPosicion() {
		return posicion;
	}


	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

}
