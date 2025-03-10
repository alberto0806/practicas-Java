package test_entega1;



import java.util.function.Function;

import entrega1.funciones;

public class test_Funciones {
    
    public static void main(String[] args) {
       
        System.out.println("################################################");
        System.out.println("TEST DE LA FUNCIÓN 1:");
        System.out.println("El producto de 4 y 2 es: " + funciones.productoSecuencia(4, 2));
        System.out.println("\n");
        
      
        System.out.println("################################################");
        System.out.println("TEST DE LA FUNCIÓN 2:");
        System.out.println("El producto de la secuencia geométrica con a1 = 3, r = 5 y k = 2 es: " 
                          + funciones.secuenciaGometrica(3, 5, 2));
        System.out.println("\n");
        
       
        System.out.println("################################################");
        System.out.println("TEST DE LA FUNCIÓN 3:");
        System.out.println("El número combinatorio de 4 y 2 es: " + funciones.combinatorio(4, 2));
        System.out.println("\n");
        
       
        System.out.println("################################################");
        System.out.println("TEST DE LA FUNCIÓN 4:");
        System.out.println("El número S(n,k) siendo n = 4 y k = 2 es: " + funciones.calculaS(4, 2));
        System.out.println("\n");
        
       
        System.out.println("################################################");
        System.out.println("TEST DE LA FUNCIÓN 5:");
        Function<Double, Double> f = x -> 2 * Math.pow(x, 2);
        Function<Double, Double> fPrima = x -> 4 * x;
        System.out.println("Resultado de la función 5 con a = 3 y e = 0.001, f(x) = 2x^2 y f'(x) = 4x: " 
                          + funciones.newton(f,fPrima , 3, 0.001));
        System.out.println("\n");
    }
}


