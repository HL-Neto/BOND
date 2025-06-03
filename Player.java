import java.awt.event.KeyEvent;
import javax.swing.Timer;

public class Player extends Playerconfig {

    
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
            
            this.SHT(new Playerbot());
        } else if (code == KeyEvent.VK_Q) {
            defender = true;
           
            this.DEF();
        } else if (code == KeyEvent.VK_E) {
            municao = true;
            this.REL();
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
