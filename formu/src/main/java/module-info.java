module com.angeldz.formu {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.angeldz.formu to javafx.fxml;
    exports com.angeldz.formu;
}
