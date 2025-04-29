/**
 * @version 1.7
 * @autor Jorge Pérez Bonillo
 * 17/04/2025
 */


 import java.io.IOException;
import java.util.Scanner;

import acciones.GameController;

 
 public class Main {
     public static void main(String[] args) throws IOException {
         Scanner scanner = new Scanner(System.in);
         GameController controller = new GameController(scanner);
         controller.IniciarJuego();
         scanner.close();

         
     }
 }
