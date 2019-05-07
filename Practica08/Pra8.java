import java.math.BigInteger;
import java.util.Scanner;

import src8.Cifrado;
import src8.CodificacionTextoNumero;
import src8.DiffieHellman;
import src8.PotenciacionModular;



public class Pra8 {

	private String alf = "aábcdeéfghiíjklmnñoópqrstuúvwxyzAÁBCDEÉFGHIÍJKLMNÑOÓPQRSTUÚVWXYZ0123456789 ,.:-()";

	public static void main(String[] args) {
			Pra8 pra8 = new Pra8();
			pra8.inicializar();
	}

	private void inicializar() {
		// BigInteger p = 412393132131414242343537725369;
		// b= 574294653412121214213
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("p");
		BigInteger p = sc.nextBigInteger();
		
		System.out.println("b");
		BigInteger b = sc.nextBigInteger();*/
		
		BigInteger g = BigInteger.valueOf(3);
		
		//String A = "�AlmTk7OyL0�e��1";
		//String B = "boc ��7B-�Y�9ZIR";
		
		DiffieHellman dh = new DiffieHellman();
		String claveK = dh.sacarClaveCompartida();
		Cifrado c = new Cifrado(claveK);
		c.sacarMsg();

	}

}
