package com.example.bankapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class BankApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // start the connection
        DatabaseConnector databaseConnector = DatabaseConnector.getInstance();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 340, 300);
        stage.setTitle("Login page");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void stop() throws Exception {
        DatabaseConnector.getInstance().closeConnection();
        super.stop();
    }
}
