package com.example.exampledemo;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class SampleController {
    public Button btnOblicz;
    public TextField promien;
    public TextField wysokosc;
    public TextField grubosc;
    public Text ciezar;
    public Text koszt;
    public Text BlachaStalowa;
    public Text BlachaNierdzewna;
    public TextField BlachaStalowaWaga;
    public TextField BlachaStalowaKoszt;
    public TextField BlachaNierdzewnaWaga;
    public TextField BlachaNierdzewnaKoszt;
    public Text info;
    float r, h, g;

    public void onBtnAction(ActionEvent actionEvent) {

            try {
                r = Float.parseFloat(promien.getText());
                h = Float.parseFloat(wysokosc.getText());
                g = Float.parseFloat(grubosc.getText());

                if (r > 0 && h > 0 && g > 0) {
                    oblicz();
                } else {
                    info.setText("Wartości muszą być większe od 0!");
                }
            } catch (Exception ignore) {
                info.setText("Nie prawidłowe wartości!");
            }
        }

    private void oblicz() {

        ciezar.setVisible(true);
        koszt.setVisible(true);
        BlachaStalowa.setVisible(true);
        BlachaNierdzewna.setVisible(true);
        BlachaStalowaWaga.setVisible(true);
        BlachaStalowaKoszt.setVisible(true);
        BlachaNierdzewnaWaga.setVisible(true);
        BlachaNierdzewnaKoszt.setVisible(true);

        float pole_calkowite = (float) (2 * 3.14 * r * r + 2 * 3.14 * r * h);

        float waga_blachy = 7.85F * pole_calkowite * g;
        float waga_blachy_nierdz = 8F * pole_calkowite * g;

        float cena_blachy = 2.5F * waga_blachy;
        float cena_blachy_nierdz = 3F * waga_blachy_nierdz;

        BlachaStalowaWaga.setText(waga_blachy + " kg");
        BlachaStalowaKoszt.setText(cena_blachy + " zł");
        BlachaNierdzewnaWaga.setText(waga_blachy_nierdz + " kg");
        BlachaNierdzewnaKoszt.setText(cena_blachy_nierdz + " zł");
    }
}