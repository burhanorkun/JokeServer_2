package com.turkcell.jokeapp.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("JokeGUI.fxml"));
        primaryStage.setTitle("Şaka fabrikası");
        primaryStage.setScene(new Scene(root, 400, 250));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
