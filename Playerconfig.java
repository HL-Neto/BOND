

import javax.swing.Timer;

public class Playerconfig {
	protected Playerconfig alvo;
	
	public void setAlvo(Playerconfig alvo) {
        this.alvo = alvo;
    }
    
    boolean cd = false;

	protected int ammo;
    protected int shild;
    protected int vida;
    
    
    
    public boolean atirar = false , defender = false , municao = false, actCD = false;

    Timer countdown;

  

    public Playerconfig(int ammo, int shild, int vida){
    	this.ammo = ammo;
    	this.shild = shild;
    	this.vida = vida;
   	
       
    }

    public int REL(){

        if (ammo == 4){


            return ammo;
        }
        
        
        ammo++;
        return ammo;
    }

    public int DEF(){

        if( shild == 4){


            return shild;
        }
        shild++;
        return shild;
    }

    public int SHT(){
    	

        if( ammo <= 0 || alvo == null  ){
        	System.out.println("Sem municao");
            
            return ammo;
        }


        if (alvo.shild > 0){

            alvo.shild -- ;
            System.out.println("Acertou escudo do alvo! Escudos restantes: " + alvo.shild);
            ammo--;

            return ammo ;
        } else {

            alvo.DMG() ;
            System.out.println("Acertou o alvo! Vida restante: " + alvo.vida);
            ammo--;
        }

        
       
        return ammo ; 
        
    }
    public int DMG() {
    	vida--;
    	return vida;
    
    }
}
