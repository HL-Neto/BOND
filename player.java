package JAVA.bond;

import java.util.Scanner;

public class player {
	   
    // vamo tentar incrementar isso no jogo

   public static String Nome (){

     // uma inserção mais responsavel do nome //
     
     String pNome = "";
     int maxName =  3;
     boolean val =  false;
        
     while (!val) {
          
          Scanner teclado = new Scanner(System.in);
        
          System.out.print("\n NOME :\n");
        
          pNome = teclado.nextLine();

               if (pNome.length() > maxName || pNome.trim().isEmpty()) {
                    
                    System.out.println("NOME INVALIDO DIGITE NOVAMENTE");
               
               }else{

                    System.out.print ("NOME VÁLIDO");
                    val = true;
               }
     
          }
          
          return pNome;
     }

   
   public void score ( int pScore){

        // quanto menor o turno q o inimigo morrer mais alto na tabela ele vai ficar//
        // sendo no minimo 3 turnos, tendo em vista q cada um dos dois vai ter 3 vidas //

   }
}
