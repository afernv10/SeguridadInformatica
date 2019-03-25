import java.util.Arrays;

public class Deco {

	private final int TAMPUNITARIO = 7;
	
	String alf="abcde ABCDEfghijklmnFGHIJKLMNopqrstuvwxyzOPQRSTUVWXYZ.,;¿?¡!";
	
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
	
	public Deco() {
		System.out.println(lista.length);
		System.out.println(alf.length());
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
		int tamNuevo = longitud1 * 4; // 4 es los bloque que saldran de la dec 2
		
		System.out.println("resto: "+resto+" long: "+longitud1+" tam"+tamNuevo);
		
		int[] listaDec1 = new int[tamNuevo];
		
		for(int i = 0, j = 0; i < lista.length-resto; i+=7, j+=4) {
			 //TODO cambiar para generico
			System.out.println(i);
			listaDec1[j] = lista[i];
			listaDec1[j+1] = lista[i+1];
			listaDec1[j+2] = lista[i+2];
			listaDec1[j+3] = lista[i+3];
			
		}
		if(resto != 0) {
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
		
		for(int i = 0; i < listaDec2.length ; i+=6) {
			
			
			for(int j = 0; j < 6; j++) {
				
				binario += Integer.toString(listaDec2[i+j]);
				
			}
			System.out.println(binario);
			
			int decimal = Integer.parseInt(binario, 2);
			binario = "";
			System.out.println(decimal);
			mensaje += alf.charAt(decimal);
			System.out.println(mensaje);
		}
		System.out.println(mensaje);
	}
	
}









