module com.example.bankapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.bankapp to javafx.fxml;
    exports com.example.bankapp;
}