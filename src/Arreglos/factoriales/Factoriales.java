import java.util.Random;
import java.util.Scanner;

public class Factoriales {

    public static void main(String[] args) {
        int n = leerCantidad();
        
        int[] numeros = generarNumerosAleatorios(n);
        long[] factoriales = calcularFactoriales(numeros);

        imprimirArreglo("Números generados:", numeros);
        imprimirArreglo("Factoriales:", factoriales);
    }

    // Lee la cantidad de números a generar.
     
    private static int leerCantidad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        return scanner.nextInt();
    }

    // Genera un arreglo de números aleatorios (entre 1 y 10).
     
    private static int[] generarNumerosAleatorios(int cantidad) {
        Random random = new Random();
        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(10) + 1; // evita 0 para factorial
        }

        return numeros;
    }

    //se Calcula los factoriales de cada número del arreglo.
     
    private static long[] calcularFactoriales(int[] numeros) {
        long[] factoriales = new long[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            factoriales[i] = calcularFactorial(numeros[i]);
        }

        return factoriales;
    }

    //se Calcula el factorial de un número.
     
    private static long calcularFactorial(int numero) {
        long resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }

    //se imprime numeros enteros 
    private static void imprimirArreglo(String mensaje, int[] arreglo) {
        System.out.println(mensaje);
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    //se imprime factoriales 
    private static void imprimirArreglo(String mensaje, long[] arreglo) {
        System.out.println(mensaje);
        for (long num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}