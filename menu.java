package bond;

import java.util.Scanner;


public class menu {

    Scanner scaaner = new Scanner(System.in);
    
    public menu(){

    	 System.out.println("\n== < \033[1m007\033[0m > =="); 
    	 System.out.println("\n\n 1.start");
         System.out.println("\n\n 2.score");
         System.out.println("\n\n 3.exit");
         System.out.println("\nEscolha uma das opcoes");
         int escolha = scaaner.nextInt();
        
    	switch (escolha) {
    	case 1:
    		play();
    		break;
    	case 2:
    		System.out.println("score");
    		break;
    	case 3:
    		System.out.println("sair");
    		break;
    	default:
    		System.out.println("Opcao invalida");
    	}
    	scaaner.close();
    }
  


      
        

        



    
    public void play(){
    	Scanner teclado = new Scanner(System.in);
        System.out.print("nome(maximo 3 caracteres):\n");
        
        String nome = teclado.nextLine();

            
            if (nome.length() < 4){
                

                System.out.println("\n1.play");   
                System.out.println("2.voltar");
                int escolha2 = scaaner.nextInt();
            	switch (escolha2) {
            	case 1:
            		new tela();
            		break;
            	case 2:
            		new menu();
            		break;
            	default:
            		System.out.println("Opcao invalida");
            	}
            
                

            } else {
                
                System.out.print("o nome deve ter ate 3 characters");
            
            }
            
               
    }
}
