package sample;

import javafx.application.Application;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Main extends Application {
    Label messageLabel;

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        messageLabel = new Label("No score.");
        StackPane root = new StackPane();
        root.getChildren().add(messageLabel);
        Scene scene = new Scene(root, 500, 250);    // window dimensions
        primaryStage.setTitle("New Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
