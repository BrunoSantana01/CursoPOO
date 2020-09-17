package exercicioaula09;

public class ExercicioAula09 {

    public static void main(String[] args) {
        Livro l[] = new Livro[12];
        
        l[0] = new Livro("A História do Mundo", "Emma Marriot",183,12,"Bruno");
        l[0].detalhes();
        l[0].abrir();
        l[0].fechar();
        l[0].fechar();
    }
    
}
