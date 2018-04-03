/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddjava.Method;

/**
 *
 * @author Scott Hardy
 */
import java.io.*;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import ooddjava.User.User;
public class Validator {
    
    //these are the current uk bands
    public static boolean checkband(String cb){
        cb = cb.toLowerCase();
        
        if (  "b".equals(cb)|| "c".equals(cb)|| "d".equals(cb)|| 
                "e".equals(cb)|| "f".equals(cb)|| "g".equals(cb)|| 
                "h".equals(cb)|| "ar".equals(cb) ||"a".equals(cb)){
            return true;
        }
        return false;
        
    }
    
    
    //will be used to keep all the same spellings of the diffrent property types
    public static boolean checkproptype(String pt){
        pt = pt.toLowerCase();
        if ("flat".equals(pt)||"detached".equals(pt)||"semiDetached".equals(pt)||
                "terraced".equals(pt)||"endofterraced".equals(pt)||
                "cottage".equals(pt)||"bungalows".equals(pt) || "room".equals(pt)
                ||"blockofflats".equals(pt)){
            return true;  
        }
        return false;
    }
    
    public static boolean checkpassword(String p){
        p = lowercase(p);
        if ( (p.length() >= 9) && (p.length() <= 30) ){
            return true;
        }
        return false;
    }
    
    
    public static String lowercase(String s){
        return toLowerCase(s); 
    }
   
    /*
    public static User connectuser(){
            User foo = ;
            return foo;
    }
    */

}    