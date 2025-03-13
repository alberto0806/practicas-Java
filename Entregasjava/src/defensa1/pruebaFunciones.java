package defensa1;



import java.util.Arrays;
import java.util.List;

public class pruebaFunciones {

	public static void main(String[] args) {
		testProductoImpares();
		testSumaGeometricaAlternada();
		testCombinatorioSinMultiplosDeTres();
		testFiltrarLineasConsecutivas();
	}

	private static void testProductoImpares() {
		System.out.println("Testing productoImpares...");

		try {
			System.out.println(defensa1.productoImpares(5)); 
			System.out.println(defensa1.productoImpares(0)); 
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(defensa1.productoImpares(-1)); 
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void testSumaGeometricaAlternada() {
		System.out.println("Testing sumaGeometricaAlternada...");

		try {
			System.out.println(defensa1.sumaGeometricaAlternada(2.0, 3.0, 5));  
			System.out.println(defensa1.sumaGeometricaAlternada(2.0, 3.0, 0)); 
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(defensa1.sumaGeometricaAlternada(-2.0, 3.0, 5)); 
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(defensa1.sumaGeometricaAlternada(2.0, -3.0, 5)); 
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void testCombinatorioSinMultiplosDeTres() {
		System.out.println("Testing combinatorioSinMultiplosDeTres...");

		try {
			System.out.println(defensa1.combinatorioSinMultiplosDeTres(5, 2)); 
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(defensa1.combinatorioSinMultiplosDeTres(-5, 2)); 
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(defensa1.combinatorioSinMultiplosDeTres(5, -2)); 
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void testFiltrarLineasConsecutivas() {
		System.out.println("Testing filtrarLineasConsecutivas...");

		List<String> keywords = Arrays.asList("salud", "proyecto");
		List<String> result = defensa1.filtrarLineasConsecutivas("src/defensa1/archivo_palabras.txt", keywords);

		for (String line : result) {
			System.out.println(line);
		}
	}
}
