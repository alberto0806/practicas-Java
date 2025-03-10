package entrega1;

import java.util.function.Function;

public class funciones {
	public static long productoSecuencia(int n, int k) {
		long resultado = 1;
		for(int i = 0; i<=k ; i++) {
			resultado *= (n - i + 1 );		
		}
		return resultado;	
	}
	public static double secuenciaGometrica( double a1, double r, int n) {
		double resultado = 1;
		
		for (int i = 1; 1<n; i++) {
            resultado *= a1 * Math.pow(r, i);
		
		}
		return resultado;
			
	}
	
	public static double combinatorio(int n, int k) {
		if (n < k) {
            return 0;
        }
		return productoSecuencia(n, k) / productoSecuencia(k, k);
	}
	
	public static double calculaS(int n, int k) {
		double suma = 0;
		for (int i = 0; i <= k -1; i++) {
			suma += Math.pow(-1, i) * combinatorio(k+1, i+1) * Math.pow(k - i, n);
			}
		return suma/ factorial(k);
	}
	private static double factorial(int k) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static double newton(Function<Double, Double> f, Function<Double, Double> fprima, double a,
			double e) {
		 double x = a;
		while (Math.abs(f.apply(x)) > e) {
			x = x - f.apply(x) / fprima.apply(x);
		}
		return x;
		
	}
	public static void main(String[] args) {
        // Pruebas de las funciones
		System.out.println("Pruebas de las funciones: ");
        System.out.println("TEST DE LA FUNCIÓN 1:");
        System.out.println("El producto de 4 y 2 es: " + productoSecuencia(4, 2));
       
        System.out.println("\nTEST DE LA FUNCIÓN 2:");
        System.out.println("El producto de la secuencia geométrica con a1 = 3, r = 5 y k = 2 es: " + secuenciaGometrica(3, 5, 2));

        System.out.println("\nTEST DE LA FUNCIÓN 3:");
        System.out.println("El número combinatorio de 4 y 2 es: " + combinatorio(4, 2));
        
        System.out.println("\nTEST DE LA FUNCIÓN 4:");
        System.out.println("El número S(n,k) siendo n = 4 y k = 2 es: " + calculaS(4, 2));

        System.out.println("\nTEST DE LA FUNCIÓN 5:");
        Function<Double, Double> f = x -> 2 * Math.pow(x, 2);
        Function<Double, Double> fPrima = x -> 4 * x;
        System.out.println("Resultado de la función 5 con a = 3 y e = 0.001, f(x) = 2x^2 y f'(x) = 4x: " + newton(f, fPrima, 3, 0.001));
    }
}
	

	
	


