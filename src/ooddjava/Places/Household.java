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
    
    public Household( String nm, String typ, Owner o, Tenants ten, 
                           int bd, int bt, String b, Property p){
        
        super(nm);
        type = typ;
        owner = o;
        tenant = ten;
        bed = bd;
        bath = bt;
        band = b;
        property = p;
        
   
    }
    // no tenants in household 
    public Household( String nm, String typ, Owner o, 
                           int bd, int bt, String b, Property p){
        super(nm);
        this.type = typ;
        this.owner = o;
        this.bed = bd;
        this.bath = bt;
        this.band = b;
        this.property = p;
    }
    
    public void removeTenant(){
            this.tenant = null;
    }
    
    public void editOwner(Owner o){
        this.owner = o;
    }
    public void editTenant(Tenants ten){
        this.tenant = ten ;}
    public void editBed(int b){
        this.bed = b; }
    public void editBath(int b){
        this.bath = b; }
    public void editBand(String b){
        this.band = b; }
    public void editProperty(Property p){
        this.property = p; }
    
    @Override
   public String toString() {
        return new StringBuffer("Name: ").append(this.name)
        .append(" ID: ").append(this.id)
        .append(" Type: ").append(this.type)        
        .append(" Owner: ").append(this.owner)
        .append(" Tenants: ").append(this.tenant)
        .append(" Beds: ").append(this.bed)
        .append(" Baths: ").append(this.bath)
        .append(" Band: ").append(this.band) 
        .append(" Property: ").append(this.property).toString();

        
    } 
   
   
    
}


