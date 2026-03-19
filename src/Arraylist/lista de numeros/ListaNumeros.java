import java.util.ArrayList;
import java.util.Random;

public class ListaNumeros {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = generarListaHastaDiez();

        int suma = calcularSuma(numeros);
        double media = calcularMedia(numeros);

        imprimirResultados(numeros, suma, media);
    }

    // Genera números aleatorios entre -10 y 10 hasta que salga 10.
     
    private static ArrayList<Integer> generarListaHastaDiez() {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();
        int numero;

        do {
            numero = random.nextInt(21) - 10; 
            lista.add(numero);
        } while (numero != 10);

        return lista;
    }

    //Calcula la suma de los números.
     
    private static int calcularSuma(ArrayList<Integer> lista) {
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return suma;
    }

    //Calcula la media de los números.
     
    private static double calcularMedia(ArrayList<Integer> lista) {
        if (lista.isEmpty()) return 0;
        return (double) calcularSuma(lista) / lista.size();
    }

    // Imprime resultados.
     
    private static void imprimirResultados(ArrayList<Integer> lista, int suma, double media) {
        System.out.println("Números generados:");
        for (int num : lista) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
    }
}