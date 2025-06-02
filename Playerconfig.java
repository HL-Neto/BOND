
public class Playerconfig {
    
    boolean cd = false;

	protected int ammo;
    protected int shild;
    protected int vida;
    

    
    public boolean atirar = false , defender = false , municao = false;

    
  

    public Playerconfig(int ammo, int shild, int vida){
    	this.ammo = ammo;
    	this.shild = shild;
    	this.vida = vida;
   	
       
    }

    public int REL(){

        if (ammo == 4){

            System.out.println("balas carregadas ao maximo");

            return ammo;
        }
        
        System.out.println("balas atuais = "+ ammo);
        
        ammo++;
        return ammo;
    }

    public int DEF(){

        if( shild == 4){

            System.out.println("escudos carregados ao maximo");

            return shild;
        }
        shild++;
        return shild;
    }

    public int SHT(){

        if( ammo <= 0 ){

            System.out.println("sem balas chefe  "+ ammo);
            
            return ammo;
        }


        if (shild > 0){

            shild -- ;
            ammo--;

            return ammo ;
        } else {

            DMG() ;
        }

        System.out.println("balas atuais = "+ ammo);
        
        ammo--;
        return ammo ; 
        
    }
    public int DMG() {
    	vida--;
    	return vida;
    
    }
}
