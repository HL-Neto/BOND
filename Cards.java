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
        // Resetar flags antes de aplicar novo efeito
     

        CardsEffect();
    }

    public void CardsEffect() {
        switch (deck) {
            case "Hearts":
                heal = true;
                heal();
                break;
            case "Spades":
                extraShild = true;
                extraShild();
                break;
            case "Clubs":
                extraAmmo = true;
                extraAmmo();
                break;
            case "Diamonds":
                initialDMG = true;
                initialDMG();
                break;
        }
    }

    public void heal() {
        if (alvos == null) return; // se n tiver isso da um erro absurdo
        
        Playerconfig alvo = alvos[alvoAtual];
        alvo.vida = Math.min(alvo.vida + 1, 4); // Limita a vida a 3
       
    }

    public void extraShild() {
        if (alvos == null) return;

        Playerconfig alvo = alvos[alvoAtual];
        alvo.shild = Math.min(alvo.shild + 1, 3); // Limita o escudo a 3
        
    }

    public void extraAmmo() {
        if (alvos == null) return;

        Playerconfig alvo = alvos[alvoAtual];
        alvo.ammo = Math.min(alvo.ammo + 2, 4); // Limita a munição a 4
        
        
    
    }

    public void initialDMG() {
       if (alvos == null) return;
       
        Playerconfig alvo = alvos[alvoAtual];
        alvo.ammo = Math.min(alvo.ammo + 1, 4); // Limita a munição a 4
        
        alvo.SHT(); // Aplica o tiro
        
    }
}
