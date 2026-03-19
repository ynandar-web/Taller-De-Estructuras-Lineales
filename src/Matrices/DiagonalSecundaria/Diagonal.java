import java.util.Random;

public class Diagonal {

    private static final Random random = new Random();

    public static void main(String[] args) {
        int dimension = 4;

        int[][] matriz = generarMatriz(dimension);
        imprimirMatriz(matriz);

        int suma = calcularDiagonalSecundaria(matriz);
        mostrarResultado(suma);
    }

    
    private static int[][] generarMatriz(int n) {
        int[][] matriz = new int[n][n];

        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                matriz[fila][columna] = random.nextInt(101) - 50;
            }
        }
        return matriz;
    }

    //  se Imprime la matriz
    private static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

    //  se Calcula la suma de la diagonal secundaria
    private static int calcularDiagonalSecundaria(int[][] matriz) {
        int suma = 0;
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            suma += matriz[i][n - 1 - i];
        }

        return suma;
    }

    // se Muestra el resultado
    private static void mostrarResultado(int suma) {
        System.out.println("Suma de la diagonal secundaria: " + suma);
    }
}