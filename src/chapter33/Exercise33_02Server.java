package chapter33;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Exercise33_02Server {

    public static void main(String[] args) {
        new Exercise33_02Server();
    }

    public Exercise33_02Server(){
       new Thread(() ->{
           try{
               ServerSocket serverSocket = new ServerSocket(9000);
               System.out.println("Server has started");
               while (true){
                   Socket socket = serverSocket.accept();
                   System.out.println("Server is connected to client");
                   new Thread(new HandleClientSocketBMI(socket)).start();
               }
           } catch (IOException e) {
               e.printStackTrace();
           }
       }).start();
    }
    class HandleClientSocketBMI implements Runnable{
        private Socket socket;

        public HandleClientSocketBMI(Socket socket){
            this.socket = socket;
        }
        @Override
        public void run() {
            try{
                DataInputStream inputStream = new DataInputStream(socket.getInputStream());
                DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
                while (true){
                    BMI bmi = new BMI(
                            inputStream.readUTF(),
                            inputStream.readInt(),
                            inputStream.readDouble(),
                            inputStream.readDouble()
                    );
                    outputStream.writeUTF(bmi.getName());
                    outputStream.writeInt(bmi.getAge());
                    outputStream.writeDouble(bmi.getWeight());
                    outputStream.writeDouble(bmi.getHeight());
                    outputStream.writeDouble(bmi.getBMI());
                    outputStream.writeUTF(bmi.getStatus());

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
