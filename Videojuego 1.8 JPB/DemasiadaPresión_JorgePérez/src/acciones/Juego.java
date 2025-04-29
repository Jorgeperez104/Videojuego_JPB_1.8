package acciones;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import static utilidades.Colores.*;
import componentes.Jugador;

public class Juego {

    public static void jugarEliminatorias(Scanner scanner, Random random) {
        boolean torneoconseguido = false;
        Jugador jugador = new Jugador("", "", 0, "");

        int torneo1Jugado = 0, torneo1Ganado = 0, torneo1Perdido = 0;
        int torneo2Jugado = 0, torneo2Ganado = 0, torneo2Perdido = 0;




        
        boolean salir = false;
        while (!salir) {
            System.out.println(NARANJA + "--- Selección de Torneos ---" + RESET);
            if (!torneoconseguido) {
                System.out.println("\n1. Torneo La Liga");
                System.out.println("2. Torneo Champions");
            } else {
                System.out.println("\n1. Torneo Nations League");
                System.out.println("2. Torneo Mundial");
            }
            System.out.println("3. Volver al menú principal");
            System.out.print(NARANJA + "\nElige un torneo o sal al menú (1-3): " + RESET);

            int opcionTorneo = 0;
            boolean entradaValida = false;

            while (!entradaValida) {
                try {
                    opcionTorneo = scanner.nextInt();
                    if (opcionTorneo >= 1 && opcionTorneo <= 3) {
                        entradaValida = true;
                    } else {
                        System.out.println(ROJO + "Opción inválida. Por favor, elige una opción del 1 al 3." + RESET);
                    }
                } catch (InputMismatchException e) {
                    System.out.println(ROJO + "Entrada inválida. Por favor, introduce un número del 1 al 3." + RESET);
                    scanner.next();
                }
            }
            scanner.nextLine();






            if (opcionTorneo == 1) {
                torneo1Jugado++;
                System.out.println("\nHas seleccionado el torneo 1.");
                int puntos = 0;
                int tirosTotales = 5;

                for (int tiro = 1; tiro <= tirosTotales; tiro++) {
                    System.out.println(AMARILLO_CLARO + "\nTiro " + tiro + " de " + tirosTotales + RESET);
                    String ladoTiro = "";
                    boolean ladoValido = false;

                    while (!ladoValido) {
                        System.out.println("\nElige el lado para tirar:");
                        System.out.println("1. Izquierda");
                        System.out.println("2. Centro");
                        System.out.println("3. Derecha");
                        System.out.print("Introduce un número (1-3): ");

                        int opcionLado = 0;
                        try {
                            opcionLado = scanner.nextInt();
                            switch (opcionLado) {
                                case 1:
                                    ladoTiro = "izquierda";
                                    ladoValido = true;
                                    break;
                                case 2:
                                    ladoTiro = "centro";
                                    ladoValido = true;
                                    break;
                                case 3:
                                    ladoTiro = "derecha";
                                    ladoValido = true;
                                    break;
                                default:
                                    System.out.println(ROJO + "Por favor, introduce un número válido (1-3)." + RESET);
                            }
                        } catch (InputMismatchException e) {
                            System.out.println(
                                    ROJO + "Entrada inválida. Por favor, introduce un número del 1 al 3." + RESET);
                            scanner.next();
                        }
                    }

                    String[] lados = { "izquierda", "centro", "derecha" };
                    String ladoPortero = lados[random.nextInt(3)];
                    System.out.println("\nEl portero se tira hacia " + ladoPortero + ".");

                    if (ladoTiro.equals(ladoPortero)) {
                        System.out.println(ROJO + "\n¡Parada del portero!" + RESET);
                    } else {
                        System.out.println(ROJO + "\n¡Gol! ¡Vamos!" + RESET);
                        puntos++;
                    }

                    double porcentajeacertado = ((double) puntos / tiro) * 100;
                    System.out.printf("\nTu porcentaje de aciertos actual es de: %.2f%%%n", porcentajeacertado);
                }

                System.out.println(jugador.getNombre() + ", has acabado con " + puntos + " puntos de " + tirosTotales
                        + " posibles.");

                if (puntos >= 3) {
                    System.out.println(
                            "\n¡Felicidades " + jugador.getNombre() + " ! Has ganado el torneo. La selección de "
                                    + jugador.getNacionalidad() + " te necesita para el próximo torneo.");
                    torneoconseguido = true;
                    torneo1Ganado++;
                } else {
                    System.out.println("\nNo lograste ganar el torneo. ¡Otra vez será! ¡No te rindas!");
                    torneo1Perdido++;
                }

                System.out.println("\nEstadísticas del Torneo 1:");
                System.out.println(
                        "Jugado: " + torneo1Jugado + " | Ganado: " + torneo1Ganado + " | Perdido: " + torneo1Perdido);








            } else if (opcionTorneo == 2) {
                torneo2Jugado++;
                System.out.println("\nHas seleccionado el torneo 2.");
                int puntos = 0;
                int tirosTotales = 5;

                for (int tiro = 1; tiro <= tirosTotales; tiro++) {
                    System.out.println(AMARILLO_CLARO + "\nTiro " + tiro + " de " + tirosTotales + RESET);
                    String ladoTiro = "";
                    boolean ladoValido = false;

                    while (!ladoValido) {
                        System.out.println("\nElige el lado para tirar:");
                        System.out.println("1. Izquierda");
                        System.out.println("2. Centro");
                        System.out.println("3. Derecha");
                        System.out.print("Introduce un número (1-3): ");

                        int opcionLado = 0;
                        try {
                            opcionLado = scanner.nextInt();
                            switch (opcionLado) {
                                case 1:
                                    ladoTiro = "izquierda";
                                    ladoValido = true;
                                    break;
                                case 2:
                                    ladoTiro = "centro";
                                    ladoValido = true;
                                    break;
                                case 3:
                                    ladoTiro = "derecha";
                                    ladoValido = true;
                                    break;
                                default:
                                    System.out.println(ROJO + "Por favor, introduce un número válido (1-3)." + RESET);
                            }
                        } catch (InputMismatchException e) {
                            System.out.println(
                                    ROJO + "Entrada inválida. Por favor, introduce un número del 1 al 3." + RESET);
                            scanner.next();
                        }
                    }

                    String[] lados = { "izquierda", "centro", "derecha" };
                    String ladoPortero = lados[random.nextInt(3)];
                    System.out.println("\nEl portero se tira hacia " + ladoPortero + ".");

                    if (ladoTiro.equals(ladoPortero)) {
                        System.out.println(ROJO + "\n¡Parada del portero!" + RESET);
                    } else {
                        System.out.println(ROJO + "\n¡Gol! ¡Vamos!" + RESET);
                        puntos++;
                    }

                    double porcentajeacertado = ((double) puntos / tiro) * 100;
                    System.out.printf("\nTu porcentaje de aciertos actual es de: %.2f%%%n", porcentajeacertado);
                }

                System.out.println(jugador.getNombre() + ", has acabado con " + puntos + " puntos de " + tirosTotales
                        + " posibles.");

                if (puntos >= 3) {
                    System.out.println(FONDO_MAGENTA + "\n¡Felicidades " + jugador.getNombre()
                            + " ! Has ganado el torneo. Eres una leyenda del fútbol, continua agradando tu palmarés.");
                    torneoconseguido = true;
                    torneo2Ganado++;
                } else {
                    System.out.println("\nNo lograste ganar el torneo. ¡Otra vez será! ¡No te rindas!");
                    torneo2Perdido++;
                }

                System.out.println("\nEstadísticas del Torneo 2:");
                System.out.println(
                        "Jugado: " + torneo2Jugado + " | Ganado: " + torneo2Ganado + " | Perdido: " + torneo2Perdido);





            } else if (opcionTorneo == 3) {
                salir = true;
            } else {
                System.out.println("\nNo sirve esta opción. Elige una opción del 1 al 3, por favor.");
            }
        }
    }
}
