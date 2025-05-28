package bond;

import java.util.Scanner;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Player {
    
    public int vida = 100, ammo = 100, shild = 100;

    public boolean atirar = false , defender = false , municao = false;

    // TESTE //
     public void keyPressed(KeyEvent e) {
       
        int code = e.getKeyCode();
        
        
        if(code == KeyEvent.VK_W){
            atirar = true;

            SHT();
        }

        if(code == KeyEvent.VK_Q){
            defender = true;

            DEF();
        }

        if(code == KeyEvent.VK_E){
            municao = true;

            REL();
        }


      
        
    }

    public Player(){
       
    }
    //       //
    public int REL(){

        if (ammo = 4){

            System.out.println("balas carregadas ao maximo");

            return ammo;
        }
        return ammo++;
    }

    public int DEF(){

        if( shild = 4){

            System.out.println("escudos carregados ao maximo");

            return shild;
        }
        return shild++;
    }

    public int SHT(){

        if( ammo < 0 ){

            System.out.println("sem balas chefe  "+ ammo);
            return ammo;
        }


        if (shild > 0){

            shild -- ;

            return ammo-- ;
        } else {

            vida -- ;
        }
        return ammo-- ; 
        
    }
}
