
package exerciciobancoguanabara;


public class ExercicioBancoGuanabara {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(0000001);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(300);
        
        
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(0000002);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        
        p1.sacar(350);
        p1.fecharConta();
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}
