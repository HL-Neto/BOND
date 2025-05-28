package bond;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tela extends JFrame{
    
    int width = 1024;
    int height = 683;

    Timer executionTimer; 
   

    Player player = new Player();

    JPanel menuPainel = new JPanel() {
        Image menu_fundo = new ImageIcon("C:\\Users\\Humberto Luna\\Documents\\bond\\image\\menu_background.png").getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(menu_fundo, 0, 0, getWidth(), getHeight(), this);
            }
    };    
  
    

    
    public Tela(){
        
        setTitle("007");
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        menu();
        add(menuPainel);

        setVisible(true);
    }

    
    
    
    // configuração do menu inicial todas as funcionalidades + estilização //
    public void menu(){
        
       
    
        
        
        // espaçamento entre os botões //
        menuPainel.setLayout(new GridLayout(3,1,0,20));
        menuPainel.setBorder(BorderFactory.createEmptyBorder(250, 425, 255, 425));
        
        // opções + botões //

        JButton playButton = new JButton(new ImageIcon("C:\\Users\\Humberto Luna\\Documents\\bond\\image\\play_buttom.png"));  //substituir por imagem//
        JButton exitButton = new JButton(new ImageIcon("C:\\Users\\Humberto Luna\\Documents\\bond\\image\\exit_buttom.png"));


        // retira as configurações default + coloca um background vermelho 
    
        playButton.setContentAreaFilled(false);
        playButton.setOpaque(false);
        playButton.setFocusPainted(false); 
        playButton.setBorderPainted(false);  
        
        
       
        
        
        exitButton.setContentAreaFilled(false);
        exitButton.setOpaque(false);
        exitButton.setFocusPainted(false);
        exitButton.setBorderPainted(false);
     
        
        // funcionalidade do menu //

        playButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
            
                fase();
            
            }
        
        });

        
        // adicionando dentro do painel //

        menuPainel.add(playButton);
        menuPainel.add(exitButton);

        
        
    }


    public void fase(){

    getContentPane().removeAll(); // Remove o menu
    
    
    // Cria o painel com a imagem de fundo
    JPanel fasePainel = new JPanel() {
        Image fundo = new ImageIcon("C:\\Users\\Humberto Luna\\Documents\\bond\\image\\fase_background.png").getImage();
        Image bandido = new ImageIcon("C:\\Users\\Humberto Luna\\Documents\\bond\\image\\bandido.png").getImage();
        Image mao_direita = new ImageIcon("C:\\Users\\Humberto Luna\\Documents\\bond\\image\\mao_direita.png").getImage();
        Image disparo = new ImageIcon("C:\\Users\\Humberto Luna\\Documents\\bond\\image\\disparo.png").getImage();   
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

          
            g.drawImage(fundo, 0, 0, getWidth(), getHeight(), this);
            
            g.drawImage(bandido,0 ,0, getWidth(), getHeight(), this);
            g.drawImage(mao_direita, 0, 0, getWidth(), getHeight(), this);
            
            
            
            if (player.atirar) {
                
                g.drawImage(disparo, 0, 0, getWidth(), getHeight(), this);
                repaint();
                
            }

            

        
        
        }
    };
    

    
    
    
    
    
    fasePainel.setLayout(null); // permite posicionamento manual
    add(fasePainel);
    

    // isso aqui e pra forçar o jpanel focar no teclado //
    fasePainel.setFocusable(true);
    fasePainel.requestFocusInWindow();
    //  //


    // isso aqui e pra escutar os eventos do teclado //
    fasePainel.addKeyListener(new java.awt.event.KeyAdapter() {
    @Override
        public void keyPressed(java.awt.event.KeyEvent e) {
            player.keyPressed(e); // isso e pra puxar as variaveis no player
            

            // isso precisa estar aqui, pq toda vez q aperta W um novo timer e criado, ent esse if precisa existir para verificar //
            if (executionTimer != null && executionTimer.isRunning()){

                executionTimer.stop(); // Para o anterior, se existir
            }

            
                
            // cria o time pra cada circunstancia//
            if (player.atirar || player.defender || player.municao){

                    fasePainel.repaint();

                    // Inicia um Timer que dura 1 segundo
                    executionTimer = new Timer(1000, evt -> {
                        
                        player.atirar = false;
                        fasePainel.repaint();
                    });
                
                    executionTimer.setRepeats(false);
                    executionTimer.start();
                
                }else{
                
                    fasePainel.repaint();
                }
        }
    
    
    });    
    //  //

    revalidate(); // atualiza o layout
    repaint();

    }


}





    




