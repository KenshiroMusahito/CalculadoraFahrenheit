module com.meuprojeto.fahrenheit.calculadorafahrenheit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.meuprojeto.fahrenheit.calculadorafahrenheit to javafx.fxml;
    exports com.meuprojeto.fahrenheit.calculadorafahrenheit;
}