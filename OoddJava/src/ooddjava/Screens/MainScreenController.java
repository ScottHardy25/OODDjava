/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddjava.Screens;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MainScreenController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Label name;
    @FXML
    private Label date;
    @FXML
    private Label time;
    @FXML
    private Label usertype;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        ObservableList<String> option = 
    FXCollections.observableArrayList(
        "Option 1",
        "Option 2",
        "Option 3"
    );
    final ComboBox comboBox = new ComboBox(option);
    }    
    
    
}
