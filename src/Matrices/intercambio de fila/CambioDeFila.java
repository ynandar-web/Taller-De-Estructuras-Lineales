import java.util.Random;
import java.util.Scanner;

public class CambioDeFila {

    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int filas = leerEntero("Ingrese número de filas: ");
        int columnas = leerEntero("Ingrese número de columnas: ");

        int[][] matriz = generarMatriz(filas, columnas);

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        intercambiarFilas(matriz, 0, 1);

        System.out.println("Matriz después de intercambiar filas:");
        imprimirMatriz(matriz);
    }

    //  se lee entero desde teclado
    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    //se genera matriz con números aleatorios
    private static int[][] generarMatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                matriz[fila][columna] = random.nextInt(100);
            }
        }
        return matriz;
    }

    // se intercambia dos filas
    private static void intercambiarFilas(int[][] matriz, int fila1, int fila2) {
        if (matriz.length < 2) {
            System.out.println("No se pueden intercambiar filas (menos de 2 filas).");
            return;
        }

        int[] temp = matriz[fila1];
        matriz[fila1] = matriz[fila2];
        matriz[fila2] = temp;
    }

    // se  imprime la matriz
    private static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}