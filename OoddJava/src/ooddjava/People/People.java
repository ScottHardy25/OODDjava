/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddjava.People;
import java.text.SimpleDateFormat;

/**
 *
 * @author Scott Hardy
 * Like in Places, People all share 1 id. People are the 
 */
public abstract class People {
    static long nextid = 0;
    long id;
    String fname;
    String lname;
    String type;
    
    
    public void people (String f, String l, String t){
        fname = f;
        lname = l;
        id = nextid;
        nextid += 1;
        type = t;
        
    }
    
    // updateing data
    public void Changefname (String f){ fname = f;}
    public void Changelname (String l){ lname = l;}
    public void Changetype  (String t){ type = t; }
    
    //getting data
    public String getname (){ return fname + lname;}
    public String getlname (){ return lname;}
    public String getfname (){ return fname;}
    public String gettype (){ return type;}
    public long getid(){ return id;}
    
    //methords
    
  
    
    
    
    
    
}