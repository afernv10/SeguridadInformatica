
import java.util.ArrayList;
import java.util.HashMap;

public class Hill {

	
	private int[][] clave_cifrado;
	private int[][] clave_descifrado;
	private String alf;
	private int longitud;
	
	public Hill(String alf, int[][] clave_cifrado, int[][] clave_descifrado ) {

		this.alf = alf;
		this.clave_descifrado = clave_descifrado;
		this.clave_cifrado = clave_cifrado; 
		this.longitud = clave_cifrado.length;
	}
	
	

	/**
	 * Se encarga de cifrar o descifrar el mensaje recibido como parametro
	 * 
	 * @param mensaje 
	 * @param cifrado si es true --> se procedera a cifrar el mensaje, si es false --> se procedera a descifrar el mensaje
	 * @return
	 */
	public String algoritmoHill(String mensaje, boolean cifrado) {

		
		HashMap<String, Integer> map_posiciones = new HashMap<String, Integer>();
		
		for (int i = 0; i < alf.length(); i++) { //metemos cada letra y su posicion en un hash map
			
			map_posiciones.put(String.valueOf(alf.charAt(i)), i);
		}
				
		//pasamos el mensaje a grupos de x tam
		String[] secuencias = getSecuencias(longitud, mensaje);
		
		//En una matriz ontenemos, por bloques, las posiciones de las secuencias de letras de tam longitud
		int[][] posiciones = getPosicionesSecuencias(secuencias, longitud, map_posiciones);
		
		imprimeMatriz(posiciones);
		System.out.println("\n");
		
		if(cifrado){//Cifrar
		
			
			int[][] resultados = multiplicarMatrices(clave_cifrado, traspuesta(posiciones), alf.length());
			
			imprimeMatriz(resultados);
			
			//tenemos los resultados en filas
			resultados = traspuesta(resultados);
			
			//Pasamos los bloques de 3 a posiciones del alf, asi sacamos el mensaje cifrado.
			String mensaje_cifrado = numerosAPosiciones(resultados);
			System.out.println("Mensaje codificado: "+mensaje_cifrado);
			
			return mensaje_cifrado;
			
		}else{ //Descifrar
			
			int[][] resultados = multiplicarMatrices(clave_descifrado, traspuesta(posiciones), alf.length());
			
			resultados = traspuesta(resultados);
			
			imprimeMatriz(resultados);
			
			String mensaje_descifrado = numerosAPosiciones(resultados);
			System.out.println("Mensaje descifrado: "+mensaje_descifrado);
			
			return mensaje_descifrado;
			
		}
	}

	private int[][] traspuesta(int[][] matriz){
		
		int[][] matrizT = new int[matriz[0].length][matriz.length];
		for (int x=0; x < matriz.length; x++) {
			  for (int y=0; y < matriz[x].length; y++) {
			    matrizT[y][x] = matriz[x][y];
			  }
			}
		return matrizT;
	}
	
	
	/**
	 * Recorremos por filas y cogemos cada numero (posicion) en el alfabeto
	 * 
	 * @param numeros
	 * @return
	 */
	private String numerosAPosiciones(int[][] posiciones){
		
		String mensaje_cifrado = "";
		
		for (int i = 0; i < posiciones.length; i++) {
			for (int j = 0; j < posiciones[0].length; j++) {
			
				mensaje_cifrado += alf.charAt(posiciones[i][j]);
				
			}
		}
		
		return mensaje_cifrado;
		
		
	}
	
	private int[][] getPosicionesSecuencias(String[] secuencias, int grupos, HashMap<String, Integer> map_posiciones){
		
		int[][] posiciones = new int[secuencias.length][grupos];
		
		for (int i = 0; i < posiciones.length; i++) {
			
			for (int j = 0; j < posiciones[0].length; j++) {
				
				posiciones[i][j] = map_posiciones.get(String.valueOf(secuencias[i].charAt(j))); //en cada i de secuencias hay 13 letras, y j recorre esas letras y las pasa a las columnas de la matriz posiciones
			}
		}
		
		
		return posiciones;
	}
	
	private String[] getSecuencias(int grupos, String modelo) {
		
		int modelo_long = modelo.length();
		
		String[] secuencias = new String[modelo_long/grupos]; 
		int bloquesNi = 0, bloquesNj = grupos;
		for (int i = 0; i < secuencias.length; i++) {
			
			secuencias[i] = modelo.substring(bloquesNi, bloquesNj);//coge substring de 13 en 13 si grupos = 13
			bloquesNi += grupos;
			bloquesNj += grupos;
		}

		return secuencias;

	}

	private int[][] multiplicarMatrices(int[][] a, int[][] b, int modulo) {
		
		int[][] c = new int[a.length][b[0].length];
		// se comprueba si las matrices se pueden multiplicar
		if (a[0].length == b.length) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					for (int k = 0; k < a[0].length; k++) {
						// aquí se multiplica la matriz
						c[i][j] += a[i][k] * b[k][j];
						c[i][j] %= modulo;
					}
				}
			}
		}
		/**
		 * si no se cumple la condición se retorna una matriz vacía
		 */
		return c;
	}
		
	public boolean tieneInversa(int[][] matriz){
		
		if(determinante(matriz, matriz.length) == 0) return false;
			
		return true;
	}
	
	
	/**
	 * Este metodo se puede utilizar para saber si la matriz introducida tiene inversa o no.
	 * Si det = 0 entonces no tiene inversa
	 * 
	 * @param A la matriz que se quiere calcular el determinante
	 * @param tam dimension de la matriz --> cuadrada
	 * @return el determinante
	 */
	private int determinante(int A[][], int tam) {
		int det = 0;
		if (tam == 1) {
			det = A[0][0];
		} else if (tam == 2) {
			det = A[0][0] * A[1][1] - A[1][0] * A[0][1];
		} else {
			det = 0;
			for (int j1 = 0; j1 < tam; j1++) {
				int[][] m = new int[tam - 1][];
				
				for (int k = 0; k < (tam - 1); k++) {
					m[k] = new int[tam - 1];
				}
				for (int i = 1; i < tam; i++) {
					int j2 = 0;
					
					for (int j = 0; j < tam; j++) {
						if (j == j1)
							continue;
						m[i - 1][j2] = A[i][j];
						j2++;
					}
				}
				det += Math.pow(-1.0, 1.0 + j1 + 1.0) * A[0][j1] * determinante(m, tam - 1);
			}
		}
		return det;
	}

	public void imprimeMatriz(int[][] matriz){
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public int[][] getClaveCifrado() {
		return this.clave_cifrado;
	}

	public void setClaveCifrado(int[][] claveCifrado) {
		this.clave_cifrado = claveCifrado;
	}

	public int[][] getClaveDescifrado() {
		return this.clave_descifrado;
	}

	public void setClaveDescifrado(int[][] claveDescifrado) {
		this.clave_descifrado = claveDescifrado;
	}

	public String getAlf() {
		return this.alf;
	}

	public void setAlf(String alfabeto) {
		this.alf = alfabeto;
	}

}
