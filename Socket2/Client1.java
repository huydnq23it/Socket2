package Socket2;

import java.io.*;
import java.net.*;

public class Client1 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);

            BufferedReader fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String number;
            while ((number = fromServer.readLine()) != null) {
                System.out.println("Received: " + number);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
