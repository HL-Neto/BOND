package bond;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.KeyAdapter;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Tela extends JFrame{
    
    int width = 1024;
    int height = 683;

    
    Timer executionTimer; 
   
    Cards cartasPlayer = new Cards();
    Cards cartasBot = new Cards();
    Playerbot bot = new Playerbot();
    Player player = new Player();

    JPanel menuPainel = new JPanel() {
        Image menu_fundo = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\menu_background.png").getImage();

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

        player.setAlvo(bot);
        bot.setAlvo(player);
    }

    
    
    
    // configuração do menu inicial todas as funcionalidades + estilização //
    public void menu(){
        
       
    
        
        
        // espaçamento entre os botões //
        menuPainel.setLayout(new GridLayout(3,1,0,20));
        menuPainel.setBorder(BorderFactory.createEmptyBorder(250, 425, 255, 425));
        
        // opções + botões //

        JButton playButton = new JButton(new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\play_buttom.png"));  //substituir por imagem//
        JButton exitButton = new JButton(new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\exit_buttom.png"));


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
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
            
                System.exit(0);
            
            }
        
        });

        
        // adicionando dentro do painel //

        menuPainel.add(playButton);
        menuPainel.add(exitButton);

        
        
    }


    public void fase(){

    getContentPane().removeAll(); // Remove o menu
    
    cartasPlayer.setAlvos(new Playerconfig[] {player});
    cartasPlayer.setAlvoAtual(0);
    cartasPlayer.CardsSorteio();

    cartasBot.setAlvos(new Playerconfig[] {bot});
    cartasBot.setAlvoAtual(0);
    cartasBot.CardsSorteio();
    
   
    
    
    
    // Cria o painel com a imagem de fundo
    JPanel fasePainel = new JPanel() {
        
        Image fundo = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\fase_background.png").getImage();
        
       
        
        // player //

        Image mao_esquerda = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\mao_esquerda.png").getImage();
        Image mao_direita = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\mao_direita.png").getImage();
        Image disparo = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\disparo.png").getImage();   
        Image recarga = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\recarregar.png").getImage(); 
        Image noAmmo = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\no_ammo.png").getImage();

        Image escudo_1 = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\escudo.png").getImage();
        Image escudo_2 = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\escudo_2.png").getImage();
        Image escudo_3 = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\escudo_3.png").getImage();
       
        
        Image vidax4 = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\vida4x.png").getImage();
        Image vidax3 = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\vida3x.png").getImage();
        Image vidax2 = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\vida2x.png").getImage();
        Image vidax1 = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\vida1x.png").getImage();
        
        Image balax4 = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\bala4x.png").getImage();
        Image balax3 = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\bala3x.png").getImage();
        Image balax2 = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\bala2x.png").getImage();
        Image balax1 = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\bala1x.png").getImage();
        //bot//
       
       Image bandido = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\bandido.png").getImage();
       
       Image botescudo_1 = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\botescudo_1.png").getImage();
       Image botescudo_2 = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\botescudo_2.png").getImage();
       Image botescudo_3 = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\botescudo_3.png").getImage();
       
       Image bottiro = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\bottiro.png").getImage();
       Image botrecarga =  new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\botrecarga.png").getImage();
       Image botdano =  new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\botdano.png").getImage();
       
       // cartas //

        Image healImage = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\heal_card.png").getImage();
        Image extraAmmoImage = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\extraAmmo_card.png").getImage();
        Image doubleDMGImage = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\doubleDmg_card.png").getImage();

        // game //

        
        Image gameOver = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\game_over.png").getImage();
        Image Tutorial = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\tutorial.png").getImage();
        Image vitoria = new ImageIcon("D:\\lucas\\Facul\\java\\bondimg\\vitoria.png").getImage();

       @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

          
            g.drawImage(fundo, 0, 0, getWidth(), getHeight(), this);
            g.drawImage(mao_direita, 0, 0, getWidth(), getHeight(), this);
            g.drawImage(Tutorial, 0, 0, getWidth(), getHeight(), this);

            // player if //
            
            if (player.atirar && player.ammo > 0) {
                
               
                    g.drawImage(disparo, 0, 0, getWidth(), getHeight(), this);
                
            }
            if(player.atirar && player.ammo == 0){
                    g.drawImage(noAmmo, 0, 0, getWidth(), getHeight(), this);
                } 
            
            
            if (player. municao) {
                g.drawImage(recarga, 0, 0, getWidth(), getHeight(), this);
            } else {
                g.drawImage(mao_esquerda, 0, 0, getWidth(), getHeight(), this);
                
                if (player.ammo == 1){
                    g.drawImage(balax1, 0, 0, getWidth(), getHeight(), this);
                    
                }
                if (player.ammo == 2){
                    g.drawImage(balax2, 0, 0, getWidth(), getHeight(), this);
                    
                }
                if (player.ammo == 3){
                    g.drawImage(balax3, 0, 0, getWidth(), getHeight(), this);
                    
                }
                 if (player.ammo == 4){
                    g.drawImage(balax4, 0, 0, getWidth(), getHeight(), this);
                    
                }
                 
                 if (player.vida == 1){
                     g.drawImage(vidax1, 0, 0, getWidth(), getHeight(), this);
                     
                 }
                 if (player.vida == 2){
                     g.drawImage(vidax2, 0, 0, getWidth(), getHeight(), this);
                     
                 }
                 if (player.vida == 3){
                     g.drawImage(vidax3, 0, 0, getWidth(), getHeight(), this);
                   
                 }
                 if (player.vida == 4) {
                 	g.drawImage(vidax4,0,0, getWidth(), getHeight(), this);
                 }
                 
                
            }

            
            if (player.shild == 1){
                g.drawImage(escudo_1, 0, 0, getWidth(), getHeight(), this);
                
            }
            if (player.shild == 2){
                g.drawImage(escudo_2, 0, 0, getWidth(), getHeight(), this);
                
            }
            if (player.shild == 3){
                g.drawImage(escudo_3, 0, 0, getWidth(), getHeight(), this);
                
            }
            
            
            
            
          
          

          
            
           
           // bot //
            
            if (bot.botshoot) {
                g.drawImage(bottiro, 0, 0, getWidth(), getHeight(), this);
           
            
            } else if (bot.botrell) {
               
                
                g.drawImage(botrecarga, 0, 0, getWidth(), getHeight(), this);
              
            } else {
                g.drawImage(bandido, 0, 0, getWidth(), getHeight(), this);
            }
            
            
            if (bot.shild == 1){
                g.drawImage(botescudo_1, 0, 0, getWidth(), getHeight(), this);
              
            }
            if (bot.shild == 2){
                g.drawImage(botescudo_2, 0, 0, getWidth(), getHeight(), this);
          
            }
            if (bot.shild == 3){
                g.drawImage(botescudo_3, 0, 0, getWidth(), getHeight(), this);
                
            }
            
            // game if //

            if (player.vida == 0) {
                g.drawImage(gameOver, 0, 0, getWidth(), getHeight(), this);
               
            }
            if( bot.vida == 0) {
                g.drawImage(vitoria, 0, 0, getWidth(), getHeight(), this);
                
            }
            
            if (bot.shild == 0 && player.atirar){
                g.drawImage(botdano, 0, 0, getWidth(), getHeight(), this);
            }

            // game //

            if (cartasPlayer.extraAmmo){
                g.drawImage(extraAmmoImage, 0, 0, getWidth(), getHeight(), this);
            }
            if (cartasPlayer.initialDMG){
                g.drawImage(doubleDMGImage, 0, 0, getWidth(), getHeight(), this);
            }
            if (cartasPlayer.heal){
                g.drawImage(healImage, 0, 0, getWidth(), getHeight(), this);
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
                        
                    player.municao = false;
                    player.atirar = false;
                        
                   

                    bot.botshoot = false;
                    bot.botrell = false;

                    

                    bot.acaobot(); 
    
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




