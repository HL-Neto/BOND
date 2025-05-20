package JAVA.bond;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tela extends JFrame{
    
    int width = 1024;
    int height = 768;

    JPanel menuPainel = new JPanel();
    
    

    
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

        JButton playButton = new JButton("JOGAR");  //substituir por imagem//
        JButton scoreButton = new JButton("SCORE");
        JButton exitButton = new JButton("SAIR");


        // retira as configurações default + coloca um background vermelho 
        
        playButton.setContentAreaFilled(false);
        playButton.setOpaque(true);
        playButton.setFocusPainted(false); 
        playButton.setBorderPainted(false);  
        playButton.setBackground(Color.RED);
        
       
        scoreButton.setContentAreaFilled(false);
        scoreButton.setOpaque(true);
        scoreButton.setFocusPainted(false);
        scoreButton.setBorderPainted(false);
        scoreButton.setBackground(Color.RED);

        
        exitButton.setContentAreaFilled(false);
        exitButton.setOpaque(true);
        exitButton.setFocusPainted(false);
        exitButton.setBorderPainted(false);
        exitButton.setBackground(Color.RED);
        
        // hover //
        
        //--- botao play
        playButton.addMouseListener(new MouseAdapter() {
            
            
            @Override

            public void mouseEntered(MouseEvent e){
                playButton.setBackground(Color.YELLOW);
            }

            @Override
            
            public void mouseExited(MouseEvent e){
                playButton.setBackground(Color.RED);
            }

            @Override

            public void mousePressed(MouseEvent e){
                playButton.setBackground(Color.GRAY);
            }

            @Override

             public void mouseReleased(MouseEvent e) {
                
                Point mousePos = playButton.getMousePosition();
                if (mousePos != null && playButton.contains(mousePos)) {
                    playButton.setBackground(Color.YELLOW);
                } else {
                    playButton.setBackground(Color.RED);
                }
            }

        });

        //--- botao score
        
        scoreButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                scoreButton.setBackground(Color.YELLOW);
            }

            @Override
            public void mouseExited(MouseEvent e){
                scoreButton.setBackground(Color.RED);
            }

            @Override
            public void mousePressed(MouseEvent e){
                scoreButton.setBackground(Color.GRAY);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                Point mousePos = scoreButton.getMousePosition();
                if (mousePos != null && scoreButton.contains(mousePos)) {
                    scoreButton.setBackground(Color.YELLOW);
                } else {
                    scoreButton.setBackground(Color.RED);
                }
            }
        });

        //--- botao exit

        exitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                exitButton.setBackground(Color.YELLOW);
            }

            @Override
            public void mouseExited(MouseEvent e){
                exitButton.setBackground(Color.RED);
            }

            @Override
            public void mousePressed(MouseEvent e){
                exitButton.setBackground(Color.GRAY);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                Point mousePos = exitButton.getMousePosition();
                if (mousePos != null && exitButton.contains(mousePos)) {
                    exitButton.setBackground(Color.YELLOW);
                } else {
                    exitButton.setBackground(Color.RED);
                }
            }
        });


        // funcionalidade do menu //

        playButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
            
                fase();
            
            }
        
        });

        
        // adicionando dentro do painel //

        menuPainel.add(playButton);
        menuPainel.add(scoreButton);
        menuPainel.add(exitButton);

    }


    public void fase(){

    
        getContentPane().removeAll(); // Remove o menu
        
        JPanel fasePainel = new JPanel();
        
        fasePainel.setBackground(Color.BLACK); 
        fasePainel.setLayout(null); 

        add(fasePainel);
        
        revalidate(); // atualiza o layout
        repaint();

    }
    
}

