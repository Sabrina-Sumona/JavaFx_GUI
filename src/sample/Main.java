package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    // there 3 methods in life cycle method: start method, init method & stop method.
    // start method is mandatory, but others 2 are optional
    @Override
    public void start(Stage primaryStage) throws Exception{
        // we can also the gridpane & label code here without using the sample.fxml file
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 720, 570));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
