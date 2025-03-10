package test_entega1;
import entrega1.lectura;
public class test_lectura {
	public static void main(String[] args) {
        // Pruebas de las funciones
        System.out.println("TEST DE LA FUNCIÓN 6:");
        System.out.println("El número de veces que aparece la palabra quijote en el fichero resources/lin_quijote.txt es: " 
                           + lectura.contarPalabra("resources/lin_quijote.txt", "\\s+", "quijote"));

        System.out.println("\nTEST DE LA FUNCIÓN 7:");
        System.out.println("Las líneas en las que aparece la palabra quijote son: " 
                           + lectura.buscarLineas("resources/lin_quijote.txt", "quijote"));

        System.out.println("\nTEST DE LA FUNCIÓN 8:");
        System.out.println("Las palabras únicas en el fichero resources/archivo_palabras.txt son: " 
                           + lectura.palabrasUnicas("resources/archivo_palabras.txt"));

        System.out.println("\nTEST DE LA FUNCIÓN 9:");
        System.out.println("La longitud promedio de las líneas del fichero resources/palabras_random.csv es: " 
                           + lectura.longitudMediaLineas("resources/palabras_random.csv", ","));
    }

}
