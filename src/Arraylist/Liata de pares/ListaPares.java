import java.util.ArrayList;
import java.util.Scanner;

public class ListaPares {

    public static void main(String[] args) {
        ArrayList<Integer> lista = generarPares(20);

        imprimirLista("Lista inicial:", lista);

        insertarOrdenado(lista);
        imprimirLista("Después de insertar:", lista);

        eliminarValor(lista);
        imprimirLista("Después de eliminar:", lista);
    }

    private static ArrayList<Integer> generarPares(int cantidad) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            lista.add(i * 2);
        }
        return lista;
    }

    private static void insertarOrdenado(ArrayList<Integer> lista) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número a insertar: ");
        int numero = sc.nextInt();

        int i = 0;
        while (i < lista.size() && lista.get(i) < numero) {
            i++;
        }
        lista.add(i, numero);
    }

    private static void eliminarValor(ArrayList<Integer> lista) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número a eliminar: ");
        int numero = sc.nextInt();

        lista.remove(Integer.valueOf(numero));
    }

    private static void imprimirLista(String mensaje, ArrayList<Integer> lista) {
        System.out.println(mensaje);
        for (int num : lista) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}