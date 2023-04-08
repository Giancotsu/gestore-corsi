package com.example.gestorecorsi;

import com.example.gestorecorsi.model.Model;
import com.example.gestorecorsi.test.TestCorsoDAO;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EntryPoint extends javafx.application.Application{

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Gestore Corsi!");

        Model model = new Model();
        MainController controller = fxmlLoader.getController();
        controller.setModel(model);

        stage.setScene(scene);
        stage.show();
    }

    public static void run(String[] args) {
        launch();

        TestCorsoDAO.getCorsoByPd();
    }
}
