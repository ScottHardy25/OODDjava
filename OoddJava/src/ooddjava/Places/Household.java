/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddjava.Places;

import ooddjava.People.Owner;
import ooddjava.People.Tenants;
/**
 *
 * @author Scott Hardy
 */
public class Household extends Places {
    String type;
    Owner owner;
    Tenants tenant;
    int bed;
    int bath;
    String band;
    Property property;
    
    public Household( String typ, Owner o, Tenants ten, 
                           int bd, int bt, String b, Property p){
        
        type = typ;
        owner = o;
        tenant = ten;
        bed = bd;
        bath = bt;
        band = b;
        property = p;
        id = setid();
        
   
    }
    // no tenants in household 
    public Household( String typ, Owner o, 
                           int bd, int bt, String b, Property p){
        
        type = typ;
        owner = o;
        bed = bd;
        bath = bt;
        band = b;
        property = p;
        id = setid();
   
    }
    
    public void removeTenant(){
        if (tenant != null){
            tenant = null;
        }
        
    }
    
    public void editOwner(Owner o){
        owner = o;
    }
    public void editTenant(Tenants ten){
        tenant = ten ;}
    public void editBed(int b){
        bed = b; }
    public void editBath(int b){
        bath = b; }
    public void editBand(String b){
        band = b; }
    public void editProperty(Property p){
        property = p; }
    
    
    
}


