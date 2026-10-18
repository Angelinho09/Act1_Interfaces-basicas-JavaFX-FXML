package com.angeldz.calcular;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtNumero;

    @FXML
    private TextArea txtTabla;

    @FXML
    public void calcular(ActionEvent event) {
        txtTabla.clear();


        int numero = Integer.parseInt(txtNumero.getText().trim());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            sb.append(numero).append("x").append(i).append(" = ").append(numero * i).append("\n");
        }

        txtTabla.setText(sb.toString());
    }

    @FXML
    public void limpiar(ActionEvent event) {
        txtNumero.clear();
        txtTabla.clear();
        txtNumero.requestFocus();
    }
}