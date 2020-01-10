package chapter33;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Exercise33_01Server {


    public static void main(String[] args) {
        new Exercise33_01Server();
    }
    public Exercise33_01Server(){
        new Thread(()->{
            try {

                ServerSocket serverSocket = new ServerSocket(9000);
                System.out.println("Exercise33_01Server started at at "+ new Date());
                while (true){
                    Socket socket = serverSocket.accept();
                    System.out.println("Connected to client at "+ new Date());
                    HandleClientSocket socket1 = new HandleClientSocket(socket);
                    new Thread(socket1).start();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
