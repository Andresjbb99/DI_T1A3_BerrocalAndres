module ieslosmontecillos.ejercicio3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ieslosmontecillos.ejercicio3 to javafx.fxml;
    exports ieslosmontecillos.ejercicio3;
}