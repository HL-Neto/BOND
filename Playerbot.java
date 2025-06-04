
import java.util.Random;

import javax.swing.Timer;

public class Playerbot extends Playerconfig {
	private Random random;

    boolean botshoot = false, botdef = false, botrell = false;

     

	
    public Playerbot() {
		super(0, 0, 3);
		this.random = new Random();
		
	}
	
    private int decidirAcaoInteligente() {
    	
    	if(vida < 2 && shild < 3) {
    		return 1;
    	}
    	
    	if (ammo == 0) {
    		return 2;
    	}
    	
    	if(alvo.shild == 0 && alvo.vida == 2) {
    		return 0;
    	}
    	
    	int situacao = random.nextInt(10);
    	switch(situacao) {
    	case 0,1,2,3,4,5 -> {return 0;}
    	case 6,7 -> {return 1;}
    	case 8,9 -> {return 2;}
    	}
		return situacao;
    }
	public void acaobot() {
        
        int acao = decidirAcaoInteligente();

        // precisa disso pra zerar os estados anteriores
        botshoot = false; 
        botdef = false; 
        botrell = false;

        

        if (actCD) return;
        
        switch (acao) {
            case 0:
                
                
                botshoot = true;
                SHT();
                System.out.println("Bot atirou");
                break;
            case 1:

                botdef = true;
                DEF();
                System.out.println("Bot defendeu");
                break;
            case 2:

                botrell = true;
                REL();
                System.out.println("Bot recarregou");
                
                break;
        
            }
        
       
        
        actCD = true;
        
        if (countdown != null && countdown.isRunning()){

                countdown.stop(); // Para um time novo caso ja tenha outro rolando
        }
        
        countdown = new Timer(5000, evt -> {
            
            actCD = false;
        });
        
        countdown.setRepeats(false); // opcional, para evitar repetições
        countdown.start();
    
    }
}
	
