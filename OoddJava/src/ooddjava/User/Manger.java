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
    
    public void createBSU(String u, String p){
        id = nextid;
        nextid += 1;
        username = u;
        password = p;
        type = "bsu";
        mngid = this.id; 
    }
    
}
