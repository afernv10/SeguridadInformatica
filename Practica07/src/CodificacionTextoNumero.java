package src;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class CodificacionTextoNumero {
	String alf="aábcdeéfghiíjklmnñoópqrstuúvwxyzAÁBCDEÉFGHIÍJKLMNÑOÓPQRSTUÚVWXYZ0123456789 ,.:-()";
			
	List<BigInteger> listaPosiciones = new ArrayList<BigInteger>();
	List<BigInteger> listaRestos = new ArrayList<BigInteger>();

	public CodificacionTextoNumero() {

	}

	// DE TEXTO A NUMERO
	public BigInteger decodificacionTexto(String texto) {
		
		guardaPosiciones(texto, alf);
		System.out.println(listaPosiciones.toString());
		int[] lista = new int[texto.length()];
		
		for (int i = 0; i < texto.length(); i++) {
			
			lista[i] = listaPosiciones.get(i).intValue();
		}
		
		return listaNumero(lista);

	}
	
	public BigInteger listaNumero(int[] lista) {
		
		int exponente = lista.length-1;
		BigInteger num = BigInteger.ZERO;
		
		for (int i = 0; i < lista.length; i++) {
			// OJO tiene que estar todo en BigInteger, si no no funciona
			num = num.add((BigInteger.valueOf(lista[i]).multiply(BigInteger.valueOf(alf.length()).pow(exponente))));
			exponente--;
		}
		
		return num;

	}

	public void guardaPosiciones(String texto, String alf) {
		BigInteger pos = BigInteger.valueOf(0);

		for (int i = 0; i < texto.length(); i++) {
			pos = BigInteger.valueOf(alf.indexOf(texto.charAt(i)));

			listaPosiciones.add(pos);
		}

	}

	// DE NUMERO A TEXTO
	public String decodificacionNumero(BigInteger numero) {
		String text = "";
		String textInv = "";
		BigInteger resto = BigInteger.valueOf(0);

		while (numero.divide(BigInteger.valueOf(alf.length())) != BigInteger.valueOf(0)) {
			resto = numero.remainder(BigInteger.valueOf(alf.length()));
			numero = numero.divide(BigInteger.valueOf(alf.length()));
			listaRestos.add(resto);
		}
		listaRestos.add(numero);

		//Recorremos la lista de restos y buscamos la posicion en el alfabeto
		for (BigInteger bi : listaRestos) {
			text = text + alf.charAt(bi.intValue());
		}
		//damos la vuelta al texto para que se pueda leer
		for (int i = text.length() - 1; i >= 0; i--) {
			textInv = textInv + text.charAt(i);
		}

		return textInv;
	}
	
	public void printLista() {
		
		for (int i = listaRestos.size()-1; i >= 0; i--) {
			System.out.print(listaRestos.get(i)+" ");
		}
		
	}

}