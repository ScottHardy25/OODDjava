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

public abstract class Places {
    
    
    long id;
    static long nextid = 1;
    String name;
    
    public void Places( long e, String nm){
  
        id = setid();
        name = nm;
        
    }
    
    public void rename( String nm){name = nm;}
    
    //to keep id's from clashing it will all be done via places
    public long setid(){
        long idout = nextid;
        nextid += 1;
        return idout;
    }
}
