
package minhapraticaaula04;

public class Fone {
    public String nomeModelo;
    private String tipoFone;
    private String cor;
    private int sensibilidade;
    private float tamanhoFio;
    
    public String getNomeModelo(){
        return this.nomeModelo;
    }
    
    public void setNomeModelo(String nM){
        this.nomeModelo = nM;
    }
    
    public String getTipoFone(){
        return this.tipoFone;
    }
    
    public void setTipoFone(String tf){
        this.tipoFone = tf;
    }
    
    
    public void descModelo(){
        System.out.println("Modelo do fone: " + this.nomeModelo);
        System.out.println("Tipo do fone: " + this.tipoFone);
        System.out.println("Cor: " + this.cor);
        System.out.println("Sensibilidade(dB): " + this.sensibilidade);
        System.out.println("Comprimento do cabo: ");
    }
    
}
