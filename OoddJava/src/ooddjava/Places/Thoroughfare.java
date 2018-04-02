/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddjava.Places;

/**
 *
 * @author Scott Hardy
 * thoroughfares mostly known as streets. They are lined with properties 
 */
public class Thoroughfare extends Places {
    
    Estate estate;
    
    public Thoroughfare (  String nm, Estate e){
        
        super(nm);
        this.estate = e;
        
        
    }
    
   
    
}
