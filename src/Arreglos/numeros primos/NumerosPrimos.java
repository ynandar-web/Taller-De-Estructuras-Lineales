public class NumerosPrimos {

    public static void main(String[] args) {
        int[] numerosPrimos = inicializarPrimos();
        imprimirArreglo(numerosPrimos);
    }

    // Inicializa un arreglo con los primeros 10 números primos.
     
    private static int[] inicializarPrimos() {
        return new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
    }

    // Imprime los elementos de un arreglo
    private static void imprimirArreglo(int[] arreglo) {
        for (int numero : arreglo) {
            System.out.println(numero);
        }
    }
}