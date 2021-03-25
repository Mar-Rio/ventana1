package hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    private Label label;
    private Label centro;
    private Label ver;
    @FXML
    private TextField nombre;
    @FXML
    private TextField apellidos;
    @FXML
    private TextField fecha;
    @FXML
    private TextField retorno;
    @FXML
    private Button boton;

    public void initialize() {
    }

    private void ver(ActionEvent event) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        centro.setText("Hello, JavaFX " + javafxVersion + "\nRunning on Java " + javaVersion + ".");

    }

    @FXML
    private String tunombre() {
        return nombre.getText();

    }

    @FXML
    private String tusApellidos() {
       return apellidos.getText();
    }

    @FXML
    private String tuFecha() {
        return fecha.getText();
    }

    @FXML
    private void error() {
        retorno.setText("No es posible escribir aqui.");
    }

    @FXML
    private void imprimir() {
        retorno.setText(tunombre() + " " + tusApellidos() + " " + tuFecha());
    }

}
