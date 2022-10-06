package Chapter15.printerAssignment;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {


    public Client(String address,int portNumber) throws IOException {

        Socket socket = new Socket(address, portNumber);
            System.out.println("You are successfully connected");

        DataInputStream inputStream = new DataInputStream(System.in);
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

         Scanner scanner = new Scanner(System.in);
            String message ="";

        while(!message.equals("Stop")){
        message = scanner.nextLine();
            outputStream.writeUTF(message);
        }

        socket.close();
        inputStream.close();
        outputStream.close();
    }



    public static void main(String[] args) throws IOException {
        try {
            Client client = new Client("172.16.0.162", 5000);
            System.out.println(client);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
