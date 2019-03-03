import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HuffmanBinario {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] probs = {30, 20, 10, 10, 5, 5, 5, 5, 5, 5};
		
		char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' }; 
		// crear los ids de posicion
		
		
		// Priority queue
		// TODO mirar si es de min-heap o max-heap
        PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(probs.length, new ComparadorProbs()); 
        // NO VA ESTO
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
			System.out.print("padre: "+padre1.getC());
		
			// second min extarct.
			HuffmanNode padre2 = q.poll();
			System.out.println(" padre: "+padre2.getC());
			
			// creamos el hijp
			HuffmanNode hijo = new HuffmanNode();

			//Realizamos la suma de las frecuancias de los nodos padre
			hijo.setValor(padre1.getValor() + padre2.getValor());
			hijo.setC('-');

			// first extracted node as left child.
			hijo.setLeft(padre1);
			
			// second extracted node as the right child.
			hijo.setRight(padre2);

			// Marcamos al nodo resultante como la nueva root
			root = hijo;

			// añadimos el nodo hijo a la cola de prioridad
			q.add(hijo);

		}
		
		//System.out.println("la raiz es:"+ root.getPosicion()+" {"+root.getValor()+"}");
		
		//System.out.println("iddd"+root.getLeft().getRight().getC());
		printCode(root, "");

	}
	
	// recursive function to print the 
    // huffman-code through the tree traversal. 
    // Here s is the huffman - code generated. 
    public static void printCode(HuffmanNode root, String s) 
    { 
  
     
    	//Este es es caso base en el que el valor es 1.0 y el valor de la posicion es el por defect --> "-"
    	// y ademas no tiene ramas derecha ni izquierda.
    	// El parametro "s" es generado a traves de arbol
        if (root.getLeft() == null && root.getRight() == null && Character.isLetter(root.getC())) { 
  
           
            System.out.println(root.getC() + ":" + s); 
  
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
