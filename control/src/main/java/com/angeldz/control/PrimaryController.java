package com.angeldz.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtAlimentacion;

    @FXML
    private TextField txtRefrigerios;

    @FXML
    private TextField txtTransporte;

    @FXML
    private TextField txtTelefonia;

    @FXML
    private TextField txtOtros;

    @FXML
    private TextField txtTotalSemanal;

    @FXML
    private TextField txtGastoMasAlto;

    @FXML
    public void calcularEstadisticas(ActionEvent event) {
        // Conversión directa sin validaciones
        int alimentacion = Integer.parseInt(txtAlimentacion.getText().trim());
        int refrigerios = Integer.parseInt(txtRefrigerios.getText().trim());
        int transporte = Integer.parseInt(txtTransporte.getText().trim());
        int telefonia = Integer.parseInt(txtTelefonia.getText().trim());
        int otros = Integer.parseInt(txtOtros.getText().trim());

        // Calcular el total semanal
        int total = alimentacion + refrigerios + transporte + telefonia + otros;

        // Determinar el gasto más alto
        int maxGasto = alimentacion;
        String nombreMaxGasto = "Alimentación";

        if (refrigerios > maxGasto) {
            maxGasto = refrigerios;
            nombreMaxGasto = "Refrigerios";
        }
        if (transporte > maxGasto) {
            maxGasto = transporte;
            nombreMaxGasto = "Transporte";
        }
        if (telefonia > maxGasto) {
            maxGasto = telefonia;
            nombreMaxGasto = "Telefonía";
        }
        if (otros > maxGasto) {
            maxGasto = otros;
            nombreMaxGasto = "Otros";
        }

        // Mostrar resultados en los campos correspondientes
        txtTotalSemanal.setText(String.valueOf(total));
        txtGastoMasAlto.setText(nombreMaxGasto);
    }

    @FXML
    public void limpiar(ActionEvent event) {
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();
        txtTotalSemanal.clear();
        txtGastoMasAlto.clear();
        txtAlimentacion.requestFocus();
    }
}