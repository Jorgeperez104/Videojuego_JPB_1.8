package utilidades;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ConexionBD {
    // Aquí puedes definir la URL de tu base de datos, usuario y contraseña
    private static final String URL = "jdbc:mysql://localhost:3306/partidasvideojuego";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "Password1234";

    // Método para obtener la conexión a la base de datos
    public static Connection obtenerConnection() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
    }

    public static void guardarPartida(String nombre, String nacionalidad, int edad, String posicion) {
        String sql = "INSERT INTO Partidas (jugador_nombre, jugador_nacionalidad, jugador_edad, jugador_posicion ) VALUES (?, ?, ?, ?)";
        try (Connection conn = obtenerConnection();
             PreparedStatement sentencia = conn.prepareStatement(sql)) {
            sentencia.setString(1, nombre);
            sentencia.setString(2, nacionalidad);
            sentencia.setInt(3, edad);
            sentencia.setString(4, posicion);
            sentencia.executeUpdate();
            System.out.println("Partida guardada exitosamente.");
        } catch (SQLException e) {
            System.err.println("Error al guardar la partida: " + e.getMessage());
        }
    }
}
