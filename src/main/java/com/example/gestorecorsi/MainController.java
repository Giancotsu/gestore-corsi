package com.example.gestorecorsi;

import com.example.gestorecorsi.model.Model;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    private Model model;

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

    public void setModel(Model model) {
        this.model = model;
    }
}