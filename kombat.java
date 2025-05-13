package JAVA.bond;

public class kombat {
    
    


    public static boolean def(){

        boolean shild =  true;

        return shild; 
    
    }

    public static boolean sht(boolean shild, int ammo){
        
        
        if (!shild){
            
            ammo --; 
            
            boolean vida =  false;
            
            System.out.println("xGAME OVERx");

            return vida;
        
        } else {

            
            System.out.println("TIRO BLOQUEADO");

            return true;

        }
    
    }

    public static int  rel(int ammo ){ // tem q colocar aqui a variavel, se nao ela vai ser resetada toda vez q for chamada//

        int ammoMax = 4; //jhin//
        

        if (ammo < ammoMax){
            ammo++;

            return ammo;
        } else {

            System.out.println("MAX MUNIÇÃO");
            
            return ammo;
        
        }

        
    }




}
