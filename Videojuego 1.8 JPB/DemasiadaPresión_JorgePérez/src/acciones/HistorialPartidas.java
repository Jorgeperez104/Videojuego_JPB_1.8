package acciones;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import componentes.Partida; 

public class HistorialPartidas {
    private static ArrayList<Partida> partidas;

    public HistorialPartidas() {
        this.partidas = new ArrayList<>();
    }

    public static void agregarPartida(Partida partida) {
        partidas.add(partida);
        System.out.println("Partida registrada en el historial.");
    }
    
    public static void exportarpartidas(ArrayList<Partida> partidas) {
        if (partidas.isEmpty()) {
            System.out.println("No hay partidas para exportar.");
        }else{
            try {
                File carpeta = new File ("Partidas");

                if (!carpeta.exists()) {
                    carpeta.mkdir();
                }
                PrintWriter writer = new PrintWriter(new File(carpeta, "historial_partidas.txt"));

                writer.println("=".repeat(80));
                writer.println("Historial de Partidas:");
                writer.println("=".repeat(80));

                for (Partida partida : partidas) {
                    writer.println(partida.toString());
                    writer.println("-".repeat(80));
                }

                writer.println("=".repeat(80));
                writer.close();
                System.out.println("Exportación correcta.");
            
            } catch (IOException e) {
                System.out.println("Error al exportar el historial de partidas: " + e.getMessage());

            } catch (Exception e) {
                System.out.println("Error exportación: " + e.getMessage());
            }
        }
    }

    public ArrayList<Partida> getPartidas() {
        return partidas;
    }
}
