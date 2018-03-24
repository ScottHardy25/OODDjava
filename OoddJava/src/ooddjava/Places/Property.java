/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddjava.Places;

import ooddjava.People.Owner;

/**
 *
 * @author Scott Hardy
 * Properties have an owner, the owner may be the tenant of the household too
 */
public class Property extends Places {
    
    String type;
    Owner owner;
    Thoroughfare thoroughfare;
    
    public void Property(String t, Owner o, Thoroughfare f){
        type = t;
        owner = o;
        thoroughfare = f;
        
    }
    
}
