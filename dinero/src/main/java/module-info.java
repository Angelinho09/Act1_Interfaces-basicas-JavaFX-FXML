module com.angeldz.dinero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.angeldz.dinero to javafx.fxml;
    exports com.angeldz.dinero;
}
