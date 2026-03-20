import java.util.Random;

public class MinimoMaximo {

    public static void main(String[] args) {
        int[] numeros = generarNumerosAleatorios(25, -50, 50);

        int minimo = encontrarMinimo(numeros);
        int maximo = encontrarMaximo(numeros);

        imprimirArreglo(numeros);
        System.out.println("Número menor: " + minimo);
        System.out.println("Número mayor: " + maximo);
    }

    //se genera un arreglo de números aleatorios en un rango dado.
    
    private static int[] generarNumerosAleatorios(int cantidad, int min, int max) {
        Random random = new Random();
        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(max - min + 1) + min;
        }

        return numeros;
    }

    //encuentra el número mínimo del arreglo.
     
    private static int encontrarMinimo(int[] arreglo) {
        int minimo = arreglo[0];

        for (int numero : arreglo) {
            if (numero < minimo) {
                minimo = numero;
            }
        }

        return minimo;
    }

    //encuentra el número máximo del arreglo.
     
    private static int encontrarMaximo(int[] arreglo) {
        int maximo = arreglo[0];

        for (int numero : arreglo) {
            if (numero > maximo) {
                maximo = numero;
            }
        }

        return maximo;
    }

    //se imprime el arreglo.
     
    private static void imprimirArreglo(int[] arreglo) {
        System.out.println("Números generados:");
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}