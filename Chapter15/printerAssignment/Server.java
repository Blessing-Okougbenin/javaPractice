package Chapter15.printerAssignment;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public Server(int portNumber) {
        try {
//        Open server
            ServerSocket server = new ServerSocket(portNumber);
            System.out.println("Opened server");
            System.out.println("Waiting for a client...");
//            Get connected to the client thru the socket by accepting the client
            Socket socket = server.accept();
            System.out.println("The client has been accepted");
//            Receive what the client sends thru the input stream
            DataInputStream inputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
//            store in a variable
            String message = "";

            while(!message.equals("Stop")){
                message = inputStream.readUTF();
                System.out.println(message);
            }

            socket.close();
            inputStream.close();

        }catch(IOException hex){
            System.out.println(hex.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        Server server = new Server(5000);
        System.out.println(server);
    }
}