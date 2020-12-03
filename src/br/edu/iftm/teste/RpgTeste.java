package br.edu.iftm.teste;

import br.edu.iftm.rpg.Inimigo;
import br.edu.iftm.rpg.Jogador;
import br.edu.iftm.rpg.Luta;

public class RpgTeste {

 public static void  main (String[] args) throws Exception {
  
    //Jogador (1 Objeto)  
  Jogador Jack = new Jogador(100, "Jack", 60, "Brasileiro");
  
   //Inimigos (2 Objetos)
    Inimigo James = new Inimigo("James", 100, 110, "Americano");
   Inimigo Bison = new Inimigo("M. Bison", 100, 90, "Coreano");
   
   
   //Luta (1 Objeto)
   Luta luta = new Luta();
   luta.enfrentar(James, Jack);
   luta.enfrentar(Bison, Jack);

    

}
 }