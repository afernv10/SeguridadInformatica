package src;

import java.math.BigInteger;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		PotenciacionModular pm = new PotenciacionModular();
		/*
		 * Ejercicio 1 184257551115
		 */
		/*System.out.println("POTENCIACIÓN MODULAR");
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca la base: ");
		BigInteger a = sc.nextBigInteger();

		System.out.println("Introduzca el exponente: ");
		BigInteger b = sc.nextBigInteger();

		System.out.println("Introduzca el módulo: ");
		BigInteger n = sc.nextBigInteger();

		System.out.println(pm.calculaPotenciacion(a, b, n));*/

		/*
		 * Ejercicio 2
		 */
		CodificacionTextoNumero cod = new CodificacionTextoNumero();
		Scanner sc = new Scanner(System.in);
		
		// NUMERO A TEXTO (M)
		/*System.out.println("CODIFICACIÓN Numero/Texto");
		System.out.println("Dame el numero: ");
		BigInteger M = sc.nextBigInteger();
		System.out.println(cod.decodificacionNumero(M));
		System.out.println("Lista: ");
		cod.printLista();*/
		
		
		//Lista a numero
		/*int[] lista= {1,50,25,80,56,50,13,53,11};
		System.out.println(cod.listaNumero(lista));*/
		
		// TEXTO A NUMERO �QQBkc34F8
		System.out.println("CODIFICACIÓN Texto/Numero");
		System.out.println("Dame el texto: ");
		String M = sc.nextLine();
		System.out.println(cod.decodificacionTexto(M));
		
		//System.out.println("Lista: ");
		
		/*
		 *
		 * 
		 *  System.out.println("Introduzca el numero: "); 
		 *  BigInteger num = sc.nextBigInteger(); ctn.decodificacionNumero(num);
		 */
		/*
		 * System.out.println("Introduzca el texto: "); String texto = sc.nextLine();
		 */

	}
}
