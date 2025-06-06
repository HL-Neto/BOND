
package bond;
import java.awt.event.KeyEvent;
import javax.swing.Timer;

public class Player extends Playerconfig {

    int turno = 0;

    public Player() {

        super(0, 0,3);

        
    }

  

   
    
    public void keyPressed(KeyEvent e) {

        int code = e.getKeyCode();
       

        if (actCD) {
            
            System.out.println("ESPERE UM NOVO TURNO");
            return;
        }

       
        if (code == KeyEvent.VK_W) {
            atirar = true;
            SHT();
            System.out.println("Player atirou");
        } else if (code == KeyEvent.VK_Q) {
            defender = true;
            DEF();
            System.out.println("Player defendeu");
        } else if (code == KeyEvent.VK_E) {
            municao = true;
            REL();
            System.out.println("Player recarregou");
        } else {
            return; 
        }

       
        actCD = true;

        countdown = new Timer(5000, evt -> {
            System.out.println("NOVO TURNO!!");
            actCD = false;
            turno++;
        });

        countdown.setRepeats(false);
        countdown.start();
    }
}
    