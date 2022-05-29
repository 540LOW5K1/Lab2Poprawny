module com.example.exampledemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exampledemo to javafx.fxml;
    exports com.example.exampledemo;
}