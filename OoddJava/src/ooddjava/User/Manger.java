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
public class Manger extends BSU {
    
   public void Manger (String f, String l, String u, String p){
        fname = f;
        lname = l;
        id = setid();
        type = "Manger";
        username = u;
        password = p;
        
    }
    
   public void createbsu(){
       //new BSU(String f, String l, String u, String p, this);
       
   }
    
}
