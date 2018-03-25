/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddjava.User;

/**
 *
 * @author Scott Hardy
 */
public class Admin extends Manger {
    
    public void Admin (String f, String l, String u, String p){
        fname = f;
        lname = l;
        id = setid();
        type = "Admin";
        username = u;
        password = p;
        
    }
    
}
