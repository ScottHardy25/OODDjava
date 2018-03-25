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
    public static long nextid = 0;
    public long id;
    public String fname;
    public String lname;
    public String type;
    
    
    public void people (String f, String l, String t){
        fname = f;
        lname = l;
        id = setid();
        type = t;
        
    }
    
     public long setid(){
        long idout = nextid;
        nextid += 1;
        return idout;
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
