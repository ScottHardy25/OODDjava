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
 * 1 Region can contain many Estates. It should have only one manger, but this
 * isn't a core requirement . It could be extended to have a Regional manger 
 */
public class Region extends Places {
   
    Manger manger;
    
    public void Region( long e, String nm){
  
        id = setid();
        name = nm;
        
    }
    
    public void Region( long e, String nm, Manger m){
  
        id = setid();
        name = nm;
        manger = m;
        
    }
   
   
}
