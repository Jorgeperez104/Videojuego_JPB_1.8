package acciones;

import java.util.Random;
import java.util.Scanner;

import componentes.*;
import utilidades.*;

import java.io.*;



public class GameController {
	private Scanner scanner;
    private Jugador jugador;
    private Partida partida;
    private HistorialPartidas historialPartidas;
    private static final int OPCION_SALIR = 4;

    public GameController(Scanner scanner){
        this.scanner = scanner;
        this.jugador = new Jugador("","",0,"");
        this.partida = new Partida(jugador.getNombre(), jugador.getNacionalidad(), jugador.getEdad(), jugador.getPosicion());
        this.historialPartidas = new HistorialPartidas();
    }

    public void IniciarJuego() throws IOException {
        System.out.println("¡Bienvenido al juego de fútbol!");

        InicioJuego inicio = new InicioJuego();
        
        InicioJuego.mostrarCartel();

        inicio.obtenerNombreJugador(scanner, jugador);
        inicio.obtenerNacionalidadJugador(scanner, jugador);
        inicio.obtenerEdadJugador(scanner, jugador);
        inicio.obtenerPosicionJugador(scanner, jugador);

        InicioJuego.mostrarFinInicio();


        partida.iniciarPartida();

        mostrarMenu();
    }

    public void mostrarMenu()throws IOException{
        int opcion;
        do{
            mostrarOpcionesMenu();
            opcion = Utilidades.leerNumeroEntreSinLetra(1, 4);
            switch (opcion) {
                case 1:
                    Juego.jugarEliminatorias(scanner, new Random());
                    break;
                case 2:
                    Trofeos.verTrofeos();
                    break;
                case 3:
                    Narrativa.LeerNarrativa();
                    break;

                case 4:
                    System.out.println("Saliendo del juego...");
                    finalizarJuego();
                    break;
                default:
                    break;
            } 
        }while (opcion != OPCION_SALIR); 
    }

    public static void mostrarOpcionesMenu() {
        System.out.println("\n--- Menú Principal ---");
        System.out.println("1. Jugar eliminatorias");
        System.out.println("2. Ver trofeos");
        System.out.println("3. Leer narrativa");
        System.out.println("4. Salir");
        System.out.print("Elige una opción (1-4): ");
    }


    private void finalizarJuego() {

        
        HistorialPartidas.agregarPartida(partida);
        System.out.println("\n¡Gracias por jugar! ¡Te esperamos pronto!");
        partida.finalizarPartida();
        HistorialPartidas.exportarpartidas(historialPartidas.getPartidas());
        utilidades.ConexionBD.guardarPartida(jugador.getNombre(), jugador.getNacionalidad(), jugador.getEdad(), jugador.getPosicion());
        System.out.println("Partida guardada en la base de datos.");
        System.out.println(partida.toString());
    }
}