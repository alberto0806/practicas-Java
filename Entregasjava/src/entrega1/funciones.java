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
	
}
	

	
	


