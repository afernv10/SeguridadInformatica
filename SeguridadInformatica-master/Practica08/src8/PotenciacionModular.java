package src8;
import java.math.BigInteger;

public class PotenciacionModular {

	public PotenciacionModular() {
		
	}

	public BigInteger calculaPotenciacion(BigInteger a, BigInteger b, BigInteger n) {
		
		BigInteger resultado = BigInteger.valueOf(0);
		BigInteger m = BigInteger.valueOf(1);
		String bBinario = calculaBinario(b);
		String bBinarioInv = "";
		
		for (int i = bBinario.length() - 1; i >= 0; i--) {

			bBinarioInv = bBinarioInv + bBinario.charAt(i);
		}

		for (int i = 0; i < bBinarioInv.length(); i++) {
			if (bBinarioInv.charAt(i) == '0') {
				// El m ser� igual al m anterior
			} else {
				m = m.multiply(a);
				m = m.remainder(n);
			}
			a = a.multiply(a);
			a = a.remainder(n);
		}
		
		return m;
	}

	
	public BigInteger obtenerExponente(BigInteger num, int g){
		
		
		
		return null;
	}
	
	public String calculaBinario(BigInteger numeroDecimal) {
		
		BigInteger temp = numeroDecimal;
		BigInteger zero = BigInteger.valueOf(0);
		BigInteger dos = BigInteger.valueOf(2);
		
		String resultado = "";
		while (temp != zero) {
			if (temp.remainder(dos) == zero) {
				resultado = "0" + resultado;
			} else {
				resultado = "1" + resultado;
			}
			temp = temp.divide(dos);
		}
		return resultado;
	}

}
