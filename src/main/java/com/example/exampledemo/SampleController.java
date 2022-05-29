package com.example.exampledemo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {
    int clickCounter = 0;
    public Button btnMain;
    public TextField txtLicznik;

    @FXML
   private Label welcomeText;

    @FXML
    protected void onBtnAction() {
        txtLicznik.setText("Kliknięcie nr! " + ++clickCounter);
        System.out.println("Kliknięcie nr !" + clickCounter);
        if (clickCounter == 1)
            btnMain.setText("I jeszcze raz");
    }
}