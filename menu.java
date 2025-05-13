package JAVA.bond;

import java.util.Scanner;


public class menu {

    Scanner scaaner = new Scanner(System.in);
    
    public menu(){

    	 System.out.println("\n== < \033[1m007\033[0m > =="); 
    	 System.out.println("\n    start");
         System.out.println("\n    score");
         System.out.println("\n    exit");
         System.out.print("\n\n\n: ");
         
        String escolha = scaaner.nextLine();
        
    	switch (escolha) {
    	case "start":
    		play();
    		break;
    	case "score":
    		System.out.println("\n    <- PLACAR ->");

            System.out.println ( "\n1 - HUMBERTÃO GOSTOSÃO");
    		break;
    	case "exit":
    		System.out.println("exit");
    		break;
    	default:
    		System.out.println("Opcao invalida");
    	}
    	scaaner.close();
    }
  


      
        

        



    
    public void play(){

        System.out.println("\n play");   
		System.out.println("\n voltar");
		
		String escolha2 = scaaner.nextLine();
		
		switch (escolha2) {
		case "play":
			new tela();
			break;
		case "voltar":
			new menu();
			break;
		default:
			System.out.println("Opcao invalida");
		}
            
               
    }
}
