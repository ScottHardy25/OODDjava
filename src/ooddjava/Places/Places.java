/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddjava.Places;

/**
 *
 * @author Scott Hardy
 * places take care of all the things that can be called a "place"
 * be it a household, street or region. They all share 1 id database via static
 * nextid and id
 */
import java.io.Serializable;
import ooddjava.Method.Confirm;


public abstract class Places implements Serializable{
    
    
    int id;
    static int nextid = 1;
    String name;
    
    public Places(String nm){
  
        this.id = setid();
        this.name = nm;
        
    }
    
    public boolean rename (int idin, String nm) {
        
        if (id == idin){
            name = nm;
            return true;
        }
        return false;
        
    }
    
    //to keep id's from clashing it will all be done via places
    public int setid(){
        int idout = nextid;
        nextid += 1;
        return idout;
    }
    
    public boolean delete(){
        
        if(Confirm.checkconfirm()){
            this.delete();
            return true;
        }
        return false;
    }
    
    @Override
   public String toString() {
        return new StringBuffer("Name: ").append(this.name)
        .append(" ID: ").append(this.id).toString();
        

    } 
    
}
