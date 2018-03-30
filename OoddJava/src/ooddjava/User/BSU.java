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
        type = "BSU";
        mangerid = m;
    }
    
    // no manger 
    public  BSU (String f, String l, String t, String u){
         super(f, l, u, t );
         type = "BSU";
    }
  
}

