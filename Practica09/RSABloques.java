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

		MarÃƒÂ­a
		n=8849169404252643679
		e=196413997
		n=2974755337 * 2974755367

		Juan
		n=5244938048376303456108649
		e=114340249
		n=2290182972661 * 2290182972709 p y q
		*/
		//System.out.println(alf.length());
		//String modelo1 = "wVBÃƒÂ±ÃƒÂº94wAU9gaÃƒâ€œc66:YCÃƒÂºVIwAlk)U9ULBMQ)-7caÃƒÂ³NS8nvB08h 8ÃƒÂºÃƒï¿½tÃƒâ€˜J)Ã‚Â¿sYqLBÃƒï¿½4duCsfkÃƒÂ³x)aKE9(3:Hf(Ã‚Â¿NmoGÃƒÂ±!DABBÃƒâ€˜6eÃƒâ€˜rGUPÃƒÂ¡bCÃƒÂ±tdawqbÃƒÂ­VWPbÃƒÂ©ecJÃƒâ€˜M)LAcÃ‚Â¿2ywRrÃƒÂ±rth,896u6on?7b5J81v(LFTÃƒâ€°ÃƒÂ³N?sNB!ÃƒÂ±r,:b877da4ÃƒÂ±4??8hdG ";

		//String modelo2 = "ihJACM?NM?IXCÃƒâ€˜ÃƒÅ¡ÃƒÂ­2ZoAÃƒÂ³xÃ‚Â¿eyK1(ÃƒÂ­iv7ctw!q2,whCX-x!5Ãƒâ€°qÃƒÂ±Ã‚Â¿aÃ‚Â¿3CkO?gDsvNOQZEBÃƒï¿½Ãƒâ€°tbIÃƒÅ¡GTEa-rMmjÃ‚Â¿wwpwhN6sJÃƒÂ­XbldcÃƒâ€˜zZw)XhS hÃƒÂ±7Zr8U11YThAÃƒÂ³8Ãƒâ€œ5ÃƒÂ©jÃƒÂ­ÃƒÂºÃ‚Â¿toyI.ÃƒÅ¡qÃƒÂ©tÃƒï¿½Ãƒï¿½MÃƒÂ¡Tk3MsMpT?,Ãƒï¿½ÃƒÅ¡MÃƒÂ±DaIU9Ã‚Â¿FÃƒÅ¡dKMcHB!!4:cIÃƒÂ©TtB.ÃƒÂ¡5-8HcÃƒÂ©ÃƒÂ­9T";

		String modelo3 = "júI,¿ Qb9,a5Ljw5DdgnwwEu áFsTlEp.éCkÍR.xjdj0X¿ñ8thÓxuZ.SgÑmAEIÍPJjóíJ2t:7cPApÉC2ncÉÓ?ñám¿J)trZ4gFú?kZÉAXñd6F¿0cm4hO?Jxc,q 2P,V7tóÑndoÚAadÓPAGLcbWDÑ(1pncYPnNKw:iéóEMívfZPDPa6ÍKU3mXkÓ)Ef1eÉy4GjLdxE";
		//String modelo4 ="BUL mzaR3Qx-OÃƒÂ­QDM6EagkWFbbÃ‚Â¿V7loJHpÃƒâ€œÃƒÂ©caxLLBuÃƒÂº28VÃ‚Â¿Ãƒï¿½Ãƒï¿½ETÃƒÂ¡Ãƒï¿½KqEcFÃƒÂ³Ãƒâ€˜UV1vu5rRxIchMiSikUpyAqXuÃƒï¿½vjWccDbUV3-S9VMÃƒÅ¡DÃƒÂ³ÃƒÂ©Ãƒâ€˜KKHdeWfphL2AoHKÃƒÂ­BpcuOKO-kÃƒÂºYhÃƒÂºMNo95uc20sw1BeMÃƒÂ±j(v-ÃƒÂ±z:ÃƒÂ³MwÃƒÂ¡PVjqK66Vonegcy1zvUgAÃƒï¿½5eM5YSQG3e)EÃƒÂºrmkj";

		
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
		/*BigInteger p = new BigInteger("2290182972661");
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
		System.out.println("\n");
		System.out.println(mensaje_claro);
		
		*/
		
		/*
		 * 
		 * 
		 *    CODIFICAR
		 * 
		 * 
		 * 
		 */
		String mensaje = "Esto es una prueba";
		
		BigInteger p = new BigInteger("2974755337");
		BigInteger q = new BigInteger("2974755367");
		BigInteger n = new BigInteger("8849169404252643679");
		BigInteger e = new BigInteger("196413997");
		BigInteger k = BigInteger.valueOf(9);
		//BigInteger fi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
		//BigInteger d = e.modInverse(fi);
		
		
		
		System.out.println("Codificar: "+mensaje);
		//codificar(mensaje, k.intValue(), map_posiciones);
		
		String[] secuencias = getSecuencias(k.intValue(), mensaje);
		for (int i = 0; i < secuencias.length; i++) {
			System.out.println(secuencias[i]);
		}
		
		int[][] posiciones = getPosicionesSecuencias(secuencias, k.intValue(), map_posiciones);
		
		for (int i = 0; i < posiciones.length; i++) {
			for (int j = 0; j < posiciones[0].length; j++) {
				System.out.print(posiciones[i][j]+" ");
			}
			System.out.println();
		}
		
		ArrayList<BigInteger> m = new ArrayList<BigInteger>();
		//con esto sacamos las "m"
		for (int i = 0; i < posiciones.length; i++) {
			m.add(listaNumero(posiciones[i]));
		}
		
		ArrayList<BigInteger> modulos = new ArrayList<BigInteger>();
		
		//calculanmos "c"
		for (BigInteger bi : m) {
			modulos.add(bi.modPow(e, n)); //aqui dentro se esta calculando todas las "m"
			
		}
		String mensaje_codificado = "";
		//las c en modulo alf.lenght
		for (BigInteger bigInteger : modulos) {
			mensaje_codificado += codificacionNumero(bigInteger, k.intValue());
		}
		
		System.out.println(mensaje_codificado);
		
	}
	
	
	public String codificacionNumero(BigInteger numero, int k) {
		
		
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
		
		
		
		System.out.println(restos.toString() +" l: "+restos.size());
		if(restos.size() == (k-1)) { // Poner k-1
			restos.add(BigInteger.ZERO);
		}
		for (BigInteger bi : restos) {
			//System.out.println(alf.charAt(bi.intValue()));
			text = text + alf.charAt(bi.intValue());
		}
		
		for (int i = text.length() - 1; i >= 0; i--) {
			mensaje_claro = mensaje_claro + text.charAt(i);
		}


		return mensaje_claro;
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
		
		
		
		System.out.println(restos.toString() +" l: "+restos.size());
		if(restos.size() == 11) { // Poner k-1
			restos.add(BigInteger.ZERO);
		}
		for (BigInteger bi : restos) {
			//System.out.println(alf.charAt(bi.intValue()));
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
		
		
		String[] secuencias = new String[modelo_long/grupos]; //TODO comprobar si la division no es exacta para aÃƒÂ±adir una posicion mas al vector
		
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
