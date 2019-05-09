import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class RSABloques {

	private String alf="abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZáéíóúÁÉÍÓÚ0123456789 ,.:!-¿?()";
	
	public RSABloques() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RSABloques rsab = new RSABloques();
		rsab.operar();
		
		
		
	}
	public void operar() {
		
		/*
		Pepa    
		n=62439738695706104201747 
		e=356812573 
		n=249879448303 * 249879448349

		Benito
		n=743330222539755158153
		e=80263681
		n=27264083009 * 27264083017

		MarÃ­a
		n=8849169404252643679
		e=196413997
		n=2974755337 * 2974755367

		Juan
		n=5244938048376303456108649
		e=114340249
		n=2290182972661 * 2290182972709 p y q
		*/
		//System.out.println(alf.length());
		//String modelo1 = "wVBÃ±Ãº94wAU9gaÃ“c66:YCÃºVIwAlk)U9ULBMQ)-7caÃ³NS8nvB08h 8ÃºÃ�tÃ‘J)Â¿sYqLBÃ�4duCsfkÃ³x)aKE9(3:Hf(Â¿NmoGÃ±!DABBÃ‘6eÃ‘rGUPÃ¡bCÃ±tdawqbÃ­VWPbÃ©ecJÃ‘M)LAcÂ¿2ywRrÃ±rth,896u6on?7b5J81v(LFTÃ‰Ã³N?sNB!Ã±r,:b877da4Ã±4??8hdG ";

		//String modelo2 = "ihJACM?NM?IXCÃ‘ÃšÃ­2ZoAÃ³xÂ¿eyK1(Ã­iv7ctw!q2,whCX-x!5Ã‰qÃ±Â¿aÂ¿3CkO?gDsvNOQZEBÃ�Ã‰tbIÃšGTEa-rMmjÂ¿wwpwhN6sJÃ­XbldcÃ‘zZw)XhS hÃ±7Zr8U11YThAÃ³8Ã“5Ã©jÃ­ÃºÂ¿toyI.ÃšqÃ©tÃ�Ã�MÃ¡Tk3MsMpT?,Ã�ÃšMÃ±DaIU9Â¿FÃšdKMcHB!!4:cIÃ©TtB.Ã¡5-8HcÃ©Ã­9T";

		String modelo3 = "júI,¿ Qb9,a5Ljw5DdgnwwEu áFsTlEp.éCkÍR.xjdj0X¿ñ8thÓxuZ.SgÑmAEIÍPJjóíJ2t:7cPApÉC2ncÉÓ?ñám¿J)trZ4gFú?kZÉAXñd6F¿0cm4hO?Jxc,q 2P,V7tóÑndoÚAadÓPAGLcbWDÑ(1pncYPnNKw:iéóEMívfZPDPa6ÍKU3mXkÓ)Ef1eÉy4GjLdxE";
		//String modelo4 ="BUL mzaR3Qx-OÃ­QDM6EagkWFbbÂ¿V7loJHpÃ“Ã©caxLLBuÃº28VÂ¿Ã�Ã�ETÃ¡Ã�KqEcFÃ³Ã‘UV1vu5rRxIchMiSikUpyAqXuÃ�vjWccDbUV3-S9VMÃšDÃ³Ã©Ã‘KKHdeWfphL2AoHKÃ­BpcuOKO-kÃºYhÃºMNo95uc20sw1BeMÃ±j(v-Ã±z:Ã³MwÃ¡PVjqK66Vonegcy1zvUgAÃ�5eM5YSQG3e)EÃºrmkj";

		
		//para sacar K --> floor(logn/log alf.leng)  MAXIMA caso de juan --> 12
		//BigInteger e = new BigInteger("269");
		//BigInteger fi = new BigInteger("672");
		/*
		 * Maria a Juan con modelo 3
		 */
		
		HashMap<String, Integer> map_posiciones = new HashMap<String, Integer>();
		
		for (int i = 0; i < alf.length(); i++) { //metemos cada letra y su posicion en un hash map
			
			map_posiciones.put(String.valueOf(alf.charAt(i)), i);
			
		}
	
		// Juan
		BigInteger p = new BigInteger("2290182972661");
		BigInteger q = new BigInteger("2290182972709");
		BigInteger n = new BigInteger("5244938048376303456108649");
		BigInteger e = new BigInteger("114340249");
		BigInteger k = BigInteger.valueOf(12); // para el caso de juan, para descifrar es k+1
		
		
		BigInteger fi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
		//System.out.println("fi: "+fi);
		//System.out.println("modelo3 long: "+modelo3.length());
		BigInteger d = e.modInverse(fi);
		//System.out.println("d: "+d); // clave privada
		
		// dividir en bloques de 13 (k+1) el modelo 3
		// asociar cada letra con la posicion -1 del alf --> sacamos esa lista
		// pasar esa lista a un umero entero de base alf.lengh
		//por cada numero de bloque iobtenido hacer su modulo en n
		//ese numero "m"  y el cociente en primer lugar y el resto en segundo lugar
		
		//dividir en bloques de 13 el modelo 3
		String[] secuencias = getSecuencias(13, modelo3); // este 13 se calcula con maxima (floor) y ese valor +1
		for (int i = 0; i < secuencias.length; i++) {
			System.out.println(secuencias[i]);
		}
		
		// obtenemos la lista de posiciones de cada secuencia de 13 (en este caso)
		int[][] posiciones = getPosicionesSecuencias(secuencias, k.add(BigInteger.ONE).intValue(), map_posiciones);
		
		for (int i = 0; i < posiciones.length; i++) {
			
			for (int j = 0; j < posiciones[0].length; j++) {
				
				System.out.print(posiciones[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		//pasamos cada lista a numero, y guardamos todos los BigInteger en un arraylist
		ArrayList<BigInteger> numeros = new ArrayList<BigInteger>();
		
		for (int i = 0; i < posiciones.length; i++) {
			
			numeros.add(listaNumero(posiciones[i]));
		}
		
		//Cada bigInteger (elevado a d) hacemos su modulo en "n"
		ArrayList<BigInteger> modulos = new ArrayList<BigInteger>();

		for (BigInteger bi : numeros) {
			modulos.add(bi.modPow(d, n)); //aqui dentro se esta calculando todas las "m"
			
		}
		
		
		String mensaje_claro = "";
		
		
		//TODO revisar esta parte
		for (BigInteger bi : modulos) { // tenemos todas las "m", ahora hay que sacar el cociente y el resto de cada una dividiendo entre alf.lengh
			mensaje_claro += decodificacionNumero(bi);
		}
		
		System.out.println(mensaje_claro);
	}
	
	
	
	public String decodificacionNumero(BigInteger numero) {
		String text = "";
		String mensaje_claro = "";
		BigInteger resto = BigInteger.valueOf(0);
		
		ArrayList<BigInteger> restos = new ArrayList<BigInteger>();
		
		
		while (numero.divide(BigInteger.valueOf(alf.length())) != BigInteger.valueOf(0)) {
			resto = numero.remainder(BigInteger.valueOf(alf.length()));
			numero = numero.divide(BigInteger.valueOf(alf.length()));
			restos.add(resto);
		}
		restos.add(numero);

		for (BigInteger bi : restos) {
			text = text + alf.charAt(bi.intValue());
		}
		
		for (int i = text.length() - 1; i >= 0; i--) {
			mensaje_claro = mensaje_claro + text.charAt(i);
		}


		return mensaje_claro;
	}
	
	
	
	
	/**
	 * Este metodo esta cogido de la clase CodificacionTextoNumero de la ractica 7
	 * @param lista
	 * @return
	 */
	public BigInteger listaNumero(int[] lista) {
		
		int exponente = lista.length-1;
		BigInteger num = BigInteger.ZERO;
		
		for (int i = 0; i < lista.length; i++) {
			//System.out.println(exponente);
			// OJO tiene que estar todo en BigInteger, si no no funciona
			num = num.add((BigInteger.valueOf(lista[i]).multiply(BigInteger.valueOf(alf.length()).pow(exponente))));
			exponente--;
		}
		
		return num;

	}
	
	
	
	
	/**
	 * Pasa las secuencias del modelo ya obtenidas a una matriz con cada letra a su posicion asociada de la lista
	 * @param secuencias
	 * @param grupos
	 * @return
	 */
	private int[][] getPosicionesSecuencias(String[] secuencias, int grupos, HashMap<String, Integer> map_posiciones){
		
		int[][] posiciones = new int[secuencias.length][grupos];
		
		
		// en cada secuencias de 13 congemos 1 a 1 cada letra y metemos en la matriz de posiciones su respectiva posicion
		// para entenderlo mejor, imprimir el array de secuencias antes de este paso, y cada letra seria una posicion, y esa posicion se mete en la matriz de posiciones
		for (int i = 0; i < posiciones.length; i++) {
			
			for (int j = 0; j < posiciones[0].length; j++) {
				
				posiciones[i][j] = map_posiciones.get(String.valueOf(secuencias[i].charAt(j))); //en cada i de secuencias hay 13 letras, y j recorre esas letras y las pasa a las columnas de la matriz posiciones
			}
		}
		
		
		return posiciones;
	}
	
	
	/**
	 * 
	 * @param grupos de cuanto en cuanto se quiere dividir (k+1)
	 * @param modelo_long para saber la longitud del modelo que se quiere tratar (esto / grupos seran las filas
	 * @return
	 */
	private String[] getSecuencias(int grupos, String modelo) {
		int modelo_long = modelo.length();
		
		
		String[] secuencias = new String[modelo_long/grupos]; //TODO comprobar si la division no es exacta para aÃ±adir una posicion mas al vector
		
		int bloquesNi = 0, bloquesNj = grupos;
		for (int i = 0; i < secuencias.length; i++) {
			
			secuencias[i] = modelo.substring(bloquesNi, bloquesNj);//coge substring de 13 en 13 si grupos = 13
			bloquesNi += grupos;
			bloquesNj += grupos;
		}

		// imprimeMatriz(secuencias);

		// Trasponemos las secuencias para poder multiplicar, cada columna sera
		// un sindrome una vez multiplicado por la matriz de control

		// imprimeMatriz(traspuesta(secuencias));
		return secuencias;

	}

}
