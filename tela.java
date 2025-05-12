package JAVA.bond;

import java.util.*;

public class tela {
    
    boolean shild = true;
    boolean life = true;
    // indices 
    int l;
    int c;
    
    // configuração da matriz
    
    int linha = 5;
    int coluna = 3;

    String[][] matriz = new String [linha][coluna]; // criaçãoda matriz

    // posiçao do player / posição inicial
    
  
   
    int pospL = 4;
    int pospC = 1;
    
    // vou iniciar o player aqui e n no switch pq vai q a gente precisa dele dnovo -- a ideia do switch foi pro krl, mas a gente ainda precisa ver onde vai chamar essa função player
    
   
    player player = new player();
    
    
    
    public tela(){
        
        while (life == true) {
            
        

            field1();
            
            System.out.print("\033[H\033[2J"); // limpam o console 
            System.out.flush();
            
            // plyr
            matriz[pospL][pospC] = "^";
            // ini
            matriz[0][1] = "v";

            field2();
            
            updt();
        
        }
    
    }

    
    public void updt(){ // atualizar a tela etc etc
        
        input comands = new input();

       
       

        if ( comands.sht == true){
            
            sht();
            field2();

            try {
       
                Thread.sleep(750); // espera 3 segundos
        
            } catch (InterruptedException e) {
              
                e.printStackTrace();
            
            }
            
        }

        if ( comands.def == true){
            
            
            def();
            field2();

            try {
       
                Thread.sleep(750); // espera 3 segundos
        
            } catch (InterruptedException e) {
              
                e.printStackTrace();
            
            }
            defAni();
        }
        if ( comands.rel == true){
           
          
           
            try {
       
                Thread.sleep(750); // espera 3 segundos
        
            } catch (InterruptedException e) {
              
                e.printStackTrace();
            
            }
             
        
        }
        
        
    }
    
    
    
    
    public void field1 (){
        

        for ( l = 0; l < linha; l++){
            for (  c = 0; c < coluna; c++ ){

                
                matriz[l][c] = " ";
                
                
            }
        }
    }
    public void field2 (){

         // adiciona as linhas laterais
        for ( l = 0; l < linha ; l++){
            System.out.print("|");
            for( c= 0;  c < coluna; c++){
                System.out.print(" "+matriz[l][c]+" ");
            }
        
            System.out.println("|");
        }
        
    }

 
    // colocar dentro do state //
    public void  shtAni(){

        matriz[3][1] = "*";
    
    }
     public void  defAni(){

        matriz[3][1] = "_";
    
    }
    public void  relAni(){

        matriz[3][1] = "[]";
    
    }
    
    

    public void def(){

        boolean shild = true;

        shtAni();

    }

    public void sht(){

        shtAni();

        if (shild == false){
            life = false;
        }else{
            System.out.println("DEFESA");
        }
    
    }
    
    

}
