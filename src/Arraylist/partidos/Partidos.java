

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Partidos {

    private static final String NOMBREFICHERO = "partidoLiga.txt";

    public static void main(String args[]) {

        // Nos creamos un ArrayList de objetos de la Clase "PartidoFutbol"
        System.out.println("****Creamos un ArrayList de objetos de la Clase \"PartidoFutbol\"****");
        ArrayList<PartidoFutbol> partidos = new ArrayList<>();

        // Instanciamos el fichero donde están los datos
        File fichero = new File(NOMBREFICHERO);
        Scanner s = null;

        // Leemos el contenido del fichero
        try {
            System.out.println("... Leemos el contenido del fichero ...");
            s = new Scanner(fichero);

            // Obtengo los datos de los partidos de fútbol del fichero
            while (s.hasNext()) {
                String linea = s.nextLine(); // Obtengo una línea del fichero (un partido de fútbol)
                String[] cortarString = linea.split("::"); // Obtengo los datos del partido de fútbol
                PartidoFutbol partido = new PartidoFutbol(); // Creo un objeto de la clase "PartidoFutbol"

                // Pongo los atributos al objeto "partido"
                partido.setEquipoLocal(cortarString[0]);
                partido.setEquipoVisitante(cortarString[1]);
                partido.setGolesLocal(Integer.parseInt(cortarString[2]));
                partido.setGolesVisitante(Integer.parseInt(cortarString[3]));

                // Añadimos el objeto "partido" al ArrayList
                partidos.add(partido);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("... Guardados " + partidos.size() + " partidos de fútbol ...");

        // *** Resultados de todos los partidos ***
        System.out.println("\n *** Resultados de los partidos de fútbol ***");
        for (PartidoFutbol partido : partidos) {
            System.out.println(partido.getEquipoLocal() + " "
                    + partido.getGolesLocal() + "-"
                    + partido.getGolesVisitante() + " "
                    + partido.getEquipoVisitante());
        }

        // *** 1. Mostrar partidos donde el VISITANTE ganó ***
        System.out.println("\n*** Partidos ganados por el equipo visitante ***");
        for (PartidoFutbol partido : partidos) {
            if (partido.getGolesVisitante() > partido.getGolesLocal()) {
                System.out.println(partido.getEquipoLocal() + " "
                        + partido.getGolesLocal() + "-"
                        + partido.getGolesVisitante() + " "
                        + partido.getEquipoVisitante());
            }
        }

        // *** 2. Contar cuántas veces ganó el Barcelona ***
        int victoriasBarca = 0;
        for (PartidoFutbol partido : partidos) {
            boolean barcaEsLocal = partido.getEquipoLocal().equalsIgnoreCase("Barcelona")
                    && partido.getGolesLocal() > partido.getGolesVisitante();
            boolean barcaEsVisitante = partido.getEquipoVisitante().equalsIgnoreCase("Barcelona")
                    && partido.getGolesVisitante() > partido.getGolesLocal();
            if (barcaEsLocal || barcaEsVisitante) {
                victoriasBarca++;
            }
        }
        System.out.println("\n*** El Barcelona ganó " + victoriasBarca + " partido(s) ***");

        // *** 3. Contar cuántos partidos ganó el equipo local ***
        // IMPORTANTE: Este bloque va ANTES de eliminar partidos (paso 4)
        int victoriasLocal = 0;
        for (PartidoFutbol partido : partidos) {
            if (partido.getGolesLocal() > partido.getGolesVisitante()) {
                victoriasLocal++;
            }
        }
        System.out.println("\n*** El equipo local ganó " + victoriasLocal + " partido(s) ***");

        // *** 4. Eliminar partidos que NO sean empate (conservar solo empates) ***
        Iterator<PartidoFutbol> it = partidos.iterator();
        while (it.hasNext()) {
            PartidoFutbol partido = it.next();
            if (partido.getGolesLocal() != partido.getGolesVisitante()) {
                it.remove();
            }
        }
        System.out.println("\n*** Partidos en empate (restantes en el ArrayList) ***");
        for (PartidoFutbol partido : partidos) {
            System.out.println(partido.getEquipoLocal() + " "
                    + partido.getGolesLocal() + "-"
                    + partido.getGolesVisitante() + " "
                    + partido.getEquipoVisitante());
        }
    }
}