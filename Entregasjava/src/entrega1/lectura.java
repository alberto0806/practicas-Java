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

    
}