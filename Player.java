import java.awt.event.KeyEvent;
import javax.swing.Timer;

public class Player extends Playerconfig {

    boolean actCD = false;
    Timer countdown;

    public Player() {
        super(0, 0, 3);
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
        } else if (code == KeyEvent.VK_Q) {
            defender = true;
            DEF();
        } else if (code == KeyEvent.VK_E) {
            municao = true;
            REL();
        } else {
            return; 
        }

       
        actCD = true;

        countdown = new Timer(5000, evt -> {
            System.out.println("NOVO TURNO!!");
            actCD = false;
        });

        countdown.setRepeats(false);
        countdown.start();
    }
}
