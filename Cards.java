import java.util.Random;

public class Cards {

    
    private Random random = new Random();
    
    
    public String primeiraMao;
    public String segundaMao;

    public boolean heal = false,extraShild = false,imunidade = false,extraAmmo = false,curseAmmo = false,doubleDMG = false;
    
    
    public void CardsSorteio() {
        

        String[] cards = {"Hearts" , "Spades", "Clubs", "Diamond" } ;

        this.primeiraMao = cards[random.nextInt(2)];
        this.segundaMao = cards[random.nextInt(2)+2];

        CardsEffect();
        
    }
    
    public void CardsEffect(){
        
        switch (primeiraMao) {
            case "Hearts":
                
                this.heal = true;
                
                heal();
            break;
        
            case "Spades":
               ;

                if(random.nextBoolean()){
                    
                    extraShild = true;
                    extraShild();
                } else {

                    imunidade = true;
                    imunidade();
                }

            break;
        
        }
        switch (segundaMao){
            
            case "Clubs" :
                if(random.nextBoolean()){
                    
                    extraAmmo = true;
                    extraAmmo();
                } else {

                    curseAmmo = true;
                    curseAmmo();
                }
            break;
            
            case  "Diamond":

                   doubleDMG = true;
                   doubleDMG();
            
            break;
        }   
    }
    // Hearts //
    public void heal(){
        
        
    }


    // spades//
    public void extraShild() {
       
    
    }

    public void imunidade(){
       
    
    }

    // diamond //

    public void doubleDMG(){
       
    
    }


    // clubs //

    public void extraAmmo(){
      
        
    }

    public void curseAmmo(){
        

    }
    


    
}
