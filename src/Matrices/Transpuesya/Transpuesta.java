public class Transpuesta {

    public static void main(String[] args) {

        int[][] matrizOriginal = crearMatrizPorDefecto();

        System.out.println("Matriz original:");
        imprimirMatriz(matrizOriginal);

        int[][] matrizTranspuesta = calcularTranspuesta(matrizOriginal);

        System.out.println("Matriz transpuesta:");
        imprimirMatriz(matrizTranspuesta);
    }

    //la matriz con valores predeterminados
    private static int[][] crearMatrizPorDefecto() {
        return new int[][]{
            {1, 2, 3},
            {4, 5, 6}
        };
    }

    //se calcula la transpuesta
    private static int[][] calcularTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] transpuesta = new int[columnas][filas];

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                transpuesta[columna][fila] = matriz[fila][columna];
            }
        }

        return transpuesta;
    }

    //se imprime la matriz
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