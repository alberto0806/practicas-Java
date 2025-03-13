
package defensa1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class defensa1 {

    public static long productoImpares(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("El parámetro n debe ser positivo y mayor que 0");
        }

        long producto = 1;
        int numeroImpar = 1;

        for (int i = 0; i < n; i++) {
            producto *= numeroImpar;
            numeroImpar += 2;
        }

        return producto;
    }
    
    public static double sumaGeometricaAlternada(double a1, double r, int k) {
        if (k <= 0) {
            throw new IllegalArgumentException("k debe ser mayor que 0");
        }
        if (a1 <= 0 || r <= 0) {
            throw new IllegalArgumentException("a1 y r deben ser positivos");
        }

        double suma = 0.0;
        for (int n = 0; n < k; n++) {
            suma += Math.pow(-1, n) * a1 * Math.pow(r, n);
        }

        return suma;
    }
    public static long combinatorioSinMultiplosDeTres(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            throw new IllegalArgumentException("n debe ser mayor o igual que k y ambos deben ser positivos");
        }

        return factorialSinMultiplosDeTres(n) / 
               (factorialSinMultiplosDeTres(k) * factorialSinMultiplosDeTres(n - k));
    }

    private static long factorialSinMultiplosDeTres(int num) {
        long resultado = 1;
        for (int i = 1; i <= num; i++) {
            if (i % 3 != 0) {  
                resultado *= i;
            }
        }
        return resultado;
    }
    
    public static List<String> filtrarLineasConsecutivas(String nombreArchivo, List<String> palabrasClave) {
        List<String> lineasFiltradas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (contienePalabrasConsecutivas(linea, palabrasClave)) {
                    lineasFiltradas.add(linea);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return lineasFiltradas;
    }

    private static boolean contienePalabrasConsecutivas(String linea, List<String> palabrasClave) {
        String[] palabras = linea.split("\\s+"); 
        for (int i = 0; i < palabras.length - 1; i++) {
            if (palabrasClave.contains(palabras[i]) && palabrasClave.contains(palabras[i + 1])) {
                return true; 
            }
        }
        return false;
    }
    

    


}
