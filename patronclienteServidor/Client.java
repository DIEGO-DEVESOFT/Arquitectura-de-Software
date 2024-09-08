import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Conectar al servidor en localhost y puerto 12345
            Socket socket = new Socket("localhost", 12345);

            // Crear flujos de entrada y salida para la comunicación
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Enviar un mensaje al servidor
            out.println("¡Hola, servidor!");

            // Leer la respuesta del servidor
            String serverResponse = in.readLine();
            System.out.println("Respuesta del servidor: " + serverResponse);

            // Cerrar la conexión con el servidor
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
