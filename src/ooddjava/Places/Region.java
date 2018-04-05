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
   
    int mangerid;
    
    public Region(String nm){
  
        super(nm);
        
    }
    
    public Region(String nm, int m){
 
        super(nm);
        this.mangerid = m;
        
    }
    
    @Override
   public String toString() {
        return new StringBuffer("Name: ").append(this.name)
        .append(" ID: ").append(this.id)
        .append(" Manger ID: ").append(this.mangerid).toString();
        

    } 
   
   
}
