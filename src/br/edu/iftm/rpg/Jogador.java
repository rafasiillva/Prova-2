package br.edu.iftm.rpg;

public class Jogador {
    // Atributos da classe
    private String nome;
    private int dano;
    private int vida;
    private String nacionalidade;

    // Metodos Constutores
    public Jogador(int vida, String nome, int dano, String nacionalidade) {
        this.vida = 100;
        this.nome = nome;
        this.dano = dano;
        this.nacionalidade = nacionalidade;
    }

    // Metodos especificos da classe
    public void apresentacao(){
        System.out.println(" ------------- INFORMAÇÕES DO PERSONAGEM -------------");
        System.out.println("Nome: " + getNome() );
        System.out.println("Pontos de vida: " + getVida());
        System.out.println("Nacionalidade: " + getNacionalidade());
      }
    
    public void atacar(Inimigo inimigo) {
        // Ataca o jogador(O Jogador perde vida igual quantidade de dano do inimigo)
        System.out.println("O " + getNome() + " atacou o " + inimigo.getNome() + " e causou " + getDano()
                + " de dano!");
    
    }
    
    public void perderVida(Inimigo inimigo) {
        //irá diminuir o total de vida com base no pontos passado por parâmetro. 
        //Se após a subtração o valor for igual ou menor a 0, deverá informar que o jogador morreu
        if  (dano >= vida){
            System.out.println("O "+ getNome() + " derrotou o " + inimigo.getNome() );
        } else { 
            System.out.printf(" Apos o ataque de " + getNome() + ". Restou para "+ inimigo.getNome() + " " + ( inimigo.getVida() - getDano()) + " pontos de vida!" );        
        }
    }


    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
  
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

}

