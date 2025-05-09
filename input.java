package JAVA.Spacewar;

import java.util.*;

public class input {
    
    //tudo aqui e mt auto-explicativo
    
    boolean esq,dir,mid;

    Scanner scaner = new Scanner(System.in);
    
   

    public input(){
        
        
        String input = scaner.nextLine();

        mid = false;
        esq = false;
        dir = false;

      
        
        
        if (input.equals("3")) {
            dir = true;
        } 
        if (input.equals("1")) {
            esq = true; 
        }
        if (input.equals("2")) {
            mid = true;
        }


    }

   

        
    
}

