public class Letra {
	
	private char letra;
	private int frecuencia;
	private double probabilidad;
	
	

	public Letra(char l) {
		
		this.letra = l;
		this.frecuencia = 1;
		this.probabilidad = 0.0;
	}

	
	public int getFrecuencia() {
		return frecuencia;
	}


	public void setFrecuencia(int frecuencia) {
		this.frecuencia += frecuencia;
	}


	public double getProbabilidad() {
		return probabilidad;
	}


	public void setProbabilidad(double probabilidad) {
		this.probabilidad = probabilidad;
	}

	public char getLetra() {
		return letra;
	}


	public void setLetra(char letra) {
		this.letra = letra;
	}


	@Override
	public String toString() {
		return letra+"";
	}
}
