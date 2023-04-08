package com.example.gestorecorsi;

        import java.net.URL;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.ResourceBundle;

        import com.example.gestorecorsi.model.Corso;
        import com.example.gestorecorsi.model.Model;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextArea;
        import javafx.scene.control.TextField;

public class MainController {

    private Model model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCorsiPerPeriodo;

    @FXML
    private Button btnDivisioneStudenti;

    @FXML
    private Button btnNumeroStudenti;

    @FXML
    private Button btnStudenti;

    @FXML
    private TextField txtCorso;

    @FXML
    private TextField txtPeriodo;

    @FXML
    private TextArea txtRisultato;

    @FXML
    void corsiPerPeriodo(ActionEvent event) {
        String input = txtPeriodo.getText();
        int inputNum = 0;

        try {
            inputNum = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            // TODO: handle exception
            txtRisultato.setText("Inserted Value is not an integer value");
            return;
        }

        if (inputNum < 1 || inputNum >2) {
            txtRisultato.setText("Inserted 1 or 2");
            return;
        }

        List<Corso> result = new ArrayList<>();
        result = model.getCorsiByPeriodo(inputNum);

        txtRisultato.clear();
        txtRisultato.setText("Ho trovato " + result.size() + " corsi. \n");

        for (Corso c : result)
            txtRisultato.appendText("" + c + "\n");
    }

    @FXML
    void numeroStudenti(ActionEvent event) {

    }

    @FXML
    void stampaDivisione(ActionEvent event) {

    }

    @FXML
    void stampaStudenti(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnCorsiPerPeriodo != null : "fx:id=\"btnCorsiPerPeriodo\" was not injected: check your FXML file 'main.fxml'.";
        assert btnDivisioneStudenti != null : "fx:id=\"btnDivisioneStudenti\" was not injected: check your FXML file 'main.fxml'.";
        assert btnNumeroStudenti != null : "fx:id=\"btnNumeroStudenti\" was not injected: check your FXML file 'main.fxml'.";
        assert btnStudenti != null : "fx:id=\"btnStudenti\" was not injected: check your FXML file 'main.fxml'.";
        assert txtCorso != null : "fx:id=\"txtCorso\" was not injected: check your FXML file 'main.fxml'.";
        assert txtPeriodo != null : "fx:id=\"txtPeriodo\" was not injected: check your FXML file 'main.fxml'.";
        assert txtRisultato != null : "fx:id=\"txtRisultato\" was not injected: check your FXML file 'main.fxml'.";

    }

    public void setModel(Model model) {
        this.model = model;
    }

}
