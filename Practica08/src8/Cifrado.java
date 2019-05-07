package src8;

import java.util.HashMap; 

public class Cifrado {

	private long inv = 0;
	private String alf = "aábcdeéfghiíjklmnñoópqrstuúvwxyzAÁBCDEÉFGHIÍJKLMNÑOÓPQRSTUÚVWXYZ0123456789 ,.:-()";
	
	//Ejercicio 1

	//private String texto_01="F�h�YzHX,.Yz UW,xXzYi�uzTzT�zxYH�hxXMzTzXuH-kYV�uzzY��.zYz�YzjUXh8YZzp�uzYkUhh.YV�uzTz,�uzXGYu�Xh-kYV�uzzYz�YhHXuzWwUY�XuMzX,zVXKW�zKXz�YzxY�VYzYxXWH�uYMzzKXz�YzJW�IxhWHYz�Y8zKXz�YzWu�YZ";

	String clave;
	
	public Cifrado(String clave) {
		this.clave = clave;
	}

	public static void main(String[] args) {
		Cifrado c = new Cifrado("daFaÚ:67síKa.Íd:");
		c.sacarMsg();
	}
	
	public void sacarMsg() {
		
		
		//mensaje a descifrar de la pra 8
		String texto_03="DuSqbáZéHdXooDóqúiKrÚífkníV iXúéúnUsP6Zdwd8a5Kláp F Zó,0MÁKn(N-id Va8:8jsfÉMpNúph.A tq,jMnÉeoDuqh SoÓjfknúSraV-irsAqbáZ7ÉíWooE-6óuJrááZ.Ld2uaMdoveAs.if1nú6dkDB6uuÑeálZ0QdXo5ZrahrAg)ék7Kd2uaDvéjuJsÓs)ñHéÉ  bOLÚI7 nQúJ(Nó,5lráwaAdZ6xmsÁÑi.E-X:1x-I5YYr";
		;
		HashMap<String, Integer> posiciones = new HashMap<String, Integer>();
		
		for (int i = 0; i < getAlf().length(); i++) {
			
			posiciones.put(String.valueOf(getAlf().charAt(i)), i);
			
		}
		
		/*
		 * Ejercicio 2 
		 */
		
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
			 
			System.out.print(getAlf().charAt(pos));
			cadena+=getAlf().charAt(pos);
			j++;
			if(j>clave.length()-1) {
				j=0;
			}
		}
		System.out.println(cadena);
		
		
		
		/*
		 * Ejercicio 1
		 */
		/*long modulo = getAlf().length();
		long[] clave_cifrado = new long[2];
		clave_cifrado[0] = 16;
		clave_cifrado[1] = 62;
		String[] text = cadena.split("");
		moduloInverso(clave_cifrado[0], modulo);
		long[] clave_descifrado = new long[2];
		clave_descifrado[0] = getInv();
		
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
			System.out.print(getAlf().charAt((int) pos2));
		}*/
		
	}
	
	
	
	/*
	     * Procedimiento que calcula el m�dulo inverso: (a^-1)( mod n)
	     * pero devuelve false, si no existe el inverso o true en caso
	     * contrario.
	     * Si el valor del inverso es calculado, entonces es almacenado
	     * en la variable global inv
	     **/
	    private boolean moduloInverso(long a, long n){
	    	
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


	    private long[] euclidesExtendido(long a, long b){
	         
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
    private long exponenciacionModular(long a, double k, long n){    
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
    
    private String getAlf() {
		return this.alf;
	}


	private long getInv() {
		return inv;
	}


	private void setInv(long inv) {
		this.inv = inv;
	}
	

}
