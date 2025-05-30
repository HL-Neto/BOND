// ta tudo errado -- tirei o package pq tava dando um erro no meu 



public class Cards {
private Playerconfig player;
    
    public Cards(Playerconfig player) {
        this.player = player;
    }
    
    public void extraShild() {
        player.DEF();  
    }

    public void imunidade(){
       
    }

    public void heal(){
        player.vida += 1;
    }

    public void doubleDMG(){
        player.SHT();
    }

    public void extraAmmo(){
        player.ammo += 1;
    }

    public void curseAmmo(){
        // - bala anemy
    }
    


    
}
