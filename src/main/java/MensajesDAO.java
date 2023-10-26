import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensajesDAO {
    public static void crearMensajeDB(Mensajes mensaje) {
        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_conConnection()) {
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO `mensajes_app`.`mensajes` (`mensaje`, `autor_mensaje`) VALUES (?,?)";
                ps =conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());
                ps.executeUpdate();

            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void leerMensajeDB() {

    }

    public static void borrarMensajeDB(int id_mensaje) {

    }

    public static void actualizarMensajeDB(Mensajes mensaje) {

    }

}
