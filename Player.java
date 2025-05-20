package JAVA.bond;

import java.util.Scanner;


public class Player {
    
    private int vida = 100, ammo = 0, shild = 0;
    private String playerNome = "pedro";


    public int REL(){

        return this.ammo++;
    }

    public int DEF(){

        return this.shild++;
    }

    public int SHT(){

        return this.vida--;
    }

    public static void main(String[] args) {
        
        Scanner scaner = new Scanner(System.in);
        Player player = new Player();

        boolean t = false;

        while (t == false){

            System.out.println("1 - ATIRAR ; 2 - RECARREGAR ; 3 - DEFENDER");
            System.out.println(player.vida);
             System.out.println(player.ammo);
              System.out.println(player.shild);
            
            int input  = scaner.nextInt();

            switch (input){
                case 1:

                    player.SHT();
                    break;

                case 2:

                    player.REL();
                    break;

                case 3:

                    player.DEF();
                    break;
            }
        }
    }
}
