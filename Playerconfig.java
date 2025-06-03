import javax.swing.Timer;

public class Playerconfig {
    
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

    public int SHT(Playerconfig alvo){

        if( ammo <= 0 ){

            
            return ammo;
        }


        if (shild > 0){

            alvo.shild -- ;
            ammo--;

            return ammo ;
        } else {

            alvo.DMG() ;
        }

        
        ammo--;
        return ammo ; 
        
    }
    public int DMG() {
    	vida--;
    	return vida;
    
    }
}

