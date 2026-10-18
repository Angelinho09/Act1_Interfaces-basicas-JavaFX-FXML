module com.angeldz.calcular {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.angeldz.calcular to javafx.fxml;
    exports com.angeldz.calcular;
}
