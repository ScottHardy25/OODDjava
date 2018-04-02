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

   int mangerid;
   
   
   
    public  BSU (String f, String l, String u, String t, int m){
        
     
        super(f, l, u, t);
        this.type = "BSU";
        mangerid = m;
    }
    
    // no manger 
    public  BSU (String f, String l, String t, String u){
         super(f, l, u, t );
         type = "BSU";
    }
   
    
    @Override
    
   public String toString() {
        return new StringBuffer(" First Name: ").append(this.fname)
        .append(" Last Name: ").append(this.lname)
        .append(" Type: ").append(this.type)
        .append(" ID: ").append(this.id)
        .append(" Username: ").append(this.username)
        .append(" Password: ").append(this.password)
        .append(" Mangers ID: ").append(this.mangerid).toString();
        

    } 
}

