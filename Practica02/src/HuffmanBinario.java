import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HuffmanBinario {

	static ArrayList<HuffmanNode> listaNodos = new ArrayList<HuffmanNode>();
	
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
		 * Ejercicio 3
		 */
		
		
		String texto = "Existe una cosa muy misteriosa, pero muy cotidiana."
				+ " Todo el mundo participa de ella, todo el mundo la conoce, pero muy pocos se paran a pensar en ella."
				+ " Casi todos se limitan a tomarla como viene, sin hacer preguntas."
				+ "Esta cosa es el tiempo.";
		
		Practica practica2 = new Practica(texto);
		
		ArrayList<Letra> letras = new ArrayList<Letra>();
		
		letras = practica2.getLetras();
		
		
		double[] probs = new double[letras.size()];
		char[] charArray = new char[letras.size()];
		
		int j = 0;
		for(Letra l : letras){
			if (l.getLetra() == ' ') {
				l.setLetra('-');
			}
			 probs[j] = l.getProbabilidad()*100;
			 charArray[j] = l.getLetra();
			 System.out.println(charArray[j]+" --> "+probs[j]);
			 j++;
		}
		
		
		// Priority queue
        PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(probs.length, new ComparadorProbs()); 
        
        for (int i = 0; i < probs.length; i++) { 
  
        	//Creamos el nodo con sus hijos a null, tambien inicializamos su posicion y valores.
            HuffmanNode hn = new HuffmanNode(); 
  
            hn.setC(charArray[i]); 
            hn.setValor(probs[i]); 
  
            hn.setLeft(null);
            hn.setRight(null); 
  
            //Añadimos el nodo a la cola
            q.add(hn); 
            
        }
		//Creamos la raiz del arbol
        HuffmanNode root = null;
       
		while (q.size() > 1) {

			HuffmanNode padre1 = q.poll();
			System.out.print("padre: "+padre1.getC() + "[" +  padre1.getValor() + "]");
		
			// second min extarct.
			HuffmanNode padre2 = q.poll();
			System.out.println(" padre: "+padre2.getC() + "[" +  padre2.getValor() + "]");
			
			// creamos el hijp
			HuffmanNode hijo = new HuffmanNode();

			//Realizamos la suma de las frecuancias de los nodos padre
			hijo.setValor(padre1.getValor() + padre2.getValor());
			hijo.setC('*');
			System.out.println("Hijo: valor: " +hijo.getC() + "[" +  hijo.getValor() + "]\n");

			// first extracted node as left child.
			hijo.setLeft(padre1);
			
			// second extracted node as the right child.
			hijo.setRight(padre2);

			// Marcamos al nodo resultante como la nueva root
			
			root = hijo;
			
			// añadimos el nodo hijo a la cola de prioridad
			q.add(hijo);

		}
		
		
		printCode(root, "");
		
		double valorTotal = root.getValor();
		
		double longMedia = calcularLongitudMedia(valorTotal);
		
		System.out.println("\nLongitud media: " + String.format("%.4f", longMedia));

	}
	
	private static double calcularLongitudMedia(double valorTotal) {
		
		double ret = 0;
		for (HuffmanNode huffmanNode : listaNodos) {
			ret+= huffmanNode.getValor()*huffmanNode.getLongitudCode();
		}
		return ret/valorTotal;
	}

	// recursive function to print the 
    // huffman-code through the tree traversal. 
    // Here s is the huffman - code generated. 
    public static void printCode(HuffmanNode root, String s){ 
  
    	//Este es es caso base en el que el valor es 1.0 y el valor de la posicion es el por defect --> "-"
    	// y ademas no tiene ramas derecha ni izquierda.
    	// El parametro "s" es generado a traves de arbol
    	
	    		
	    	
	        if (root.getLeft() == null && root.getRight() == null && Character.isLetter(root.getC())) { 
	   
	            root.setCode(s);
	            root.setLongitudCode(s.length());
	            listaNodos.add(root);
	            System.out.println(root.getC() + ":" + root.getCode() + " l[" + root.getLongitudCode() + "]");
	            
	            return; 
	        } 
	  
	        // Si vamos a la izquierda ponemos un 1 a la s 
	        // Si vamos a la derecha ponemos un 0 a la s  
	  
	        
	        printCode(root.getLeft(), s + "1"); 
	        printCode(root.getRight(), s + "0");  
	   
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
