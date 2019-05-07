package src;

import java.math.BigInteger;
import java.util.Scanner;

import src8.CodificacionTextoNumero;
import src8.PotenciacionModular;

public class DiffieHellman {

	public DiffieHellman() {

	}

	public void sacarClaveComaprtida() {
		
		Scanner sc = new Scanner(System.in);
		
		CodificacionTextoNumero dec = new CodificacionTextoNumero();
		PotenciacionModular pot = new PotenciacionModular();
		
		System.out.println("p");
		BigInteger p = sc.nextBigInteger();
		
		System.out.println("a");
		BigInteger a = sc.nextBigInteger();
		
		BigInteger g = BigInteger.valueOf(3);
		
		BigInteger A_num = pot.calculaPotenciacion(g, a, p);
		System.out.println("A_num: "+A_num);
		System.out.println(dec.decodificacionNumero(A_num));
		
		dec.limpiar();
		
		BigInteger prueba = dec.decodificacionTexto("ánÚ3A05á:b1egyJÚá");
		System.out.println("prueba: "+prueba);
		
		dec.limpiar();
		
		BigInteger B_num = dec.decodificacionTexto("08oHPL))eKRe.,7 ");
		System.out.println("hola");
		System.out.println("B_num: "+B_num);
		System.out.println("supuesto texto de B_num: "+dec.decodificacionNumero(B_num));
		
		dec.limpiar();
		
		System.out.println("adios");
		BigInteger compartida = pot.calculaPotenciacion(B_num, a, p);
		//System.out.println(compartida);
		System.out.println(dec.decodificacionNumero(compartida));
		// aqui hay que hacer la operacion inversa de arriba, ya que no tenemos b, pero arriba si tenemos a
		
	}

}
