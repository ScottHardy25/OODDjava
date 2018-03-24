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
public abstract class User {
    long id; 
    static long nextid = 0;
    String username;
    String password;
    String type;
    
    public void User(String u, String p, String t) {
        id = nextid;
        nextid += 1;
        username = u;
        password = p;
        type = t;
    } 
    
    public boolean changePassword (String p){
        
        if (p.length() >= 9){
        password = p;
        return true;
        }
        return false;
        
    }
           
    
    
}
