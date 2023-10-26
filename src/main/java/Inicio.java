import java.sql.Connection;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("---------------");
            System.out.println("Apliacion de mensajes");
            System.out.println("1. crear mensaje ");
            System.out.println("2. listar mensaje");
            System.out.println("3. editar mensaje");
            System.out.println("4. eliminar mensaje");
            System.out.println("5. salir");
            System.out.println(">> ");
            //leemos opcion de usuario
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    MensajeService.crearMensaje();
                    break;
                case 2:
                    MensajeService.listarMensajes();
                    break;
                case 3:
                    MensajeService.borrarMensaje();
                    break;
                case 4:
                    MensajeService.editarMensaje();
                    break;
                default:
                    break;
            }

        }while(opcion!=5);



        /*Conexion conexion = new Conexion();
        try (Connection cnx = conexion.get_conConnection()){

        }
        catch (Exception e){
            System.out.println(e);
        }*/
    }
}
