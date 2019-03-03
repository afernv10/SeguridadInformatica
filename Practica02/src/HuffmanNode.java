import java.util.ArrayList;

public class HuffmanNode {
	
	private double valor;
	private String posicion;
	
	HuffmanNode left;
	HuffmanNode right;
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String idsPosicion) {
		this.posicion = idsPosicion;
	}
	
	public HuffmanNode getLeft() {
		return left;
	}

	public void setLeft(HuffmanNode left) {
		this.left = left;
	}

	public HuffmanNode getRight() {
		return right;
	}

	public void setRight(HuffmanNode right) {
		this.right = right;
	}

}
