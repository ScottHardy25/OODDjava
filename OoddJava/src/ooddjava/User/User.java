/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddjava.User;

import ooddjava.People.People;

/**
 *
 * @author Scott Hardy
 */
public abstract class User extends People{
    
    String username;
    String password;
    
    
    public void User(String f, String l, String t, String u, String p){
        fname = f;
        lname = l;
        id = setid();
        type = t;
        username = u;
        password = p;
    }
    public boolean changePassword (String p){
        
        if (p.length() >= 9){
        password = p;
        return true;
        }
        return false;
        
    }
           
    
    
}
