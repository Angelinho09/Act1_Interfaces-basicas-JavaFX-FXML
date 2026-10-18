package com.angeldz.dinero;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtDinero;

    @FXML
    private TextArea txtEtiquetas;

    @FXML
    private TextArea txtCantidades;

    // Se ejecuta automáticamente al abrir la interfaz
    @FXML
    public void initialize() {
        // Colocar las etiquetas fijas tal cual aparecen en la imagen
        StringBuilder sb = new StringBuilder();
        sb.append("Billetes de $500\n");
        sb.append("Billetes de $200\n");
        sb.append("Billetes de $100\n");
        sb.append("Billetes de $50\n");
        sb.append("Billetes de $20\n");
        sb.append("Monedas de $10\n");
        sb.append("Monedas de $5\n");
        sb.append("Monedas de $2\n");
        sb.append("Monedas de $1");

        if (txtEtiquetas != null) {
            txtEtiquetas.setText(sb.toString());
        }
    }

    @FXML
    void calcularDesglose(ActionEvent event) {
        if (txtCantidades != null) {
            txtCantidades.clear();
        }

        try {
            int monto = Integer.parseInt(txtDinero.getText().trim());

            int[] denominaciones = {500, 200, 100, 50, 20, 10, 5, 2, 1};
            StringBuilder sbCantidades = new StringBuilder();

            for (int valor : denominaciones) {
                int cantidad = monto / valor;
                monto = monto % valor;
                sbCantidades.append(cantidad).append("\n");
            }

            if (txtCantidades != null) {
                txtCantidades.setText(sbCantidades.toString());
            }

        } catch (Exception e) {
            if (txtCantidades != null) {
                txtCantidades.setText("Error");
            }
        }
    }

    @FXML
    void borrarCampos(ActionEvent event) {
        if (txtDinero != null) txtDinero.clear();
        if (txtCantidades != null) txtCantidades.clear();
        if (txtDinero != null) txtDinero.requestFocus();
    }
}