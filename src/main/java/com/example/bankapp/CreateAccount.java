package com.example.bankapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CreateAccount {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onRegisterButtonClick(){
        welcomeText.setText("Welcome to Bank");
    }

    @FXML
    protected void openLoginWindow(){
        try {
            // Load the FXML file for the Create Account window
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.fxml"));
            Parent root = fxmlLoader.load();

            // Create a new Stage (window)
            Stage stage = new Stage();
            stage.setTitle("Create Account");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
