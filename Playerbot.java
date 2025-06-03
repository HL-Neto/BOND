

import java.util.Random;

import javax.swing.Timer;

public class Playerbot extends Playerconfig {
	private Random random;

    boolean botshoot = false, botdef = false, botrell = false;

     

	
    public Playerbot() {
		super(0, 0, 3);
		this.random = new Random();
		
	}
	
	public void acaobot() {
        
        int acao = random.nextInt(3);

        // precisa disso pra zerar os estados anteriores
        botshoot = false; 
        botdef = false; 
        botrell = false;

        

        if (actCD) return;
        
        switch (acao) {
            case 0:
                
                
                botshoot = true;
                this.SHT(new Player());
                
                break;
            case 1:

                botdef = true;
                this.DEF();
                
                break;
            case 2:

                botrell = true;
                this.REL();
                
                break;
        
            }
        actCD = true;
        
        if (countdown != null && countdown.isRunning()){

                countdown.stop(); // Para um time novo caso ja tenha outro rolando
        }
        
        countdown = new Timer(5000, evt -> {
            System.out.println("NOVO TURNO!!");
            actCD = false;
        });
        
        countdown.setRepeats(false); // opcional, para evitar repetições
        countdown.start();
    
    }
}
	
	
