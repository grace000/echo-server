import java.net.*;
import java.io.*;


public class EchoServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(59898)) {
            System.out.println("Server running ...");

            while (true) {
                Socket connectionSocket = serverSocket.accept();
                System.out.println("New client connected");
                new ServerThread(connectionSocket).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
