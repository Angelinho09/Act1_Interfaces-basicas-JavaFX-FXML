module com.angeldz.control {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.angeldz.control to javafx.fxml;
    exports com.angeldz.control;
}
