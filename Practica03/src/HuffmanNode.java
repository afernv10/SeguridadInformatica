package src;


public class HuffmanNode {
	
	private double valor;
	private char c;
	private String code;
	private int longitudCode;
	
	HuffmanNode left;
	HuffmanNode right;
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double probs) {
		this.valor = probs;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getLongitudCode() {
		return longitudCode;
	}

	public void setLongitudCode(int longitudCode) {
		this.longitudCode = longitudCode;
	}

}
