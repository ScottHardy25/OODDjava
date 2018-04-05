/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddjava;

import java.util.ArrayList;
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

        Admin admin = new Admin("Hank", "Hill", "HHill", "propain123");
        User connected;
        ArrayList<User> users = new ArrayList<>();
        users.add(admin);
     
        Parent root = FXMLLoader.load(getClass().getResource("Screens/LogIn.fxml"));
        Scene scene = new Scene(root);
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