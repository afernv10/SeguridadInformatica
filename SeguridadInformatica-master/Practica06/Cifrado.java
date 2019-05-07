
import java.util.HashMap; 

public class Cifrado {

	private long inv = 0;
	private String alf = "a�bcde�fghi�jklmn�o�pqrstu�vwxyzA�BCDE�FGHI�JKLMN�O�PQRSTU�VWXYZ0123456789 ,.:-()";
	
	//Ejercicio 1

	//private String texto_01="F�h�YzHX,.Yz UW,xXzYi�uzTzT�zxYH�hxXMzTzXuH-kYV�uzzY��.zYz�YzjUXh8YZzp�uzYkUhh.YV�uzTz,�uzXGYu�Xh-kYV�uzzYz�YhHXuzWwUY�XuMzX,zVXKW�zKXz�YzxY�VYzYxXWH�uYMzzKXz�YzJW�IxhWHYz�Y8zKXz�YzWu�YZ";

	
	
	public Cifrado() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		
		Cifrado cifrado = new Cifrado();
		//Ejercicio 1
		
		String texto_01="F�h�YzHX,.Yz UW,xXzYi�uzTzT�zxYH�hxXMzTzXuH-kYV�uzzY��.zYz�YzjUXh8YZzp�uzYkUhh.YV�uzTz,�uzXGYu�Xh-kYV�uzzYz�YhHXuzWwUY�XuMzX,zVXKW�zKXz�YzxY�VYzYxXWH�uYMzzKXz�YzJW�IxhWHYz�Y8zKXz�YzWu�YZ";
		//Ejercicio 2

		String texto_02="z�(vxmaumEl39:lsheumcE52plimoom�Aejmhq-i�r�fcim-yha.yC�el -�oe.ryle-:me3 hr��0mgd�4 nvrl)93B(krq�px02 -yh �Amxci4-�oi�scx1m3-x(mj�ifcim-mhvjKpn--5";

		//Ejercicio 3

		String texto_03="k.whh)ChQlp4JwhjGzhn8K4Rb)3td0Z3SJFtQp�An��Z)�";
		
		HashMap<String, Integer> posiciones = new HashMap<String, Integer>();
		
		for (int i = 0; i < cifrado.getAlf().length(); i++) {
			
			posiciones.put(String.valueOf(cifrado.getAlf().charAt(i)), i);
			
		}
		
		/*
		 * Ejercicio 2 
		 */
		String clave = "09 de abril";
		long[] sigma = new long[clave.length()];
		for (int i = 0; i < clave.length(); i++) {
			
			sigma[i] = posiciones.get(String.valueOf(clave.charAt(i)));
			//System.out.println(sigma[i]);
		}
		int j = 0;
		String cadena = "";
		for (int i = 0; i < texto_03.length(); i++) {
			
			int pos = posiciones.get(String.valueOf(texto_03.charAt(i)));
			
			pos -= sigma[j];
			 if(pos<0)
				 pos+=81;
			 
			System.out.print(cifrado.getAlf().charAt(pos));
			cadena+=cifrado.getAlf().charAt(pos);
			j++;
			if(j>10) { // clave leng -1
				j=0;
			}
		}
		System.out.println(cadena);
		
		
		
		/*
		 * Ejercicio 1
		 */
		long modulo = cifrado.getAlf().length();
		long[] clave_cifrado = new long[2];
		clave_cifrado[0] = 16;
		clave_cifrado[1] = 62;
		String[] text = cadena.split("");
		cifrado.moduloInverso(clave_cifrado[0], modulo);
		long[] clave_descifrado = new long[2];
		clave_descifrado[0] = cifrado.getInv();
		
		clave_descifrado[1] = ((-clave_descifrado[0] * clave_cifrado[1]) % modulo);
		if(clave_descifrado[1]<0) {
			
			clave_descifrado[1] +=  modulo; 
		}
		
		System.out.println(clave_descifrado[0]+", "+clave_descifrado[1]);
		
		 
		
		//System.out.println(posiciones);
		for (int i = 0; i < cadena.length(); i++) {
			
			Integer pos = posiciones.get(text[i]);
			
			long pos2 = (clave_descifrado[0] * pos + clave_descifrado[1]) % modulo;
			//System.out.println(pos);
			//System.out.println(pos2);
			System.out.print(cifrado.getAlf().charAt((int) pos2));
		}
		
		
		
	}
	
	
	
	/*
	     * Procedimiento que calcula el m�dulo inverso: (a^-1)( mod n)
	     * pero devuelve false, si no existe el inverso o true en caso
	     * contrario.
	     * Si el valor del inverso es calculado, entonces es almacenado
	     * en la variable global inv
	     **/
	    public boolean moduloInverso(long a, long n){
	    	
	           long[] resp = new long[3];           
	           resp = euclidesExtendido(a,n);
	           
	           if(resp[0]>1)
	                return false;
	                
	           else{
	        	   
	               if(resp[1]<0)
	                   inv = resp[1]+n; //por si sale negativo
	               else
	                   inv = resp[1];
	           
	               return true;
	           }
	    } 
	    
	    /* procedimiento que calcula el valor del maximo com�n divisor
	    * de a y b siguiendo el algoritmo de euclides extendido,
	    * devolviendo en un arreglo la siguiente estructura [d,x,y]
	    * donde:
	    *    mcd(a,b) = d = a*x + b*y
	    **/	


	    public long[] euclidesExtendido(long a, long b){
	         
	    	long[] resp = new long[3];
	         long x=0,y=0,d=0;
	    		
	         if(b==0){
	        	 resp[0] = a;	resp[1] = 1;	resp[2] = 0;
	         }else{
	    	
	        	long x2 = 1, x1 = 0, y2 = 0, y1 = 1;
	        	long q = 0, r = 0;
		    			
		    	while(b>0){
			    	q = (a/b);
			    	r = a - q*b;
			    	x = x2-q*x1;
			    	y = y2 - q*y1;
			    	a = b;
			    	b = r;
			    	x2 = x1;
			    	x1 = x;
			    	y2 = y1;
			    	y1 = y;
		    	}
		    			
		    	resp[0] = a;
		    	resp[1] = x2;
		    	resp[2] = y2;
	        }
	     
	        return resp;		
	    } 
	
	/*
     *  exponenciaci�n modular (a^k)(mod n)
     * algoritmo del cuadrado y multiplicaci�n repetida
     *
     **/
    public long exponenciacionModular(long a, double k, long n){    
        long b = 1;
            
        if(k==0)
            return b;
            
        long A = a;
        
        if(k%2==1)
            b = a;
            
        while((k = k/2)!=0){ 
        	
            A = (A*A)%n;
            if(k%2==1)
                b=(A*b)%n;    
        }
        return b;    
    } 
    
    public String getAlf() {
		return this.alf;
	}


	public long getInv() {
		return inv;
	}


	public void setInv(long inv) {
		this.inv = inv;
	}
	

}
