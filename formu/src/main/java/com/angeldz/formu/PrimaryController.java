package com.angeldz.formu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtNumero;

    @FXML
    private TextField txtCantidadCifras;

    @FXML
    private TextField txtSumaImpares;

    @FXML
    private TextField txtSumaPares;

    @FXML
    private TextField txtSumaTotal;

    @FXML
    private TextField txtCifraMayor;

    @FXML
    private TextField txtCifraMenor;

    @FXML
    private TextArea lstDivisores;

    @FXML
    public void analizar(ActionEvent event) {
        lstDivisores.clear();

        int numero = Integer.parseInt(txtNumero.getText().trim());
        String numStr = String.valueOf(Math.abs(numero));

        int cantidadCifras = numStr.length();
        int sumaImpares = 0;
        int sumaPares = 0;
        int sumaTotal = 0;
        int cifraMayor = 0;
        int cifraMenor = 9;

        for (int i = 0; i < numStr.length(); i++) {
            int digito = Character.getNumericValue(numStr.charAt(i));

            sumaTotal += digito;

            if (digito % 2 == 0) {
                sumaPares += digito;
            } else {
                sumaImpares += digito;
            }

            if (digito > cifraMayor) cifraMayor = digito;
            if (digito < cifraMenor) cifraMenor = digito;
        }

        txtCantidadCifras.setText(String.valueOf(cantidadCifras));
        txtSumaImpares.setText(String.valueOf(sumaImpares));
        txtSumaPares.setText(String.valueOf(sumaPares));
        txtSumaTotal.setText(String.valueOf(sumaTotal));
        txtCifraMayor.setText(String.valueOf(cifraMayor));
        txtCifraMenor.setText(String.valueOf(cifraMenor));

        
        StringBuilder sbDivisores = new StringBuilder();
        for (int i = 1; i <= Math.abs(numero); i++) {
            if (numero % i == 0) {
                sbDivisores.append(i).append("\n");
            }
        }
        lstDivisores.setText(sbDivisores.toString());
    }

    @FXML
    public void limpiar(ActionEvent event) {
        txtNumero.clear();
        txtCantidadCifras.clear();
        txtSumaImpares.clear();
        txtSumaPares.clear();
        txtSumaTotal.clear();
        txtCifraMayor.clear();
        txtCifraMenor.clear();
        lstDivisores.clear();
        txtNumero.requestFocus();
    }
}