package JAVA.BOND;

import java.util.*;

public class tela {
    

    // configuração da matriz
    
    int linha = 5;
    int coluna = 3;

   

    // posiçao do player / posição inicial
    input posp = new input();
  
   
    int pospL = 4;
    int pospC = 1;
    
    // vou iniciar o player aqui e n no switch pq vai q a gente precisa dele dnovo -- a ideia do switch foi pro krl, mas a gente ainda precisa ver onde vai chamar essa função player
    player player = new player();
    
    
    
    public tela(){
        
        
        // auto explicatico, puxa a função update 
        updt();


        
        // indices
        int l;
        int c;
        
        

        System.out.print("\033[H\033[2J"); // limpam o console 
        System.out.flush();
        
        String[][] matriz = new String [linha][coluna]; // criaçãoda matriz
        

        // deixa os espaços em branco
        for ( l = 0; l < linha; l++){
            for (  c = 0; c < coluna; c++ ){

                
                matriz[l][c] = " ";
                
                
            }
        }


        // uns inimigos improvisados 
        int i = 0;
        while( i < coluna){
            matriz [0][i] = "v";
            i++;
        }  

        
        //posição da player -- é alterada com updt
        matriz[pospL][pospC] = "^";
        
        
        // adiciona as linhas laterais
        for ( l = 0; l < linha ; l++){
            System.out.print("|");
            for( c= 0;  c < coluna; c++){
                System.out.print(" "+matriz[l][c]+" ");
            }
        
            System.out.println("|");
        }
        
       

      
    }

    
    public void updt(){ // atualizar a tela etc etc
        
        if ( posp.mid == true){
            pospC = 1;
        }
        if ( posp.esq == true){
            pospC = 0;
        }
        if ( posp.dir == true){
            pospC = 2;
        }
        
        
    }

    

}
    

