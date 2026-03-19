import java.util.Random;

public class InvertirNumeros {

    public static void main(String[] args) {
        int[] numeros = generarNumerosAleatorios(20);
        int[] invertidos = invertirNumeros(numeros);

        imprimirArreglo("Arreglo original:", numeros);
        imprimirArreglo("Arreglo invertido:", invertidos);
    }

    
    //  Genera un arreglo de números aleatorios (entre 10 y 99).
     
    private static int[] generarNumerosAleatorios(int cantidad) {
        Random random = new Random();
        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(90) + 10; 
        }

        return numeros;
    }

    // Invierte cada número del arreglo.
     
    private static int[] invertirNumeros(int[] arreglo) {
        int[] invertidos = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            invertidos[i] = invertirNumero(arreglo[i]);
        }

        return invertidos;
    }

    // Invierte un número entero
    private static int invertirNumero(int numero) {
        int invertido = 0;

        while (numero > 0) {
            invertido = invertido * 10 + (numero % 10);
            numero /= 10;
        }

        return invertido;
    }

    // Imprime un arreglo.
     
    private static void imprimirArreglo(String mensaje, int[] arreglo) {
        System.out.println(mensaje);
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}