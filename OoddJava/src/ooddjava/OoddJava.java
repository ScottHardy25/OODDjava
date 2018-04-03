/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddjava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ooddjava.People.People;
import ooddjava.User.Admin;
import ooddjava.User.User;

/**
 *
 * @author Chi and Bear
 */
public class OoddJava extends Application {
    
            
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
        User connected;
        Scene scene = new Scene(root);
        Admin admin = new Admin("Hank", "Hill", "HHill", "propain123");
       
        stage.setScene(scene);
        stage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        launch(args);
        
    }
    
}
