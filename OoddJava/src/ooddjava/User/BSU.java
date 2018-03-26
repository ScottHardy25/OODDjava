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
public class BSU extends User{

   Manger manger;
   
    public void BSU (String f, String l, String u, String p, Manger m){
        fname = f;
        lname = l;
        id = setid();
        type = "BSU";
        username = u;
        password = p;
        manger = m;
    }
    
    // no manger 
    public void BSU (String f, String l, String u, String p){
        fname = f;
        lname = l;
        id = setid();
        type = "BSU";
        username = u;
        password = p;
        
    }
  
    /*
    
    */
    
    
}
