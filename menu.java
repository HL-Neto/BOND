package JAVA.BOND;

import java.util.Scanner;

public class menu {
    
    Scanner scaaner = new Scanner(System.in);
    
    public menu(){

         


        System.out.println("\n== < \033[1m007\033[0m > ==");   // titulo - // Código ANSI para negrito, tudo que tiver dentro deles fica em negrito

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
                System.out.println(" 'DIGITE ALGUMA COISA PRA INICIAR'");

                // da dando erro aqui, ta precisando de 2 inputs pra poder seguir com o jogo

                if (inpuut.equals("play")){ // se conseguir tirar o if e colocar o swhitch case 
                                

                    // switch (inpuut) , ai c colocar as opçoes como instrings, tava como switch case, mas eu tentei cooncertar um erro ent coloquei como if, mas n mudou porra nenhuma, ent se conseguir colocar de volta pra switch
                        
                        

                        boolean t = true; // loop para o jogo rodar, vamos substitur t pela vida

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

