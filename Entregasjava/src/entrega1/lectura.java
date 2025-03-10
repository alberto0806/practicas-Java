package entrega1;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lectura {

    // Función 6
    public static int contarPalabra(String fichero, String sep, String cad) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(sep);
                for (String word : words) {
                    if (word.equalsIgnoreCase(cad)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    // Función 7
    public static List<String> buscarLineas(String fichero, String cad) {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains(cad.toLowerCase())) {
                    lineas.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineas;
    }

    // Función 8
    public static List<String> palabrasUnicas(String fichero) {
        Set<String> palabrasUnicas = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    palabrasUnicas.add(word.toLowerCase());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>(palabrasUnicas);
    }

    // Función 9
    public static double longitudMediaLineas(String fichero, String sep) {
        int totalLength = 0;
        int lineCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] terms = line.split(sep);
                totalLength += terms.length;
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineCount > 0 ? (double) totalLength / lineCount : 0;
    }

    public static void main(String[] args) {
        // Pruebas de las funciones
        System.out.println("TEST DE LA FUNCIÓN 6:");
        System.out.println("El número de veces que aparece la palabra quijote en el fichero resources/lin_quijote.txt es: " 
                           + contarPalabra("resources/lin_quijote.txt", "\\s+", "quijote"));

        System.out.println("\nTEST DE LA FUNCIÓN 7:");
        System.out.println("Las líneas en las que aparece la palabra quijote son: " 
                           + buscarLineas("resources/lin_quijote.txt", "quijote"));

        System.out.println("\nTEST DE LA FUNCIÓN 8:");
        System.out.println("Las palabras únicas en el fichero resources/archivo_palabras.txt son: " 
                           + palabrasUnicas("resources/archivo_palabras.txt"));

        System.out.println("\nTEST DE LA FUNCIÓN 9:");
        System.out.println("La longitud promedio de las líneas del fichero resources/palabras_random.csv es: " 
                           + longitudMediaLineas("resources/palabras_random.csv", ","));
    }
}