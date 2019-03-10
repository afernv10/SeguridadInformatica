package src;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HuffmanBinario {

	static ArrayList<HuffmanNode> listaNodos = new ArrayList<HuffmanNode>();
	static ArrayList<HuffmanNode> listaInicial = new ArrayList<HuffmanNode>();
	static HuffmanNode root;
	
	public static void main(String[] args) {
		/**
		 * Ejercicio 1
		 */
		//int[] probs = {30, 20, 10, 10, 5, 5, 5, 5, 5, 5};
		//char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
		
		/**
		 * Ejercicio 2
		 */
		//double[] probs = {27, 16, 4, 56, 22, 2, 78, 45, 36, 13, 12, 7};
		//char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l' };
		
		/**
		 * Practica 3
		 */
		double[] probs = {83, 69, 67, 82, 69, 84, 79, 32, 68, 69, 32, 85, 78, 79, 32, 83, 69, 67, 82, 69, 84, 79, 32, 83, 69, 71, 85, 82, 79};
		String[] charArray = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "X", "Y", "Z"  };
		int fuente = 2;
		
		// Priority queue
        /*PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(probs.length, new ComparadorProbs()); 
        for (int i = 0; i < probs.length; i++) { 
  
        	//Creamos el nodo con sus hijos a null, tambien inicializamos su posicion y valores.
            HuffmanNode hn = new HuffmanNode(); 
  
            hn.setC(charArray[i]); 
            hn.setValor(probs[i]); 
  
            hn.setLeft(null);
            hn.setRight(null); 
  
            //Añadimos el nodo a la cola
            q.add(hn); 
        }*/
        
        crearListaSegunFuente(fuente, probs, charArray);
		
        PriorityQueue<HuffmanNode> q = crearPriorityQueue(listaInicial.size());
        
        crearArbol(q);
		
		printCode(root, "");
		
		double valorTotal = root.getValor();
		
		double longMedia = calcularLongitudMedia(valorTotal);
		
		double entropia = calcularEntropia(root.getValor());
		
		double eficacia = calcularEficacia(entropia, longMedia, fuente);
		
		System.out.println("\nValor total: " + root.getValor());
		System.out.println("\nLongitud media: " + String.format("%.4f", longMedia));
		System.out.println("\nEntropía: " + String.format("%.5f", entropia));
		System.out.println("\nEficacia con fuente " + fuente + ": " + String.format("%.5f", eficacia));
	}
	
	

	private static PriorityQueue<HuffmanNode> crearPriorityQueue(int numeroDeValores) {
		PriorityQueue<HuffmanNode> ret = new PriorityQueue<HuffmanNode>(numeroDeValores, new ComparadorProbs()); 
        for (int i = 0; i < numeroDeValores; i++) { 
   
           //Añadimos el nodo a la cola
            ret.add(listaInicial.get(i)); 
        }
        return ret;
	}



	private static void crearListaSegunFuente(int fuente, double[] probs, String[] charArray) {

		String charAcum = "";
		double valorAcum = 0;

		for (int i = 0; i < charArray.length; i++) {
			if (fuente == 1) {

				HuffmanNode hn = new HuffmanNode();
				hn.setC(charArray[i]);
				hn.setLeft(null);
				hn.setRight(null);
				hn.setValor(probs[i]);

				listaInicial.add(hn);
			} else {
				charAcum = charArray[i];
				valorAcum = probs[i];

				for (int nFuente = 1; nFuente < fuente; nFuente++) {
					// dependiendo de qué fuente extendida sea iteramos tantas veces

					for (int j = 0; j < charArray.length; j++) {
						HuffmanNode hn = new HuffmanNode();
						hn.setC((charAcum + charArray[j]));
						hn.setLeft(null);
						hn.setRight(null);
						hn.setValor((valorAcum * probs[j]));

						listaInicial.add(hn);
					}
				}
			}

		}
	}

	private static void crearArbol(PriorityQueue<HuffmanNode> q) {
		root = null;
		
		while (q.size() > 1) {

			HuffmanNode padre1 = q.poll();
			//System.out.print("padre: "+padre1.getC() + "[" +  padre1.getValor() + "]");
		
			// second min extract.
			HuffmanNode padre2 = q.poll();
			//System.out.println(" padre: "+padre2.getC() + "[" +  padre2.getValor() + "]");
			
			// creamos el hijo
			HuffmanNode hijo = new HuffmanNode();

			//Realizamos la suma de las frecuancias de los nodos padre
			hijo.setValor(padre1.getValor() + padre2.getValor());
			hijo.setC("-");
			//System.out.println("Hijo: valor: " +hijo.getC() + "[" +  hijo.getValor() + "]");

			// first extracted node as left child.
			hijo.setLeft(padre1);
			
			// second extracted node as the right child.
			hijo.setRight(padre2);

			// Marcamos al nodo resultante como la nueva root
			root = hijo;

			// añadimos el nodo hijo a la cola de prioridad
			q.add(hijo);

		}
	}

	private static double calcularLongitudMedia(double valorTotal) {
		double ret = 0;
		for (HuffmanNode huffmanNode : listaInicial) {
			ret+= huffmanNode.getValor()*huffmanNode.getLongitudCode();
		}
		return ret/valorTotal;
	}
	
	private static double calcularEntropia(double sumaProbs) {
		double ret = 0;
		// Fórmula: prob/sumaprob
		for (HuffmanNode huffmanNode : listaInicial) {
			
			ret+= (huffmanNode.getValor()/sumaProbs) * log2((sumaProbs/huffmanNode.getValor()));
		}
		return ret;
	}
	
	private static double log2(double d) {
		double r = Math.log(d)/Math.log(2);
		return r;
	}
	
	private static double calcularEficacia(double entropia, double longMedia, int fuente) {
		return (entropia)/longMedia;
	}

	// recursive function to print the 
    // huffman-code through the tree traversal. 
    // Here s is the huffman - code generated. 
    public static void printCode(HuffmanNode root, String s) { 
  
     
    	//Este es es caso base en el que el valor es 1.0 y el valor de la posicion es el por defect --> "-"
    	// y ademas no tiene ramas derecha ni izquierda.
    	// El parametro "s" es generado a traves de arbol
        if (root.getLeft() == null && root.getRight() == null && checkIsLetter(root.getC())) { 
   
            root.setCode(s);
            root.setLongitudCode(s.length());
            //listaNodos.add(root);	// No es necesario ahora ya
            System.out.println(root.getC() + ":" + root.getCode() + " l[" + root.getLongitudCode() + "]");
            
            return; 
        } 
  
        // Si vamos a la izquierda ponemos un 1 a la s 
        // Si vamos a la derecha ponemos un 0 a la s  
  
        printCode(root.getLeft(), s + "1"); 
        printCode(root.getRight(), s + "0");  
    }

	private static boolean checkIsLetter(String c) {
		if (c == null) { // checks if the String is null
			return false;
		}

		int len = c.length();
		for(int i = 0;i<len;i++) {
		// checks whether the character is neither a letter nor a digit
		// if it is neither a letter nor a digit then it will return false
			if ((Character.isLetterOrDigit(c.charAt(i)) == false)) {
				return false;
			}
		}
		return true;
	}

}

class ComparadorProbs implements Comparator<HuffmanNode> {

	@Override
	public int compare(HuffmanNode o1, HuffmanNode o2) {
		// TODO Auto-generated method stub
		
		if (o1.getValor() < o2.getValor()) return -1;
        if (o1.getValor() > o2.getValor()) return 1;
        //if(Math.abs(o1.getValor()-o2.getValor()) < ERR) return 0;
        return 0;
		
		//return Double.compare(o1.getValor(), o2.getValor());
	}

}
