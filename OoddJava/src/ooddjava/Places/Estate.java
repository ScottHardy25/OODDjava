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
    int mangerid; 
    
    
    public  Estate(String nm,Region r, int mn ){
  
        super(nm);
        this.mangerid = mn;
        this.region = r;
                
    }
    
    // if there is no current manger to assign to the Estate
    public  Estate(String nm,Region r ){
  
        super(nm);

        this.region = r;
                
    }
    
      @Override
   public String toString() {
        return new StringBuffer("Name: ").append(this.name)
        .append(" ID: ").append(this.id)
        .append(" Region: ").append(this.region)
        .append(" Manger ID: ").append(this.mangerid).toString();
        

    } 
    
    
}
