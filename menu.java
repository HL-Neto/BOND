package JAVA.Spacewar;

import java.util.Scanner;

public class menu {
    
    Scanner scaaner = new Scanner(System.in);
    
    public menu(){

         


        System.out.println("\n== < \033[1mSPACE WAR\033[0m > ==");   // titulo - // Código ANSI para negrito, tudo que tiver dentro deles fica em negrito

        System.out.println("\n\n start");
        System.out.println("\n\n score");
        System.out.println("\n\n exit");

        String escolha = scaaner.nextLine();
        

        if (escolha.equals("start")) {

                play();
            
            } 
        
    }

    public void play(){
            
        System.out.print("nome:");
        
        String input = scaaner.nextLine(); // agente tem q arrumar essa variavel de nome
            
            if (input.length() < 4){
                

                System.out.println("\nplay");   
                System.out.println("voltar");
                String inpuut = scaaner.nextLine();
                System.out.println("carregando...");
                // da dando erro aqui, ta precisando de 2 inputs pra poder seguir com o jogo

                    if (inpuut.equals("play")){
                        
                        

                        boolean t = true;

                        while ( t = true){
                        
                            new tela();
                        
                        }
                    }
                        
                    if (inpuut.equals("menu")){
                        new menu();
                        // finaliza esse menu e vai pro anterior
                    };
                
            
                

            } else {
                
                System.out.print("o nome deve ter ate 3 characters");
            
            }
            
               
    }
}

