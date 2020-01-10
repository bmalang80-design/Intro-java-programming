package chapter33;

import java.io.*;
import java.net.Socket;

public class HandleClientSocket implements  Runnable{
    private DataOutputStream outputStream = null;
    private DataInputStream inputStream = null;
    private Socket socket;

    public HandleClientSocket(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        try {
            inputStream = new DataInputStream(socket.getInputStream());
            outputStream = new DataOutputStream(socket.getOutputStream());
            while (true) {
                Loan loan = new Loan(inputStream.readDouble(), inputStream.readInt(), inputStream.readDouble());
                outputStream.writeDouble(loan.getAnnualInterestRate());
                outputStream.writeInt(loan.getNumberOfYears());
                outputStream.writeDouble(loan.getAmount());
                outputStream.writeDouble(loan.monthlyPayment());
                outputStream.writeDouble(loan.getTotalPayment());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
