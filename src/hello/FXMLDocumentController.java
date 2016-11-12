/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;

/**
 *
 * @author dompl
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    String b;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        label.setText(b);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TextInputDialog a = new TextInputDialog();
        a.setHeaderText("Podaj imie");
        b = a.showAndWait().get();
    }    
    
}
