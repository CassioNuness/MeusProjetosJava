package Classe.desafio;

public class Pessoa {
    
    double peso;
    String nome;
    
    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
    
    void comer(Comida comida) {
        if(comida != null) {
            this.peso += comida.peso;
        }
    }
    
    String apresentar() {
        return "Ol� eu sou o " + nome + " e tenho " + peso + "kgs.";
    }

}
