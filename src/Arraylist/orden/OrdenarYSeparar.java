import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class OrdenarYSeparar {

    public static void main(String[] args) {
        ArrayList<Integer> lista = generarNumeros(20, 1, 100);

        imprimirLista("Lista original:", lista);

        ArrayList<Integer> ascendente = new ArrayList<>(lista);
        Collections.sort(ascendente);
        imprimirLista("Orden ascendente:", ascendente);

        ArrayList<Integer> descendente = new ArrayList<>(ascendente);
        Collections.reverse(descendente);
        imprimirLista("Orden descendente:", descendente);

        ArrayList<Integer> pares = filtrarPares(lista);
        ArrayList<Integer> impares = filtrarImpares(lista);

        imprimirLista("Números pares:", pares);
        imprimirLista("Números impares:", impares);
    }

    private static ArrayList<Integer> generarNumeros(int cantidad, int min, int max) {
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            lista.add(random.nextInt(max - min + 1) + min);
        }

        return lista;
    }

    private static ArrayList<Integer> filtrarPares(ArrayList<Integer> lista) {
        ArrayList<Integer> pares = new ArrayList<>();
        for (int num : lista) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }
        return pares;
    }

    private static ArrayList<Integer> filtrarImpares(ArrayList<Integer> lista) {
        ArrayList<Integer> impares = new ArrayList<>();
        for (int num : lista) {
            if (num % 2 != 0) {
                impares.add(num);
            }
        }
        return impares;
    }

    private static void imprimirLista(String mensaje, ArrayList<Integer> lista) {
        System.out.println(mensaje);
        for (int num : lista) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}