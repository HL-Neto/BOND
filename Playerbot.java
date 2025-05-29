package bond;

import java.util.Random;

public class Playerbot extends Playerconfig {
	private Random random;

	public Playerbot() {
		super(0, 0, 3);
		this.random = new Random();
		// TODO Auto-generated constructor stub
	}
	
	public void acaobot() {
        int acao = random.nextInt(3);

        switch (acao) {
            case 0:
                SHT();
                break;
            case 1:
                DEF();
                break;
            case 2:
                REL();
                break;
        }
    }
}
	
	


