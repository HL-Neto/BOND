

import java.util.Random;

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

       
        switch (acao) {
            case 0:
                
                
                botshoot = true;
                SHT();
                
                break;
            case 1:

                botdef = true;
                DEF();
                
                break;
            case 2:

                botrell = true;
                REL();
                
                break;
        }
    }
}
	
	
