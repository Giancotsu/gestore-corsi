package com.example.gestorecorsi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    public void corsiPerPeriodo(){}
    public void numeroStudenti(){}
    public void stampaStudenti(){}
    public void stampaDivisione(){}
}