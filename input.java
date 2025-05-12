package JAVA.bond;

import java.util.*;

public class input {
    
    //tudo aqui e mt auto-explicativo
    
    boolean sht,def,rel;

    Scanner scaner = new Scanner(System.in);

    public input(){
        
       
        
        int action =  scaner.nextInt();
        

        sht = false;
        def = false;
        rel = false;

      
        
        
        if (action == 3) {
            rel = true;
        } 
        if (action == 1) {
            sht = true; 
        }
        if (action == 2) {
            def = true;
        }


    }
    

   

        
    
}
