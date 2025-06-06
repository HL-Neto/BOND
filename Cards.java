package bond;
import java.util.Random;

public class Cards {
    private Playerconfig[] alvos;
    private int alvoAtual;
    private Random random = new Random();
    public String deck;
    public boolean heal = false, extraShild = false, extraAmmo = false, initialDMG = false;
    
    public void setAlvos(Playerconfig[] alvos) {
        this.alvos = alvos;
    }

    public void setAlvoAtual(int alvoAtual) {
        this.alvoAtual = alvoAtual;
    }

    public void CardsSorteio() {
        String[] cards = {"Hearts", "Spades", "Clubs", "Diamonds"};
        this.deck = cards[random.nextInt(cards.length)];
        
     

        CardsEffect();
    }

    public void CardsEffect() {
        switch (deck) {
            case "Hearts":
                heal = true;
                heal();
                System.out.println("Carta vida");
                break;
                
           
            case "Clubs":
                extraAmmo = true;
                extraAmmo();
                System.out.println("Carta municao");
                break;
            case "Diamonds":
                initialDMG = true;
                initialDMG();
                System.out.println("Carta dano");
                break;
        }
    }

    public void heal() {
        
        
        Playerconfig alvo = alvos[alvoAtual];
        alvo.vida = Math.min(alvo.vida + 1, 4); // Limita a vida a 3
       
    }



    public void extraAmmo() {
        

        Playerconfig alvo = alvos[alvoAtual];
        alvo.ammo = Math.min(alvo.ammo + 2, 4); // Limita a munição a 4
        
        
    
    }

    public void initialDMG() {
      
       
        Playerconfig alvo = alvos[alvoAtual];
        alvo.ammo = Math.min(alvo.ammo + 1, 4); // Limita a munição a 4
        
        alvo.SHT(); // Aplica o tiro
        
    }
}