package com.example;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField lengthField;

    @FXML
    private TextField radiusField;

    @FXML
    private TextField surfaceField;

    Henger henger;

    @FXML
    void onClickAboutButton(ActionEvent event) {
        App.setRoot("aboutScene");
    }

    @FXML
    void onClickCalcButton(ActionEvent event) {
        startCalc();
    }

    private void startCalc() {
        try {
            double radius = Double.parseDouble(radiusField.getText());
            double length = Double.parseDouble(lengthField.getText());

            double surface = calcArea(radius, length);

            System.out.println("Felszín: " + surface);
            surfaceField.setText(Double.toString(surface));
        } catch (NumberFormatException e) {
            surfaceField.setText("Hibás bemenet!");
        }
    }

    private double calcArea(double radius, double length) {
        return 2 * Math.PI * radius * (radius + length);
    }

    @FXML
    void onClickExitButton(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void onClickSaveButton(ActionEvent event) {
        App.setRoot("solutionScene");
    }    
}