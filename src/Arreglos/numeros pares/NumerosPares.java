public class NumerosPares {

    public static void main(String[] args) {
        int[] pares = generarPrimeros100Pares();

        imprimirEnUnaLinea(pares);
        imprimirEnDiezLineas(pares);
    }

    //Genera un arreglo con los primeros 100 números pares.
     
    private static int[] generarPrimeros100Pares() {
        int[] pares = new int[100];
        for (int i = 0; i < pares.length; i++) {
            pares[i] = (i + 1) * 2;
        }
        return pares;
    }

    // Imprime el arreglo en una sola línea.
     
    private static void imprimirEnUnaLinea(int[] arreglo) {
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println(); // 
    }

    //imprime el arreglo
     
    private static void imprimirEnDiezLineas(int[] arreglo) {
        int elementosPorLinea = 10;

        for (int i = 0; i < arreglo.length; i += elementosPorLinea) {
            System.out.print("Línea " + (i / elementosPorLinea + 1) + ": ");

            for (int j = i; j < i + elementosPorLinea; j++) {
                System.out.print(arreglo[j] + " ");
            }

            System.out.println();
        }
    }
}