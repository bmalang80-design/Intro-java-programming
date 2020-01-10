package chapter33;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Exercise33_01Server {


    public static void main(String[] args) {
        new Exercise33_01Server();
    }
    public Exercise33_01Server(){
        new Thread(()->{
            try {
                ServerSocket serverSocket = new ServerSocket(9000);
                System.out.println("Server has started");
                while (true){
                    Socket socket = serverSocket.accept();
                    HandleClientSocket socket1 = new HandleClientSocket(socket);
                    new Thread(socket1).start();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
