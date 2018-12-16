package com.keita;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Main.class.getResource("fxml/index.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(Main.class.getResource("style/index.css").toExternalForm());
        scene.getStylesheets().add(Main.class.getResource("style/message.css").toExternalForm());
        primaryStage.setTitle("Mall Project");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
