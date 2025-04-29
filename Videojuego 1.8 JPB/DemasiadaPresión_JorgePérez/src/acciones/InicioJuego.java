package acciones;
import java.util.Scanner;
import static utilidades.Colores.*;
import componentes.Jugador;
import utilidades.Utilidades;

public class InicioJuego {
    Jugador jugador = new Jugador("","",0,"");
    
    public static void mostrarCartel() {

        System.out.println(ROJO_FUERTE + "\n" +
        ROJO+"██████  ███████ ███    ███  █████  ███████ ██  █████  ██████   █████      ██████  ██████  ███████ ███████ ██  ██████  ███    ██ \n" +RESET+
        ROJO_ANARANJADO+"██   ██ ██      ████  ████ ██   ██ ██      ██ ██   ██ ██   ██ ██   ██     ██   ██ ██   ██ ██      ██      ██ ██    ██ ████   ██ \n" +RESET+
        NARANJA+"██   ██ █████   ██ ████ ██ ███████ ███████ ██ ███████ ██   ██ ███████     ██████  ██████  █████   ███████ ██ ██    ██ ██ ██  ██ \n" +RESET+
        AMARILLO_ANARANJADO+"██   ██ ██      ██  ██  ██ ██   ██      ██ ██ ██   ██ ██   ██ ██   ██     ██      ██   ██ ██           ██ ██ ██    ██ ██  ██ ██ \n" +RESET+
        AMARILLO+"██████  ███████ ██      ██ ██   ██ ███████ ██ ██   ██ ██████  ██   ██     ██      ██   ██ ███████ ███████ ██  ██████  ██   ████ \n" + RESET);

    }



    public void obtenerNombreJugador(Scanner scanner, Jugador jugador) {

        
        System.out.println(NARANJA+"\n¡BIENVENIDO AL JUEGO DE LOS GRANDES FUTBOLISTAS!"+RESET);
        String mensaje =(AMARILLO_ANARANJADO+"\n¿Como se llama tu personaje?"+RESET);
        String nombre = Utilidades.leerCadenaTexto(scanner, mensaje);
        jugador.setNombre(nombre);
        
    }



    public void obtenerNacionalidadJugador(Scanner scanner, Jugador jugador) {

        System.out.println(AMARILLO+"\nHola " + jugador.getNombre() + " , ahora pongámosle una nacionalidad."+RESET);
        String nacionalidad = (AMARILLO_ANARANJADO+"\n¿De que país es " + jugador.getNombre() + "?"+RESET);
        String nacionalidadJugador = Utilidades.leerCadenaTexto(scanner, nacionalidad);
        jugador.setNacionalidad(nacionalidadJugador);
        System.out.println(AMARILLO+"\n¡Perfecto! "+ jugador.getNombre() + " es de " + jugador.getNacionalidad() + "!"+RESET);
    }


    public void obtenerEdadJugador(Scanner scanner, Jugador jugador) {
        String mensaje = AMARILLO_ANARANJADO + "\n¿Cuántos años tiene " + jugador.getNombre() + "?" + RESET;
        int edad = Utilidades.leerNumero(scanner, mensaje); 
        jugador.setEdad(edad);
        System.out.println(AMARILLO + "\n¡Perfecto! " + jugador.getNombre() + " tiene " + jugador.getEdad() + " años." + RESET);
    }


    
    public void obtenerPosicionJugador(Scanner scanner, Jugador jugador) {
        System.out.println(AMARILLO_ANARANJADO + "\n¿En qué posición juega " + jugador.getNombre() + "?" + RESET);
        System.out.println(NARANJA + "1. Delantero\n2. Centrocampista\n3. Defensa\n4. Portero" + RESET);

        int posicion;
        boolean correcto = false;
        

        while (!correcto) {
            posicion = Utilidades.leerNumero(scanner, "Elige una posición (1-4):");
            switch (posicion) {
                case 1:
                    jugador.setPosicion("Delantero");
                    correcto = true;
                    break;
                case 2:
                    jugador.setPosicion("Centrocampista");
                    correcto = true;
                    break;
                case 3:
                    jugador.setPosicion("Defensa");
                    correcto = true;
                    break;
                case 4:
                    jugador.setPosicion("Portero");
                    correcto = true;
                    break;
                default:
                    System.out.println(ROJO + "Por favor, ingresa un número válido entre 1 y 4." + RESET);
            }
        }
        System.out.println(AMARILLO + "\n¡Seguro que " + jugador.getNombre() + " es muy bueno jugando de " + jugador.getPosicion() + "!" + RESET);
    }


    public static void mostrarFinInicio(){

        System.out.println(ROJO_FUERTE+"\n\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("\n\n¡Perfecto! ¡Ahora mucha suerte en tu carrera como futbolista profesional!");

        System.out.println("\n\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------"+RESET);
    }

}
