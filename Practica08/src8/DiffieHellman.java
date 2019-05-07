package src8;

import src8.CodificacionTextoNumero;
import src8.PotenciacionModular;

import java.math.BigInteger;
import java.util.Scanner;

public class DiffieHellman {

	public DiffieHellman() {

	}

	public String sacarClaveCompartida() {
		
		Scanner sc = new Scanner(System.in);
		
		CodificacionTextoNumero dec = new CodificacionTextoNumero();
		PotenciacionModular pot = new PotenciacionModular();
		
		System.out.println("p");
		BigInteger p = sc.nextBigInteger();
		
		System.out.println("mete clave privada (a o b)");
		BigInteger b = sc.nextBigInteger(); // es a o b, depende el enunciado
		
		BigInteger g = BigInteger.valueOf(3);
		
		//BigInteger B_num = pot.calculaPotenciacion(g, b, p);
		//System.out.println("B_num: "+B_num);
		//System.out.println(dec.decodificacionNumero(A_num)); prueba para validar que con a sacamos A
		
		//dec.limpiar();
		
		
		BigInteger A_num = dec.decodificacionTexto("áAlmTk7OyL0ÁeÁñ1"); // "A" de la pra 8
		
		//System.out.println("A_num: "+A_num);
		//System.out.println("supuesto texto de A_num: "+dec.decodificacionNumero(A_num)); //prueba para validar
		
		dec.limpiar();
		
		
		BigInteger compartida = pot.calculaPotenciacion(A_num, b, p);
		//System.out.println(compartida);
		String claveK = dec.decodificacionNumero(compartida);
		System.out.println("Clave Compartida K:\n"+claveK);
		return claveK;
		
		// aqui hay que hacer la operacion inversa de arriba, ya que no tenemos b, pero arriba si tenemos a
		
	}

}
