import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
    	
    	//TODO mirar que solo codifica y decod multiplos de lalong de la matriz, revisar si el alfabeto se quiere de 27.
    	//TODO buscar para modulo 29 ejemplos
    	
    	
    	/*int[][] clave_cifrado = {
    			{1,2,3, }, 
    			{0,4,5, }, 
    			{1,0,6.}
    	};
    	int[][] clave_descifrado = {
    			{9,10,21}, 
    			{20,12,9}, 
    			{13,8,16}
    	};*/
    	
    	/*int[][] clave_cifrado = {
    			{1,0,3,3}, 
    			{2,3,2,3}, 
    			{1,2,1,2},
    			{3,2,5,0}
    	};
    	int[][] clave_descifrado = {
    			{23,21,21,20}, 
    			{23,16,14,6}, 
    			{6,10,5,9},
    			{6,12,17,23}
    	};*/
    	System.out.println("");
    	
    	String alf = "abcdefghijklmnñopqrstuvwxyz .";
		int[][] clave_cifrado = { 
				{ 3, 6, 9, 5, 1, 8, 6, 3, 4, 3, 12, 1 }, 
				{ 5, 15, 1, 2, 3, 8, 6, 24, 5, 2, 5, 8 },
				{ 9, 6, 3, 2, 4, 7, 8, 5, 1, 2, 3, 6 }, 
				{ 7, 8, 9, 6, 5, 4, 1, 2, 6, 0, 0, 8 },
				{ 1, 2, 8, 4, 5, 6, 5, 6, 12, 1, 1, 1 }, 
				{ 25, 23, 21, 5, 6, 8, 9, 3, 0, 0, 0, 0 },
				{ 1, 4, 7, 8, 5, 2, 3, 6, 9, 8, 4, 6 }, 
				{ 2, 1, 5, 9, 7, 5, 3, 0, 0, 2, 5, 7 },
				{ 1, 5, 6, 9, 9, 11, 15, 14, 19, 2, 25, 24 }, 
				{ 26, 23, 28, 24, 1, 0, 0, 1, 2, 3, 7, 8 },
				{ 9, 6, 5, 2, 0, 3, 36, 35, 32, 24, 28, 12 }, 
				{ 11, 11, 11, 2, 2, 5, 5, 8, 8, 8, 8, 0 }, 
				};
		
		int[][] clave_descifrado = { 
				{ 3, 1, 15, 11, 14, 13, 23, 9, 9, 22, 11, 15 },
				{ 26, 20, 11, 8, 26, 19, 25, 24, 26, 20, 15, 27 },
				{ 23, 4, 13, 6, 8, 20, 12, 19, 5, 21, 6, 22 },
				{ 13, 8, 13, 3, 15, 4, 28, 6, 20, 5, 10, 5 }, 
				{ 28, 10, 16, 26, 26, 5, 12, 18, 7, 19, 17, 23 },
				{ 16, 12, 10, 24, 19, 14, 0, 25, 1, 2, 13, 16 }, 
				{ 6, 27, 17, 5, 4, 7, 6, 19, 0, 10, 9, 10 },
				{ 8, 12, 13, 17, 20, 5, 24, 28, 8, 5, 16, 25 }, 
				{ 28, 1, 22, 0, 22, 26, 0, 19, 24, 17, 8, 16 },
				{ 21, 3, 18, 9, 7, 18, 2, 19, 5, 27, 1, 23 }, 
				{ 7, 15, 7, 23, 9, 20, 1, 3, 13, 14, 12, 17 },
				{ 17, 0, 27, 2, 17, 3, 4, 0, 4, 14, 9, 20 },
				};
    	/*
    	 * anderr
    	 * 
    	 * boilhs
    	 * 
    	 */
    	Hill hill = new Hill(alf, clave_cifrado, clave_descifrado);
    	Scanner sc = new Scanner(System.in);
    	String numero = "";
    	
    	
    	do{
	    	System.out.println("¿Que quieres hacer?: \nPulsa 1 para cifrar o pulsa 0 para descifrar.");
	    	numero = sc.nextLine();
	    	
    	}while(!numero.equals("1") && !numero.equals("0"));
    	
    	boolean cifrado = false;
    	
    	if(numero.equals("1")){
    		cifrado = true;
    	}
    	
    	
    	System.out.println("Introduce el mensaje: ");
    	String mensaje = sc.nextLine();
    	
    	mensaje = mensaje.toLowerCase();
    	
    	//if(hill.tieneInversa(clave_cifrado))System.out.println("Tiene inversa");
    	//else System.out.println("No tiene inversa");
    	
    	
    	hill.algoritmoHill(mensaje, cifrado);
    	
    }

}
