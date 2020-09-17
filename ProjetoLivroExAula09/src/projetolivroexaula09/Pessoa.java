package projetolivroexaula09;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    
    //MÉTODOS 
    public void fazerAniver(){
        this.setIdade(getIdade() + 1);
        System.out.println("O leitor/cliente/pessoa " + this.getNome() + " está fazendo aniverssário!");
        
    }
    
    //Construtor
    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
        
    //METODOS GETTERS E SETTERS
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String n){
        this.nome = n ;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int i){
        this.idade=i;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public void setSexo(String s){
        this.sexo=s;
    }
}
