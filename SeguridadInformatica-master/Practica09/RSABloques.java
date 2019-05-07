import java.math.BigInteger;

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

		María
		n=8849169404252643679
		e=196413997
		n=2974755337 * 2974755367

		Juan
		n=5244938048376303456108649
		e=114340249
		n=2290182972661 * 2290182972709 p y q
		*/
		System.out.println(alf.length());
		String modelo1 = "wVBñú94wAU9gaÓc66:YCúVIwAlk)U9ULBMQ)-7caóNS8nvB08h 8úÍtÑJ)¿sYqLBÁ4duCsfkóx)aKE9(3:Hf(¿NmoGñ!DABBÑ6eÑrGUPábCñtdawqbíVWPbéecJÑM)LAc¿2ywRrñrth,896u6on?7b5J81v(LFTÉóN?sNB!ñr,:b877da4ñ4??8hdG ";

		String modelo2 = "ihJACM?NM?IXCÑÚí2ZoAóx¿eyK1(íiv7ctw!q2,whCX-x!5Éqñ¿a¿3CkO?gDsvNOQZEBÍÉtbIÚGTEa-rMmj¿wwpwhN6sJíXbldcÑzZw)XhS hñ7Zr8U11YThAó8Ó5éjíú¿toyI.ÚqétÁÍMáTk3MsMpT?,ÍÚMñDaIU9¿FÚdKMcHB!!4:cIéTtB.á5-8Hcéí9T";

		String modelo3 = "júI,¿ Qb9,a5Ljw5DdgnwwEu áFsTlEp.éCkÍR.xjdj0X¿ñ8thÓxuZ.SgÑmAEIÍPJjóíJ2t:7cPApÉC2ncÉÓ?ñám¿J)trZ4gFú?kZÉAXñd6F¿0cm4hO?Jxc,q 2P,V7tóÑndoÚAadÓPAGLcbWDÑ(1pncYPnNKw:iéóEMívfZPDPa6ÍKU3mXkÓ)Ef1eÉy4GjLdxE";
	
		String modelo4 ="BUL mzaR3Qx-OíQDM6EagkWFbb¿V7loJHpÓécaxLLBuú28V¿ÍÍETáÁKqEcFóÑUV1vu5rRxIchMiSikUpyAqXuÍvjWccDbUV3-S9VMÚDóéÑKKHdeWfphL2AoHKíBpcuOKO-kúYhúMNo95uc20sw1BeMñj(v-ñz:óMwáPVjqK66Vonegcy1zvUgAÍ5eM5YSQG3e)Eúrmkj";

		
		//para sacar K --> floor(logn/log alf.leng)  MAXIMA caso de juan --> 12
		//BigInteger e = new BigInteger("269");
		//BigInteger fi = new BigInteger("672");
		/*
		 * Maria a Juan con modelo 3
		 */
		// Juan
		BigInteger p = new BigInteger("2290182972661");
		BigInteger q = new BigInteger("2290182972709");
		BigInteger n = new BigInteger("5244938048376303456108649");
		BigInteger e = new BigInteger("114340249");
		BigInteger k = BigInteger.valueOf(12); // para el caso de juan, para descifrar es k+1
		
		
		BigInteger fi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
		System.out.println("fi: "+fi);
		
		System.out.println("d: "+e.modInverse(fi)); // clave privada
		
		//TODO dividir en bloques de 13 (k+1) el modelo 3
		// asociar cada letra con la posicion -1 del alf --> sacamos esa lista
		// pasar esa lista a un umero entero de base alf.lengh
		//por cada numero de bloque iobtenido hacer su modulo en n
		//ese numero "m"  y el cociente en primer lugar y el resto en segundo lugar
		
		//***** si popr ejemplo tenemos m inferior a alf.lengh --> añadimos ceros a la izda
		
	}
	
	

}
