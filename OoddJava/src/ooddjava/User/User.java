/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddjava.User;

import static ooddjava.Method.Password.genpassword;
import ooddjava.Method.Validator;
import ooddjava.People.People;

/**
 *
 * @author Scott Hardy
 */
public abstract class User extends People{
    
    String username;
    String password;
    
    
    public User(String f, String l, String t, String u ){
        super(f,l,t);
        username = u;
        password = genpassword();
    }
    
    
    public boolean changePassword (String p){
         if (Validator.checkpassword(p)){
            password = p;
            return true;
        }
        return false;     
    }
     
    public String getusername() { return username;}
    public String getpassword() { return password;}
    
}
