package JAVA.bond;


public class tela {
    


    int ammo = 0;
    boolean shild = false;
    boolean vida = true;

    // configuração e criação da matriz
    
    int linha = 5;
    int coluna = 3;

    int c;
    int l;

    String[][] matriz = new String [linha][coluna]; // criaçãoda matriz

   
    
    public tela(){
        
        



        while (vida) {

            shild = false; // e pra setar aqui pq o escudo so precisa ficar ativo por um turno
            
            fieldC();
            refresh();
            playerPOS();
            fieldL();
            updt();

            
        
        } 
        
      
    }

    
    public void updt(){ // atualiza os comandos do plyerC
        
        input playerComand = new input();

        if ( playerComand.sht == true){
            
           
            shtCmd();
            
             
        }
        if ( playerComand.def == true){
            
            
            defCmd();
           
        }
        if ( playerComand.rel == true){
            
            relCmd();
           
        }
        
        
    }


    // criação da tela //

    public void fieldC(){

        
        for ( l = 0; l < linha; l++){
            for (  c = 0; c < coluna; c++ ){

                
                matriz[l][c] = " ";

                
            }
            
        }
        

    }

    public void fieldL(){

        for ( l = 0; l < linha ; l++){
            System.out.print("|");
            for( c= 0;  c < coluna; c++){
                System.out.print(" "+matriz[l][c]+" ");
            }
        
            System.out.println("|");
        }


    }

    public void playerPOS(){

        matriz[0][1] = "v";
        matriz[4][1] = "^";
    }

    public void refresh(){

        System.out.print("\033[H\033[2J"); // limpam o console 
        System.out.flush();
    
    }

    // fim da criação de tela // 



    
    
    // animção das ações //

    public void shtCmd(){
            
        if (ammo > 0){
            
            vida = kombat.sht(shild,ammo);
            matriz[3][1] = "*";
            fieldL();
            updtTimer();
        
        
        }else{
               
            System.out.println("SEM BALAS CHEFE");
            updtTimer();
        }
        
        
    } 
    public void defCmd(){

        shild = kombat.def();// puxa a função do kombat 
        matriz[3][1] = "_";
        fieldL();
        updtTimer();

    }   
    public void relCmd(){

        System.out.println( "MUNIÇÃO : " +  ammo + " + 1");
        ammo = kombat.rel(ammo);
        matriz[3][1] = "@";
        fieldL();
        updtTimer();

    }

    // fim das animações // 


    // timer //
    void updtTimer(){

        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
