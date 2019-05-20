import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
    	
    	//TODO mirar que solo codifica y decod multiplos de lalong de la matriz, revisar si el alfabeto se quiere de 27.
    	//TODO buscar para modulo 29 ejemplos
    	
    	String alf = "abcdefghijklmnñopqrstuvwxyz .";
    	int[][] clave_cifrado = {
    			{1,2,3}, 
    			{0,4,5}, 
    			{1,0,6}
    	};
    	int[][] clave_descifrado = {
    			{6,24,22}, 
    			{26,21,1}, 
    			{17,5,10}
    	};
    	
    	Hill hill = new Hill(alf, clave_cifrado, clave_descifrado);
    	Scanner sc = new Scanner(System.in);
    	String numero = "";
    	
    	
    	do{
	    	System.out.println("¿Que quieres hacer?: \nPulsa 0 para cifrar o pulsa 1 para descifrar.");
	    	numero = sc.nextLine();
	    	
    	}while(!numero.equals("1") && !numero.equals("0"));
    	
    	boolean cifrado = false;
    	
    	if(numero.equals("1")){
    		cifrado = true;
    	}
    	
    	
    	System.out.println("Introduce el mensaje: ");
    	String mensaje = sc.nextLine();
    	
    	mensaje = mensaje.toLowerCase();
    	
    	if(hill.tieneInversa(clave_cifrado))System.out.println("Tiene inversa");
    	else System.out.println("No tiene inversa");
    	
    	
    	hill.algoritmoHill(mensaje, cifrado);
    	
    }
    

}
