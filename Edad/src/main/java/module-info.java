module com.angeldz.edad {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.angeldz.edad to javafx.fxml;
    exports com.angeldz.edad;
}
