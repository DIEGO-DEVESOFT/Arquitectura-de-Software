import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Crear un socket de servidor que escucha en el puerto 12345
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Servidor iniciado y esperando conexiones...");

            // Aceptar conexiones de clientes en un bucle
            while (true) {
                // Aceptar una conexión de un cliente
                Socket clientSocket = serverSocket.accept();
                System.out.println("Cliente conectado: " + clientSocket.getInetAddress());

                // Crear flujos de entrada y salida para la comunicación
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                // Leer el mensaje del cliente
                String clientMessage = in.readLine();
                System.out.println("Mensaje del cliente: " + clientMessage);

                // Enviar una respuesta al cliente
                out.println("Hola, cliente. He recibido tu mensaje: " + clientMessage);

                // Cerrar la conexión con el cliente
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
