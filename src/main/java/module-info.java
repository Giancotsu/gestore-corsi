module com.example.gestorecorsi {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.gestorecorsi to javafx.fxml;
    exports com.example.gestorecorsi;
}