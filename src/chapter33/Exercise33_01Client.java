package chapter33;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Exercise33_01Client extends Application {
    private TextField annualInterestRate = new TextField();
    private TextField numberOfYear = new TextField();
    private TextField loadAmount = new TextField();
    private TextArea textArea = new TextArea();
    private  Button button = new Button("Submit");
    private Socket socket;
    private DataInputStream inputStream = null;
    private DataOutputStream outputStream = null;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        annualInterestRate.setAlignment(Pos.CENTER_RIGHT);
        numberOfYear.setAlignment(Pos.CENTER_RIGHT);
        loadAmount.setAlignment(Pos.CENTER_RIGHT);
        VBox hBox = new VBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10));
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Annual Interest Rate"), 0, 0);
        gridPane.add(annualInterestRate, 1, 0);
        gridPane.add(new Label("Number of years"), 0, 1);
        gridPane.add(numberOfYear, 1, 1 );
        gridPane.add(button, 2, 1);
        gridPane.add(new Label("Amount"), 0, 2);
        gridPane.add(loadAmount, 1, 2);


        hBox.getChildren().addAll(gridPane, textArea);
        Scene scene = new Scene(hBox, 350, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise33_01Client");
        primaryStage.show();
        button.setOnAction(e -> present());

    }
    public void present(){
        try{
            socket = new Socket("127.0.0.1",9000);
            outputStream = new DataOutputStream(socket.getOutputStream());
            inputStream = new DataInputStream(socket.getInputStream());

            outputStream.writeDouble(Double.parseDouble(annualInterestRate.getText()));
            outputStream.writeInt(Integer.parseInt(numberOfYear.getText()));
            outputStream.writeDouble( Double.parseDouble(loadAmount.getText()));
            outputStream.flush();

            textArea.appendText("Annual Interest Rate: "+inputStream.readDouble() + "\n");
            textArea.appendText("Number of Years: "+inputStream.readInt() + "\n");
            textArea.appendText("Loan  Amount: "+inputStream.readDouble() + "\n");
            textArea.appendText("Monthly Payment: "+inputStream.readDouble() + "\n");
            textArea.appendText("Total monthly: "+inputStream.readDouble() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
