/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xyz.trebellar.tareadi02;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 *
 * @author nacho
 */
public class vPrincipalController {

    @FXML
    private Button btnReservar;

    @FXML
    private void switchToSecondary(ActionEvent event) throws IOException {
          App.setRoot("secondary");
    }
    
}
