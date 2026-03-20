import java.util.ArrayList;
import java.util.Random;

public class FrecuenciaDeNumeros {

    public static void main(String[] args) {
        ArrayList<Integer> lista = generarNumeros(100, 1, 20);

        int[] frecuencias = contarFrecuencias(lista, 20);
        imprimirFrecuencias(frecuencias);
        mostrarMasFrecuente(frecuencias);
    }

    private static ArrayList<Integer> generarNumeros(int cantidad, int min, int max) {
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            lista.add(random.nextInt(max - min + 1) + min);
        }

        return lista;
    }

    private static int[] contarFrecuencias(ArrayList<Integer> lista, int maxValor) {
        int[] frecuencias = new int[maxValor + 1];

        for (int num : lista) {
            frecuencias[num]++;
        }

        return frecuencias;
    }

    private static void imprimirFrecuencias(int[] frecuencias) {
        System.out.println("Número - Frecuencia");
        for (int i = 1; i < frecuencias.length; i++) {
            System.out.println(i + " - " + frecuencias[i]);
        }
    }

    private static void mostrarMasFrecuente(int[] frecuencias) {
        int maxFrecuencia = 0;
        int numeroMasFrecuente = 0;

        for (int i = 1; i < frecuencias.length; i++) {
            if (frecuencias[i] > maxFrecuencia) {
                maxFrecuencia = frecuencias[i];
                numeroMasFrecuente = i;
            }
        }

        System.out.println("Número más frecuente: " + numeroMasFrecuente +
                           " (aparece " + maxFrecuencia + " veces)");
    }
}