package com.example.codigo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LogInApplication extends Application {

    private static Stage stg; // lo creamos para poder cambiarlo luego


    @Override
    public void start(Stage stage) throws Exception {

        stg = stage;
        stage.setResizable(false);
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("loginwindow.fxml")));
        stage.setTitle("EA Music Player");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
        // #F0FFF0
    }
    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);

    }

    public static void main(String[] args) {
        launch(args);
    }
}