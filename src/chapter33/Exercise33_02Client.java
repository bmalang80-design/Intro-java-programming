package chapter33;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Exercise33_02Client extends Application {
    private TextField name = new TextField();
    private TextField age = new TextField();
    private TextField weight = new TextField();
    private TextField height = new TextField();
    private TextArea textArea = new TextArea();
    private Button button = new Button("Submit");
    private Socket socket;
    private DataInputStream inputStream = null;
    private DataOutputStream outputStream = null;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox hBox = new VBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10));
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Name:"), 0, 0);
        gridPane.add(name, 1, 0);
        gridPane.add(new Label("Age:"), 0, 1);
        gridPane.add(age, 1, 1 );
        gridPane.add(button, 2, 1);
        gridPane.add(new Label("Weight:"), 0, 2);
        gridPane.add(weight, 1, 2);
        gridPane.add(new Label("Height:"), 0, 3);
        gridPane.add(height, 1, 3);


        hBox.getChildren().addAll(gridPane, textArea);
        Scene scene = new Scene(hBox, 350, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise33_02Client");
        primaryStage.show();
        button.setOnAction(e -> present());

    }
    public void present(){
        try{
            socket = new Socket("127.0.0.1",9000);
            outputStream = new DataOutputStream(socket.getOutputStream());
            inputStream = new DataInputStream(socket.getInputStream());

            outputStream.writeUTF(name.getText());
            outputStream.writeInt(Integer.parseInt(age.getText()));
            outputStream.writeDouble( Double.parseDouble(weight.getText()));
            outputStream.writeDouble( Double.parseDouble(height.getText()));
            outputStream.flush();

            textArea.appendText("Name: "+inputStream.readUTF() + "\n");
            textArea.appendText("Age: "+inputStream.readInt() + "\n");
            textArea.appendText("Weight: "+inputStream.readDouble() + "\n");
            textArea.appendText("Height: "+inputStream.readDouble() + "\n");
            textArea.appendText("BMI: "+inputStream.readDouble() + "\n");
            textArea.appendText("Status: "+inputStream.readUTF()+ "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
