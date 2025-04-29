package componentes;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Partida {
    private LocalDateTime fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Jugador jugador; 

    public Partida(String nombreJugador, String nacionalidad, int edad, String posicion) {
        this.fecha = LocalDateTime.now();
        this.jugador = new Jugador(nombreJugador, nacionalidad, edad, posicion);
    }

    public void iniciarPartida() {
        this.horaInicio = LocalTime.now();
    }

    public void finalizarPartida() {
        this.horaFin = LocalTime.now();
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public Jugador getJugador() {
        return jugador;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "\nJugador=" + jugador.getNombre() +
                ",\n Fecha=" + fecha +
                ",\n Hora Inicio=" + (horaInicio != null ? horaInicio : "No iniciada") +
                ",\n Hora Fin =" + (horaFin != null ? horaFin : "No finalizada") +
                "}\n";
    }
}

