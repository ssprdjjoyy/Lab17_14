package com.example.lab17_14;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Button calc;

    @FXML
    private Button clear;

    @FXML
    private TextField TextFieldA;

    @FXML
    private TextField TextFieldB;

    @FXML
    private TextField TextFieldSum;

    @FXML
    public void clickCalc(ActionEvent e) {
        try {
            int a = Integer.parseInt(TextFieldA.getText());
            int b = Integer.parseInt(TextFieldB.getText());
            int sum = a + b;
            TextFieldSum.setText(Integer.toString(sum));
        } catch (NumberFormatException ne) {
            TextFieldSum.setText("error");
        }
    }
    @FXML
    public void clickClear(ActionEvent e) {
        TextFieldA.setText("");
        TextFieldB.setText("");
        TextFieldSum.setText("");
    }
}