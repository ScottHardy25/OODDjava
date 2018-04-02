/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddjava.User;

import static ooddjava.Method.Password.genpassword;

/**
 *
 * @author Scott Hardy
 */
public class Manger extends BSU {
    
   public  Manger (String f, String l, String t, String u){
         super(f, l, u, t);
         type = "Manger";
    }
    
   
   public void createbsu(String f, String l, String u){
       int i = id;
       BSU b = new BSU(f, l, u, genpassword(), i);
   }
   
   @Override
   public String toString() {
        return new StringBuffer(" First Name: ").append(this.fname)
        .append(" Last Name: ").append(this.lname)
        .append(" Type: ").append(this.type)
        .append(" ID: ").append(this.id)
        .append(" Username: ").append(this.username)
        .append(" Password: ").append(this.password).toString();
        

    } 
    
}
