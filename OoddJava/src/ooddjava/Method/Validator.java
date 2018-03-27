/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddjava.Methord;

/**
 *
 * @author Scott Hardy
 */
import java.io.*;
public class Validator {
    
    //these are the current uk bands
    public boolean checkband(String cb){
        cb = cb.toLowerCase();
        
        if (  "b".equals(cb)|| "c".equals(cb)|| "d".equals(cb)|| 
                "e".equals(cb)|| "f".equals(cb)|| "g".equals(cb)|| 
                "h".equals(cb)|| "ar".equals(cb) ||"a".equals(cb)){
            return true;
        }
        return false;
        
    }
    
    
    //will be used to keep all the same spellings of the diffrent property types
    public boolean checkproptype(String pt){
        pt = pt.toLowerCase();
        if ("flat".equals(pt)||"detached".equals(pt)||"semiDetached".equals(pt)||
                "terraced".equals(pt)||"endofterraced".equals(pt)||
                "cottage".equals(pt)||"bungalows".equals(pt) || "room".equals(pt)
                ||"blockofflats".equals(pt)){
            return true;  
        }
        return false;
    }
}


     