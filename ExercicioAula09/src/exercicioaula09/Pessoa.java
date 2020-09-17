package exercicioaula09;

import java.util.HashSet;
import java.util.Set;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    
    
    //MÉTODOS 
    public void fazerAniver(){
        this.setIdade(getIdade() + 1);
        System.out.println("O leitor/cliente/pessoa " + this.getNome() + " está fazendo aniverssário!");
        
    }
        
    //METODOS GETTERS E SETTERS
    private String getNome(){
        return this.nome;
    }
    
    private void setNome(String n){
        this.nome = n ;
    }
    
    private int getIdade(){
        return this.idade;
    }
    
    private void setIdade(int i){
        this.idade=i;
    }
    
    private char getSexo(){
        return this.sexo;
    }
    
    private void setSexo(char s){
        this.sexo=s;
    }
}
