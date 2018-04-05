/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddjava.User;

import static ooddjava.Method.Password.genpassword;
import static ooddjava.Method.Validator.lowercase;

/**
 *
 * @author Scott Hardy
 */
public class Admin extends Manger {
    
    public  Admin (String f, String l, String u){
       super(f,l,"Admin",u);
       type = "Admin";
       
        
    }
    
    public  Admin (String f, String l, String u, String p){
       super(f,l,"Admin",u);
       type = "Admin";
       password = lowercase(p); 
       
        
    }
     
      public void createbsu(String first, String last, String user, int manid){
       int next = getnextid();
       BSU bsu = new BSU(first, last, user, genpassword(), manid);
   }
      public void createmanger(String first, String last, String user){
        int next = getnextid();
       Manger manger = new Manger(first, last, null, user);
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
