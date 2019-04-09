
package src;

import javafx.print.PaperSource;

public class Hamming {

	
	String alf ="AÁBCDEÉFGHIÍJKLMNÑOÓPQRSTUÚVWXYZ .,;:()¿?¡!-0123456789aábcdeéfghiíjklmnñoópqrstuúvwxyz";
	
	
	
	public Hamming() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lista = {1,1,0,1,0,0,0,1,0,1,0,0,1,1,0,0,0,1,1,1,1,0,1,1,1,0,1,1,1,0,1,1,0,1,1,1,0,1,0,1,0,1,0,0,0,0,0,1,0,1,0,1,1,0,0,1,0,0,1,1,1,1,1,0,0,0,0,0,1,0,0,0,1,1,0,1,1,1,1,1,1,0,0,1,1,0,1,1,0,0,1,0,1,1,1,0,0,0,1,0,1,1,0,0,1,1,1,0,0,1,0,1,0,1,0,1,0,1,1,1,0,0,1,0,1,0,0,0,0,1,1,1,0,1,1,0,0,0,1,0,0,1,0,1,1,0,1,1,0,0,0,1,1,1,0,0,0,1,0,0,1,1,1,0,1,0,1,1,0,0,1,1,1,1,1,0,0,0,0,0,1,0,0,1,0,1,1,1,1,1,0,0,0,0,0,1,0,1,0,0,1,0,0,0,1,0,1,0,1,0,0,0,0,1,0,1,1,0,1,1,1,0,0,1,1,0,0,0,1,1,0,0,1,1,1,0,1,1,1,0,0,1,1,0,1,0,1,1,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,1,0,0,0,1,0,0,0,0,0,1,1,0,0,1,1,1,0,1,1,1,0,0,1,1,0,1,1,1,0,1,1,1,0,0,1,1,0,0,0,0,1,0,1,0,1,1,0,1,1,0,0,1,1,0,1,0,1,0,1,0,1,1,1,0,0,1,0,1,1,1,0,0,1,0,1,1,0,1,1,0,0,0,0,1,1,1,1,0,1,0,0,0,1,1,0,0,0,1,1,0,0,1,0,1,0,0,1,0,0,1,1,1,1,1,0,1,1,0,0,0,1,0,0,1,0,0,0,0,0,1,1,0,0,1,1,0,1,1,0,1,1,0,0,1,0,0,0,1,0,1,0,1,0,1,1,1,0,1,0,0,1,1,0,1,1,0,0,0,1,0,0,1,1,0,1,1,0,1,0,0,1,0,1,0,1,0,0,0,0,0,0,1,0,1,0,1,0,0,1,1,0,0,0,0,0,1,0,0,1,0,1,0,0,1,1,0,0,0,1,1,1,0,0,0,1,0,0,1,0,0,0,0,0,1,1,1,1,0,1,1,1,0,0,0,0,0,0,1,1,0,1,0,0,1,1,1,1,0,0,0,1,1,0,1,1,0,1,1,0,1,1,1,0,0,1,1,0,1,0,1,1,0,1,1,0,1,1,1,0,0,1,1,0,0,1,0,1,0,1,0,1,0,1,0,0,0,0,0,0,1,1,1,0,1,0,1,0,0,1,1,0,0,1,0,1,0,0,1,0,1,0,0,1,0,0,0,0,1,0,0,1,1,1,0,0,1,1,1,0,1,1,0,0,1,0,0,1,1,1,1,0,0,1,0,1,0,0,1,0,0,1,1,1,0,1,0,1,1,0,0,1,0,1,0,1,0,0,0,1,0,1,1,1,0,0,1,0,1,1,0,1,0,1,1,0,0,0,1,1,0,0,1,1,0,1,0,1,1,1,1,0,0,0,1,0,0,1,0,1,1,0,1,1,0,1,0,0,1,0,0,0,1,1,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,1,1,1,0,1,0,1,0,0,0,1,0,1,1,1,0,0,1,1,1,1,1,0,1,1,1,1,0,1,0,1,0,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,1,0,1,1,1,0,0,1,1,1,1,1,0,0,0,1,1,0,1,1,0,1,1,1,1,1,1,0,0,1,1,1,1,1,0,0,0,1,1,0,0,0,0,0,1,0,1,0,1,1,0,0,1,0,1,1,1,0,0,1,0,1,1,0,1,1,0,0,0,0,1,1,1,1,0,1,0,0,0,1,1,0,0,0,0,1,1,1,0,0,1,0,0,1,1,1,0,1,1,0,1,0,1,0,1,1,0,0,0,0,0,1,0,0,0,1,1,1,1,0,1,0,0,0,1,1,0,0,1,0,1,0,0,1,1,0,1,1,0,1,1,0,0,1,1,0,0,1,0,1,0,1,0,1,1,0,0,1,1,0,1,1,1,1,1,1,0,1,1,1,0,0,1,1,1,1,0,0,0,1,1,1,0,1,0,1,0,1,1,1,0,1,0,0,0,1,0,1,0,0,1,1,0,1,1,1,1,0,1,1,1,1,0,1,0,1,0,1,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1,1,1,0,0,1,1,1,0,0,1,0,0,1,0,0,1,1,1,0,0,0,1,0,1,1,0,1,1,0,0,0,1,1,1,1,1,1,0,0,1,1,0,1,0,1,1,1,1,1,0,0,1,1,1,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,1,0,0,1,0,0,0,0,1,0,0,1,0,0,0,1,1,0,1,0,1,1,1,0,0,1,1,0,1,1,0,1,1,0,1,1,1,1,1,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,1,1,0,0,0,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,0,0,0,0,0,1,1,1,1,1,0,1,0,0,1,1,1,0,0,0,1,1,1,0,0,1,1,0,1,0,0,1,1,0,0,1,0,0,0,1,1,0,1,1,1,1,0,1,0,1,1,1,1,0,0,0,1,1,0,0,0,0,0,1,0,1,0,1,1,0,0,1,0,0,0,1,1,0,1,0,0,1,0,1,0,1,0,1,0,1,1,0,0,1,1,1,0,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,0,0,0,1,0,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,0,0,0,0,0,0,1,0,1,0,1,0,0,0,1,0,1,0,1,0,0,1,1,1,1,0,0,0,1,0,0,1,0,0,0,1,0,1,0,1,1,0,0,1,0,1,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,0,1,0,0,1,1,0,1,1,0,0,1,1,1,1,1,0,0,1,0,0,1,0,0,1,1,1,1,1,0,0,0,1,1,1,1,0,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,1,0,0,0,1,0,1,1,0,0,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,1,1,0,0,1,1,1,0,0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,0,1,1,0,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,0,0,1,0,1,0,1,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,1,0,0,1,0,1,0,1,0,1,0,1,1,1,1,1,0,0,0,0,1,0,0,1,0,0,1,0,0,1,1,0,0,1,1,1,0,0,1,0,1,0,1,0,0,0,0,0,1,0,0,1,0,1,0,0,1,1,0,0,0,1,1,1,1,1,1,0,0,1,0,0,1,1,0,0,0,1,1,0,0,1,1,1,0,1,1,1,0,0,0,1,0,0,0,0,0,1,0,0,0,1,1,0,1,1,0,0,0,1,0,1,1,1,1,0,0,0,1,1,1,1,0,1,1,0,1,1,0,0,0,1,0,0,1,0,0,1,1,0,1,1,0,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,0,0,1,1,1,0,0,1,0,0,1,1,1,1,1,0,1,1,0,0,1,0,0,0,1,1,0,1,0,1,0,1,0,1,0,1,1,0,1,1,0,0,1,1,0,0,1,0,1,0,1,0,1,0,1,1,1,0,1,1,0,1,1,1,0,1,1,1,0,0,1,1,1,0,0,1,1,1,1,1,0,0,1,1,1,0,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,1,0,0,0,0,0,1,0,1,0,0,1,1,0,1,0,1,0,1,0,0,0,1,1,1,0,0,1,1,0,0,1,0,1,1,0,0,0,1,0,1,0,1,0,0,1,0,0,1,0,0,1,0,1,1,1,0,0,1,1,0,1,0,0,1,1,0,1,0,1,0,1,1,1,0,0,0,0,0,1,0,1,1,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,1,1,0,1,0,1,1,0,0,0,1,0,1,1,0,0,1,0,0,1,1,1,1,1,0,1,0,1,0,0,1,0,0,1,0,0,1,0,1,0,0,1,1,0,1,1,0,1,1,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1,0,1,1,1,0,0,1,0,1,0,1,1,0,0,1,0,0,1,0,1,0,1,0,0,1,0,1,0,1,0,0,1,0,1,1,0,1,1,0,0,0,0,0,1,0,1,1,1,1,1,0,0,1,0,1,0,1,0,0,0,0,1,0,0,0,0,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1,0,1,0,0,1,1,1,0,1,1,1,0,1,0,0,1,0,1,0,1,0,1,1,1,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,0,1,1,1,1,0,1,0,0,1,0,1,0,1,0,1,0,1,0,1,1,0,1,0,0,0,1,1,0,0,0,1,1,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1,1,1,0,0,1,1,0,1,0,1,1,1,0,1,0,1,1,1,0,0,1,1,0,0,1,1,0,0,0,1,1,1,0,0,1,1,0,0,0,1,0,1,1,1,1,1,1,0,0,0,1,0,1,1,0,0,1,0,1,1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,0,0,1,0,0,0,1,1,1,1,1,0,1,1,0,0,1,1,1,1,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1,0,1,1,0,1,0,0,0,1,1,0,1,1,0,1,1,1,1,0,0,1,1,0,1,0,1,0,0,1,1,0,1,1,0,1,1,0,1,1,0,0,0,0,0,0,0,1,0,0,1,1,1,0,0,1,1,1,0,0,1,1,1,0,1,0,1,1,0,1,1,1,1,1,1,0,0,1,0,0,0,1,1,0,1,0,1,0,1,1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,1,0,1,0,1,1,0,0,1,1,1,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,1,0,1,0,1,0,0,1,0,0,1,0,0,1,0,1,0,1,1,1,0,0,1,0,0,1,0,0,1,1,1,0,0,0,1,0,1,0,1,0,1,1,1,1,0,1,1,0,1,0,0,0,1,1,1,0,1,1,0,1,0,0,0,1,0,0,0,0,0,1,1,1,0,0,0,0,0,1,1,1,0,0,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,1,1,0,0,1,0,0,0,1,0,0,1,0,1,1,0,1,1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,0,1,0,0,1,1,0,1,1,0,0,1,0,0,0,1,0,0,0,1,1,0,0,1,0,0,0,1,1,0,1,1,1,0,0,1,1,0,1,1,1,0,0,1,0,1,1,0,1,1,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,1,1,1,1,0,0,0,0,0,1,0,1,1,1,0,0,1,0,0,0,1,0,1,0,0,1,1,0,0,0,1,0,0,1,0,1,1,0,0,0,1,0,0,0,1,1,0,0,0,1,0,0,0,1,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,1,0,1,0,1,0,0,0,1,1,0,0,0,1,0,1,1,1,1,0,0,0,1,0,1,0,0,1,1,1,0,1,0,1,1,0,0,1,0,0,0,0,1,1,1,0,1,0,0,0,1,1,0,1,1,1,1,0,0,0,1,1,0,1,1,0,1,1,1,1,0,0,0,1,0,1,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,1,1,1,0,0,1,1,0,0,1,1,1,0,0,0,0,1,0,1,0,1,0,0,0,1,0,0,0,1,1,0,1,1,1,0,0,1,1,1,0,1,1,1,0,0,0,0,1,1,1,1,1,1,0,1,0,1,1,0,1,0,1,1,0,1,1,1,1,0,1,0,1,0,0,0,1,0,0,0,1,1,0,1,1,1,1,0,1,0,1,0,0,1,0,0,1,1,1,0,1,1,0,0,1,1,0,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,0,0,1,1,0,0,1,1,1,0,0,0,1,0,0,1,0,1,1,1,1,1,1,0,0,0,0,0,1,0,1,1,0,1,0,0,0,0,0,0,1,1,1,1,1,0,1,1,1,0,0,0,1,0,1,0,0,1,1,0,0,1,0,0,0,0,0,0,1,1,1,0,0,1,1,1,0,1,0,0,1,1,1,1,1,0,0,0,0,0,1,1,1,0,1,1,0,0,1,0,0,0,1,1,0,0,0,0,1,0,1,1,0,1,0,0,1,0,0,0,0,0,1,1,1,0,1,1,0,0,0,1,1,0,0,0,0,1,1,0,1,0,1,1,1,1,1,1,1,1,0,1,1,1,0,1,1,0,1,0,0,0,1,1,0,0,1,1,1,0,0,0,0,1,0,0,0,1,1,0,0,0,0,1,0,1,1,0,1,0,0,1,0,0,0,1,0,0,1,1,0,0,0,1,0,0,1,0,0,0,1,1,1,1,0,0,0,0,0,0,0,1,1,1,0,0,1,0,0,1,0,0,0,0,1,1,0,1,0,1,0};
		
		int[][] matrizA = {
				{1,0,1,0,1,0,1,1,1},
				{1,0,1,0,1,1,0,0,1},
				{1,0,1,1,0,1,1,0,0},
				{0,1,0,1,0,0,1,1,0},
				{0,0,1,1,1,0,0,1,1},
				{1,1,1,1,0,0,0,0,0},
				};
		Hamming ham = new Hamming();
		int dimension = matrizA.length;
		int[][] identidad = ham.generarIdentidad(dimension);
		//ham.imprimeMatriz(matrizA);
		
		int generadora[][] = ham.concatenarMatrices(identidad, matrizA, identidad.length, identidad[0].length+matrizA[0].length);
		//System.out.println(generadora.length);
		//ham.imprimeMatriz(generadora);
		//Generacion de la matriz generadora a partir de la de control
		int[][] matriz_control = ham.generarMControl(matrizA);
		//ham.imprimeMatriz(matriz_control);
		
		ham.generarErorPatron(15, 2);
		System.out.println("lista: "+lista.length);
		ham.getsindrome(lista, 15);
		ham.prueba();
		
	}
	
	private int[][] getsindrome(int[] lista, int grupos) {
		
		int[][] secuencias = new int[lista.length/15][grupos];
		
		int quince = 0;
		for (int i = 0; i < secuencias.length; i++) {
			
			for(int j = 0; j < grupos; j++){
				
				secuencias[i][j] = lista[quince++];
			}
		}
		
		//imprimeMatriz(secuencias);
		
		//TODO falta multiplicar las secuencias por la matriz de control para obtener los sindromes
		
		return null;
		
	}

	public int[][] generarMControl(int[][] matrizA){
		
		
		int[][] identidad = generarIdentidad(matrizA[0].length);
		int[][] aTraspuesta = traspuesta(matrizA);
		int matriz_control[][] = control(aTraspuesta, identidad, identidad.length, identidad[0].length+aTraspuesta[0].length);
		
		return matriz_control;
	}
	
	public int[][] control(int[][] izda, int[][] drcha, int filas, int columnas){
		
		int matriz[][] = new int[filas][columnas];
		//System.out.println(matriz.length+" X "+matriz[0].length);
		//imprimeMatriz(matriz);
		for (int i=0; i < matriz.length; i++) {
			
			  for (int j=0; j < matriz[0].length; j++) {
				  
				  if(j<izda[0].length) {
					 
					  matriz[i][j] = izda[i][j];
				  }else {
					  matriz[i][j] = drcha[i][j-izda[0].length];
				  }
			  }
		}
		
		return matriz;
	}
	
	public int[][] concatenarMatrices(int[][] izda, int[][] drcha, int filas, int columnas) {

		int matriz[][] = new int[filas][columnas];
		// System.out.println(matriz.length+" X "+matriz[0].length);
		// imprimeMatriz(matriz);
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[0].length; j++) {

				if (j < izda.length) {

					matriz[i][j] = izda[i][j];
				} else {
					matriz[i][j] = drcha[i][j - izda.length];
				}
			}
		}
		return matriz;
	}	
	
	/**
	 * Hay que llenar esta matriz con peso 0, 1 y 2. Para peso 1 todas las lineas posibles donde puedan haber un 1 
	 * y para peso 0 son todo 0
	 * @param longitud
	 * @param peso
	 * @return la tabla de errores
	 */
	public int[][] generarErorPatron(int longitud, int peso){
		
		int tam = (longitud*(longitud-1))/peso;
		int[][] errorPatron = new int[tam+longitud+1][longitud]; //Palabras de peso 0 +peso 1 + peso 2 --> las filas
				
		System.arraycopy( rellenarPeso(longitud, 1), 0, errorPatron, 1, longitud );
		System.arraycopy( rellenarPeso(longitud, 2), 0, errorPatron, longitud+1, tam );
		//imprimeMatriz(errorPatron);
		
		return errorPatron;
	}
	
	/**
	 * YA FUNCIONA, ESTE METODO ES EL QUE SACA ERRORES PATRON PESO 2
	 */
	private void prueba(){
		
		int l = 15;
		int peso = 2;		
		int[][] array = new int[(l*(l-1))/peso][l];
		
		
		int contador_unos = 1; 
		
		System.out.println("array0:" + array[0].length);
		System.out.println("array:" + array.length);
		
		int j = 1;
		int div = 0;
		int grupoNpalabras = array[0].length, fila=0, movingPos=0;
		
		for (int i = 0; i < array.length; i++) {
				
			if(j==grupoNpalabras) {
				movingPos+=15;
				j=1;
				grupoNpalabras--;
			}
			div = (movingPos)/l;
			array[fila][div]=1; //aqui se marca el "1 guia" prueba a quitarlo para ver lo que pasa
			
			if(j<=array[0].length) {
				
				if(j+div < 15) {//para que se vayan desplazando los unos y dejando ceros a la derecha
					System.out.println("div i:" + i+" j+div: "+(j+div));
					array[i][j+div] = 1;
				}
				
				j++;
				fila++;
			}
			
		}
		imprimeMatriz(array);
	}
	
	private int[][] rellenarPeso(int longitud, int peso){
		
		if(peso == 1){
			return generarIdentidad(longitud);
		}else{
			
			int contador = 0;
			int[][] ret = new int[(longitud*(longitud-1))/peso][longitud];
			
			for (int i=0; i < ret.length; i++) {// para que recorra las filas que le corresponde a cada peso
				 ++contador;
				  for (int j=0; j < ret[0].length; j++) { 
					  
					  
					  
					 // ret[i][j] = 2;
					 
				  }
			}
			System.out.println("contador: "+contador);
			return ret;
		}
		
	}
	
	
	public int[][] generarIdentidad(int dimension){
		
		int[][] identidad = new int[dimension][dimension];
		
		for (int i = 0; i < identidad.length; i++) {
			
			for (int j = 0; j < identidad[0].length; j++) {
				if(i==j) {
					identidad[i][j]=1;
				}else {
					identidad[i][j]=0;
				}
			}
		}
		
		return identidad;
	}
	
	public int[][] productoMatricial(int[][] a, int[][] b) {
		
		 int[][] c = new int[a.length][b[0].length];
		    // se comprueba si las matrices se pueden multiplicar
		    if (a[0].length == b.length) {
		        for (int i = 0; i < a.length; i++) {
		            for (int j = 0; j < b[0].length; j++) {
		                for (int k = 0; k < a[0].length; k++) {
		                    // aqu� se multiplica la matriz
		                    c[i][j] += a[i][k] * b[k][j];
		                }
		            }
		        }
		    }
		    /**
		     * si no se cumple la condici�n se retorna una matriz vac�a
		     */
		    return c;
	}
	public int[][] traspuesta(int[][] matriz){
		
		int[][] matrizT = new int[matriz[0].length][matriz.length];
		
		for (int x=0; x < matriz.length; x++) {
			  for (int y=0; y < matriz[x].length; y++) {
			    matrizT[y][x] = Math.abs((matriz[x][y]-1) % 2);
			  }
			}
		return matrizT;
	}
	
	public void imprimeMatriz(int[][] matriz) {
		
		for (int i=0; i < matriz.length; i++) {
			  for (int j=0; j < matriz[i].length; j++) {
				  
				  System.out.print(matriz[i][j]+" ");
			  }
			  System.out.println();
		}
	}

}