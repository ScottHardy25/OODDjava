/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddjava.Screens;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MainScreenController implements Initializable {

    public MainScreenController(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainScreen.fxml"));
        loader.setController(this);
        try{
            loader.load();
        }catch (Exception e) { System.out.println(e.getMessage()+ "MainScreenController.fxml file failed");
        }
    }
    
   
   
    /**
     * Initializes the controller class.
     */
    
    @FXML AnchorPane mainScreenAnchor;
    @FXML public void setMainScreenpane(AnchorPane mainScreen){ mainScreenAnchor = mainScreen ;}
    @FXML public AnchorPane getMainScreenpane(){return mainScreenAnchor;}
    
   

    @FXML
    private Label name;
    @FXML
    private Label date;
    @FXML
    private Label time;
    @FXML
    private Label usertype;
    
    @FXML
    private Button submit;
    @FXML
    private Button logout;

    @FXML
    private ComboBox option;
    
     private void submit(ActionEvent event) {
         
         
     }
    
      private void logout (ActionEvent event) {
          
      }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       /*
        ObservableList<String> option = 
    FXCollections.observableArrayList(
        "Option 1",
        "Option 2",
        "Option 3"
    );
    final ComboBox comboBox = new ComboBox(option);
      
    */
     } 
}
