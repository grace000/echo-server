import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ServerThread extends Thread {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            //Create Input&Outputstreams for the connection
            InputStream inputToServer = socket.getInputStream();
            OutputStream outputFromServer = socket.getOutputStream();

            Scanner scanner = new Scanner(inputToServer, "UTF-8");
            PrintWriter serverPrintOut = new PrintWriter(new OutputStreamWriter(outputFromServer, "UTF-8"), true);

            serverPrintOut.println("Connection successful! Enter Bye to exit.");
            serverPrintOut.println("I'm Running on Thread: " + Thread.currentThread().getName());

            //Have the server take input from the client and echo it back
            //This should be placed in a loop that listens for a terminator text e.g. bye
            boolean done = false;

            while(!done && scanner.hasNextLine()) {
                String line = scanner.nextLine();
                serverPrintOut.println(line);

                if (line.toLowerCase().trim().equals("bye")) {
                    done = true;
                    socket.close();
                }
            }
        } catch (IOException e) {
            System.out.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
