package src;
import java.util.Arrays;

public class Deco {

	private final int TAMPUNITARIO = 7;	// tamaño de matriz (G+matriz)
	private final int TAMIDENTIDAD = 4;	// tamaño de matriz identidad
	
	/**
	 * Alfabeto 2
	 */
	String alf="abcde ABCDEfghijklmnFGHIJKLMNopqrstuvwxyzOPQRSTUVWXYZ.,;¿?¡!";
	/**
	 * Alfabeto 1
	 */
	//String alf= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ .,;¿?¡!";
	
	/**
	 * Modelo 2
	 */
	private int[] lista = 
			{
			0,1,0,1,1,0,1,1,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,1,0,0,1,1,0,0,1,0,0,1,1,0,0,0,1,1,1,1,0,1,0,1,0,0,1,
			0,0,0,0,1,0,1,1,0,0,0,1,0,1,1,0,1,1,0,0,1,1,0,0,1,0,1,0,
			1,0,0,0,1,0,1,1,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,1,0,0,1,1,
			0,1,0,0,0,1,1,1,1,1,1,0,1,0,0,0,1,0,0,1,1,0,1,1,0,0,0,0,
			1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,1,0,1,0,1,
			0,0,0,0,1,0,1,1,0,1,0,1,1,0,1,0,0,0,1,0,1,1,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,1,0,1,1,0,1,0,1,1,1,0,0,0,1,0,1,0,0,1,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,
			1,1,0,0,0,1,1,1,1,0,0,0,1,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0,
			0,1,0,0,0,1,1,1,0,0,0,0,0,0,0,1,1,0,1,0,1,0,0,1,0,0,1,1,
			0,0,1,0,1,1,0,1,0,0,1,0,1,0,1,1,0,0,1,1,0,0,0,0,0,1,0,1,
			1,0,0,0,1,0,1,1,0,1,0,1,1,0,1,0,0,1,0,1,0,1,0,0,0,1,0,1,
			1,0,0,0,1,0,1,1,0,0,1,1,1,1,0,1,0,0,0,1,1,1,0,1,0,0,1,1,
			0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,1,1,0,0,0,0,1,0,1,0,0,1,1,
			0,0,0,0,1,0,1,1,0,1,0,0,1,1,0,0,1,0,0,1,1,0,1,0,0,0,1,1,
			1,0,1,0,0,1,1,0,0,1,0,1,1,0,1,0,0,0,0,0,0,0,1,0,0,1,1,0,
			0,1,1,0,1,0,1,0,1,0,0,0,1,1,1,0,0,1,0,1,0,1,0,0,0,0,0,0,
			0,0,0,0,1,0,1,1,0,0,0,0,0,0,0,0,0,1,0,1,0,1,1,0,0,0,1,1,
			1,1,0,0,1,1,0,0,1,1,0,1,0,1,0,1,1,1,0,1,0,0,1,1,1,1,1,1,
			1,1,0,1,1,0,0,1
			};
		
	
	/**
	 * Modelo 1
	 */
	/*private int[] lista = {1,0,0,1,1,0,0,1,0,0,1,1,0,0,0,1,0,0,1,1,0,0,1,1,0,0,1,
	                               1,0,0,1,1,1,1,0,0,1,0,0,1,1,0,0,0,0,0,0,0,0,0,1,0,0,1,1,
	                               0,1,0,0,0,1,1,1,0,0,0,1,0,1,1,0,0,0,0,0,0,0,1,1,0,1,0,1,
	                               0,1,1,0,1,0,1,0,0,1,1,1,0,0,0,0,1,0,0,1,1,0,1,0,0,1,1,0,
	                               0,0,1,0,0,1,1,0,1,1,1,0,1,0,0,1,1,0,1,0,1,0,0,0,0,0,0,0,
	                               0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,
	                               1,0,0,0,1,0,1,1,0,0,0,0,0,0,0,1,0,0,0,1,1,1,0,1,0,0,1,1,
	                               0,1,0,1,1,0,0,1,0,1,0,0,1,1,0,0,0,0,0,0,0,0,1,0,0,0,1,1,
	                               1,1,1,1,0,1,0,0,0,0,1,1,1,1,0,0,1,0,1,1,0,1,0,0,1,0,1,0,
	                               1,0,0,0,1,0,1,1,0,0,0,0,0,0,0,0,1,1,0,0,1,1,0,1,0,1,1,0,
	                               1,0,0,0,0,0,0,0,1,0,0,0,1,1,1,0,0,0,0,0,0,0,1,1,0,0,0,0,
	                               1,1,1,1,0,1,0,0,1,1,1,0,1,0,0,1,1,1,1,1,1,1,1,0,1,1,0,0,1};
	*/
	public Deco() {
		System.out.println("Lista length: " + lista.length);
		System.out.println("Alfabeto length: " + alf.length());
		iniciar();
	}

	private void iniciar() {
		
		int[] dec = decodificacion2();
		decodificacion1(dec);
	}
	
	/**
	 * 
	 */
	private int [] decodificacion2() {
		
		int resto = lista.length % TAMPUNITARIO; // 0 que seria la cola para tam 7
		int longitud1 =  resto + (lista.length/TAMPUNITARIO);
		int tamNuevo = longitud1 * TAMIDENTIDAD; // 4 es los bloque que saldran de la dec 2
		System.out.println("DECOD 2");
		System.out.println("resto: "+resto+", long: "+longitud1+", tam"+tamNuevo);
		
		int[] listaDec1 = new int[tamNuevo];
		
		for(int i = 0, j = 0; i < lista.length-resto; i+=TAMPUNITARIO, j+=TAMIDENTIDAD) {
			 
			System.out.println("Agrupando según TamIdentidad para lista dec1: " + i);
			
			/*listaDec1[j] = lista[i];
			listaDec1[j+1] = lista[i+1];
			listaDec1[j+2] = lista[i+2];
			listaDec1[j+3] = lista[i+3];*/
			for (int j2 = 0; j2 < TAMIDENTIDAD; j2++) {
				listaDec1[j+j2] = lista[i+j2];
			}
			
		}
		if(resto != 0) {
			// añadimos la posible cola existente
			for(int i = lista.length-resto; i < lista.length; i++) {
				
				listaDec1[i] = lista[i];
			}
		}
		System.out.println(Arrays.toString(listaDec1));
		return listaDec1;
	}
	
	private void decodificacion1(int[] listaDec2) {
		
		String binario = "";
		String mensaje = "";
		// Es 6 porque alfabeto tiene 60 simbolos --> log2(60) = 6
		//	esa es la longitud mínima
		int topeLong =  (int) Math.round(log2(alf.length()));
		System.out.println("TopeLong: " + topeLong);
		
		// ese 6?????
		for(int i = 0; i < listaDec2.length ; i+=topeLong) {
			
			
			for(int j = 0; j < 6; j++) {
				
				binario += Integer.toString(listaDec2[i+j]);
				
			}
			System.out.println("Agrupacion binario: " + binario);
			
			int decimal = Integer.parseInt(binario, 2);
			binario = "";
			System.out.println(decimal);
			mensaje += alf.charAt(decimal);
			System.out.println(mensaje);
		}
		System.out.println(mensaje);
	}
	
	private double log2(double d) {
		double r = Math.log(d)/Math.log(2);
		return r;
	}
	
}









