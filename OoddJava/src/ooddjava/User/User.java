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
        this.username = u;
        this.password = genpassword();
    }
    
    
    public boolean changePassword (String p){
         if (Validator.checkpassword(p)){
            this.password = p;
            return true;
        }
        return false;     
    }
     
    public String getusername() { return this.username;}
    public String getpassword() { return this.password;}
    
    public String toString() {
        return new StringBuffer(" First Name: ").append(this.fname)
        .append(" Last Name: ").append(this.lname)
        .append(" Type: ").append(this.type)
        .append(" ID: ").append(this.id)
        .append(" Username: ").append(this.username)
        .append(" Password: ").append(this.password).toString();
        

    }
    
}
