import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Practica {

	private static String texto = "La noche cae, brumosa ya y morada. "
			+ "Vagas claridades malvas y verdes perduran tras la torre de la iglesia. "
			+ "El camino sube, lleno de sombras, de campanillas, de fragancia de hierba, "
			+ "de canciones, de cansancio y de anhelo.";

	private static ArrayList<Letra> letras = new ArrayList<Letra>();

	public static void main(String[] args) {

		llenar();
		calcularProbabilidad();
		// ordenar();
		ArrayList<Letra> ordenada = new ArrayList<Letra>();

		imprimir();
		Collections.sort(letras, new ComparadorNombre());
		System.out.println();
		imprimir();

	}

	private static void calcularProbabilidad() {

		int suma_total = 0;

		for (Letra l : letras) {

			suma_total += l.getFrecuencia();
		}
		System.out.println(suma_total);

		for (int i = 0; i < letras.size(); i++) {

			double probabilidad = (double) letras.get(i).getFrecuencia() / suma_total;

			letras.get(i).setProbabilidad(probabilidad);

		}
	}

	public static void llenar() {

		for (int i = 0; i < texto.length(); i++) {

			char c = texto.charAt(i);

			if (letras.isEmpty()) {

				Letra nueva = new Letra(c);
				letras.add(nueva);
			} else if (esNuevo(c)) {

				letras.add(new Letra(c));

			}
		}
	}

	public static boolean esNuevo(char letra) {

		for (Letra l : letras) {
			// System.out.println("l["+l.getLetra()+"] letra["+letra+"]");

			if (l.getLetra() == letra) {
				l.setFrecuencia(1);
				return false;
			}
		}
		return true;
	}

	public static void imprimir() {
		for (Letra l : letras) {
			if (l.getLetra() == ' ') {
				l.setLetra('-');
			}
			System.out.println(l.toString() + "\tFrecuencia[" + l.getFrecuencia() + "]\tProbabilidad["
					+ String.format("%.3f", l.getProbabilidad()) + "]");
		}
	}

}

class ComparadorNombre implements Comparator<Letra> {

	@Override
	public int compare(Letra l1, Letra l2) {
		if (l1.getProbabilidad() < l2.getProbabilidad())
			return 1;
		if (l1.getProbabilidad() > l2.getProbabilidad())
			return -1;
		return 0;
	}

}
