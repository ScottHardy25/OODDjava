/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddjava.People;
import java.io.Serializable;
import java.text.SimpleDateFormat;

/**
 *
 * @author Scott Hardy
 * Like in Places, People all share 1 id. People are the 
 */
public abstract class People implements Serializable {
    public static int nextid = 1;
    public int id;
    public String fname;
    public String lname;
    public String type;
    
    
    public People (String f, String l, String t){
        this.fname = f;
        this.lname = l;
        this.id = setid();
        this.type = t;
        
    }
    
    // updateing data
    public void Changefname (String f){ this.fname = f;}
    public void Changelname (String l){ this.lname = l;}
    public void Changetype  (String t){ this.type = t; }
    
    //getting data
    public String getname (){ return this.fname + " " + this.lname;}
    public String getlname (){ return this.lname;}
    public String getfname (){ return this.fname;}
    public String gettype (){ return this.type;}
    public int getid(){ return this.id;}
    public int getnextid(){ return nextid;}
    
    //methods
    
    public int setid(){
        int idout = nextid;
        nextid += 1;
        return idout;
    } 
  
    @Override

    public String toString() {
        return new StringBuffer(" First Name: ").append(this.fname)
        .append(" Last Name: ").append(this.lname)
        .append(" Type: ").append(this.type)
        .append(" ID: ").append(this.id).toString();

    }
  
    
    
    
    
}
