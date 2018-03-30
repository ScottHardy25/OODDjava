/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddjava.Method;

/**
 *
 * @author User
 */
import java.util.Random;

public class Password {
    
    static final String[] PASSARRAY = {  
        "outjump","blowzed","hutzpah","kajeput","quickie","jugging","quipped",
        "quaffed","quakily","killjoy","jubhahs","hypoxic","chintzy","kickoff",
        "cozying","pyjamas","klezmer","cumquat","upchuck","machzor","jugfuls",
        "showbiz","zymotic","joypops","quippus","mazurka","jewfish","fowlpox",
        "jumbler","jobbery","cachexy","waxwork","oxidize","buxomly","maxixes",
        "cajuput","jouking","jinking","workbox","jamlike","complex","kwanzas",
        "oxazine","jackals","maximum","jumbals","muntjac","jumbles","quixote",
        "moujiks","squawks","pickaxe","zlotych","quibble","jawlike","kebbock",
        "jugsful","jauking","quaking","mahjong","commixt","wickyup","quavery"};
    static int arraylen = PASSARRAY.length;
    
   public static String genpassword(){
    Random rand = new Random();
    int f = rand.nextInt(arraylen);
    int s = rand.nextInt(arraylen);
    
    while (f == s){
        s = rand.nextInt(arraylen);
    }
    
    int  n = rand.nextInt(9); 
    
    return PASSARRAY[f] + n + PASSARRAY[s];
    
}

}
