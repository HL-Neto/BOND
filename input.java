package JAVA.bond;

import java.util.*;

public class input {
    
    //tudo aqui e mt auto-explicativo
    
    boolean sht,def,rel;

    Scanner scaner = new Scanner(System.in);
    
   

    public input(){
        
        
        String input = scaner.nextLine();

        sht = false;
        def = false;
        rel = false;

      
        
        
        if (input.equals("3")) {
            rel = true;
        } 
        if (input.equals("1")) {
            sht = true; 
        }
        if (input.equals("2")) {
            def = true;
        }


    }

   

        
    
}
