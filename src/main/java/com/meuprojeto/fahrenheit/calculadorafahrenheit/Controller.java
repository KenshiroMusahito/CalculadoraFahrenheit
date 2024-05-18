package com.meuprojeto.fahrenheit.calculadorafahrenheit;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField celsiusInput;
    @FXML
    private Button convertButton;
    @FXML
    private Label resultLabel;


    @FXML
    private void convertTemperature() {
        try {
            double celsius = Double.parseDouble(celsiusInput.getText());
            double fahrenheit = celsius * 9 / 5 + 32;
            resultLabel.setText("Resultado em Fahrenheit: " + fahrenheit);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Por favor, insira um número válido.");
        }
    }
}
