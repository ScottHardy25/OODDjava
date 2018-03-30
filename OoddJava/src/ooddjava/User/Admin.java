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
public class Admin extends Manger {
    
    public  Admin (String f, String l, String u){
       super(f,l,"Admin",u);
       type = "Admin";
       
        
    }
    
}
