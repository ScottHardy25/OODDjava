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
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Chi and Bear
 */
public class LogInController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Label palabel;
    
    @FXML
    private Label unlabel;
    
    @FXML
    private PasswordField pas;
    
    @FXML
    private TextField un;
     
    @FXML
    private void handleButtonAction(ActionEvent event) {
        MainScreenController mainscreen1 = new MainScreenController();
        
        AnchorPane mainScreenAnchorpane =  mainscreen1.getMainScreenpane();
        
        StackPane mainstackpane = new StackPane();
        
        mainstackpane.getChildren().add(mainScreenAnchorpane);
      
           
        Scene mainScreenscene = new Scene(mainstackpane);
        
        Stage mainScreenstage = new Stage();
                
        mainScreenstage.setScene(mainScreenscene);
        
        mainScreenstage.show();
        
    }
    
    /*
  SecondGUIController secondguicntrl = new SecondGUIController();
      
       //intantiate the second GUI anchorpane 
        AnchorPane secondGUIAnchorpane = secondguicntrl.getSecondGUIAnchorPane();

        //instantiate a stack pane
        StackPane secondGUIstackpane = new StackPane();
        
        //add the secondGUI anchor pane to the stack pane
        secondGUIstackpane.getChildren().add(secondGUIAnchorpane);
        
        // add the stack pane to the secondGUI scene
        Scene secondGUIscene = new Scene(secondGUIstackpane);
        
        //create a new stage for the second GUI
        Stage SecondGUIstage = new Stage();
        
        //add the second GUI scene to the create stage
        SecondGUIstage.setScene(secondGUIscene);
        
        //show the secondGUI stage
        SecondGUIstage.show();
    
    */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
