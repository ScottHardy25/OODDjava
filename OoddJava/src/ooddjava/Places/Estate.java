/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddjava.Places;

import ooddjava.User.Manger;

/**
 *
 * @author Scott Hardy
 * 
 * an estate is an collection of Properties and streets
 * it is managed by one manger 
 */
public class Estate extends Places {
    
    Region region;
    Manger manger; 
    
    
    public void Estate(String nm, long e, Region r, Manger mn ){
  
        id = setid();
        name = nm;
        manger = mn;
        region = r;
                
    }
    
    // if there is no current manger to assign to the Estate
    public void Estate(String nm, long e, Region r){
  
        id = setid();
        name = nm;
        region = r;
                
    }
    
    
}
