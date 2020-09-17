package aula12;

public class Aula12 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        
        
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        Ave a = new Ave();
        
        Canguru k = new Canguru();
        
        
        k.locomover();
        a.locomover();
    }
    
}
