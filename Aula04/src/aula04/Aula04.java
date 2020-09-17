package aula04;
public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);
        c1.status();
        
        /*
        c1.setModelo("BIC"); // isso é igual a c1.modelo = "BIC";
        c1.setPonta(0.5f); // nesse caso c1.ponta=0.5f; não funciona porque ponta é private
        c1.status();
        System.out.println("Eu tenho uma caneta " + c1.getModelo()); // c1. modelo pode ser substituida por .getModelo()
        */
    }

}
