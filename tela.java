package JAVA.bond;

import java.util.*;

public class tela {
    

    // configuração e criação da matriz
    
    int linha = 5;
    int coluna = 3;

    int c;
    int l;

    String[][] matriz = new String [linha][coluna]; // criaçãoda matriz

   
    
    public tela(){
        
        boolean vida = true;

        while (vida) {
            fieldC();
            refresh();
            playerT();
            fieldL();
            updt();
        }
        
      
    }

    
    public void updt(){ // atualiza os comandos do plyerC
        
        input playerComand = new input();

        if ( playerComand.sht == true){
            
            shtAni();
           
        }
        if ( playerComand.def == true){
            
            defAni();
           
        }
        if ( playerComand.rel == true){
            
            relAni();
           
        }
        
        
    }


    // criação da tela //

    public void fieldC(){

        
        for ( l = 0; l < linha; l++){
            for (  c = 0; c < coluna; c++ ){

                
                matriz[l][c] = " ";
                
                
            }
        }

    }

    public void fieldL(){

        for ( l = 0; l < linha ; l++){
            System.out.print("|");
            for( c= 0;  c < coluna; c++){
                System.out.print(" "+matriz[l][c]+" ");
            }
        
            System.out.println("|");
        }


    }

    public void playerT(){

        matriz[0][1] = "v";
        matriz[4][1] = "^";
    }

    public void refresh(){

        System.out.print("\033[H\033[2J"); // limpam o console 
        System.out.flush();
    
    }

    // fim da criação de tela // 



    
    
    // animção das ações //

    public void shtAni(){

       
        matriz[3][1] = "*";
        fieldL();
        updtTimer();
    
    } 
    public void defAni(){

        matriz[3][1] = "_";
        fieldL();
        updtTimer();

    }   
    public void relAni(){

        matriz[3][1] = "@";
        fieldL();
        updtTimer();

    }

    // fim das animações // 


    // timer //
    void updtTimer(){

        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
