package com.example.bankapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BankController {
    @FXML
    private Label loginLabel;

    @FXML
    protected void onLoginButtonClick(){
        loginLabel.setText("Welcome to Bank");
    }

    @FXML
    protected void openCreateAccountWindow(){
        try {
            // Load the FXML file for the Create Account window
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CreateAccount.fxml"));
            Parent root = fxmlLoader.load();

            // Create a new Stage (window)
            Stage stage = new Stage();
            stage.setTitle("Create Account");
            stage.setScene(new Scene(root));
            stage.show();

            Stage currentStage = (Stage) loginLabel.getScene().getWindow(); // Or any other control in the login window
            currentStage.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
