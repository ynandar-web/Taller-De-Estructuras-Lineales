import java.util.Random;

public class simetria {

    private static final Random random = new Random();

    public static void main(String[] args) {
        int dimension = 3;

        int[][] matriz = generarMatriz(dimension);
        imprimirMatriz(matriz);

        boolean esSimetrica = verificarSimetria(matriz);
        mostrarSimetria(esSimetrica);

        imprimirEsquinas(matriz);
    }

    // se  genera matriz n x n
    private static int[][] generarMatriz(int n) {
        int[][] matriz = new int[n][n];

        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                matriz[fila][columna] = random.nextInt(10);
            }
        }
        return matriz;
    }

    // se imprime la matriz
    private static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

    // se verifica si es simétrica
    private static boolean verificarSimetria(int[][] matriz) {
        int n = matriz.length;

        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < fila; columna++) {
                if (matriz[fila][columna] != matriz[columna][fila]) {
                    return false;
                }
            }
        }
        return true;
    }

    // se muestra resultado de simetría
    private static void mostrarSimetria(boolean esSimetrica) {
        if (esSimetrica) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz NO es simétrica.");
        }
    }

    // se imprime las esquinas
    private static void imprimirEsquinas(int[][] matriz) {
        int n = matriz.length;

        int esquinaSuperiorIzquierda = matriz[0][0];
        int esquinaSuperiorDerecha = matriz[0][n - 1];
        int esquinaInferiorIzquierda = matriz[n - 1][0];
        int esquinaInferiorDerecha = matriz[n - 1][n - 1];

        System.out.println("Esquinas de la matriz:");
        System.out.println("Superior izquierda: " + esquinaSuperiorIzquierda);
        System.out.println("Superior derecha: " + esquinaSuperiorDerecha);
        System.out.println("Inferior izquierda: " + esquinaInferiorIzquierda);
        System.out.println("Inferior derecha: " + esquinaInferiorDerecha);
    }
}