package com.angeldz.edad;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {



    @FXML
    private TextField txtFecha;

    @FXML
    private Label lblResultado;


    

    @FXML
    private void limpiarValor(ActionEvent event) {
        txtFecha.setText("");
        lblResultado.setText("");
    }

    @FXML
    private void calcularEdad(ActionEvent event) {
        String textoFecha = txtFecha.getText();
        DateTimeFormatter molde = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(textoFecha, molde);
        LocalDate hoy = LocalDate.now();
        Period tiempoPasado = Period.between(fechaNacimiento, hoy);
        int anios = tiempoPasado.getYears();
        int meses = tiempoPasado.getMonths();
        lblResultado.setText("Tiene " + anios + " años con " + meses + " meses");
    }


}