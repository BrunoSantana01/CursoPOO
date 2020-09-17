package exercicioaula09;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private String leitor;

    // MÉTODOS 
    public void detalhes() {
        System.out.println("-------------Detalhes do livro-------------");
        System.out.println("O livro " + this.titulo + " foi escrito por " + this.autor + " e possui um total de " + this.totPaginas +" páginas.");

    }
    
    //MetodoConstrutor
    public Livro(String t, String aut,int tP,int pA,String lei){
        this.titulo = t;
        this.autor = aut;
        this.totPaginas = tP;
        this.pagAtual = pA;
        this.leitor = lei;
    }
    
    
    //METODOS ABSTRATOS

    @Override
    public void abrir() {
        if (!this.getAberto()){
            this.setAberto(true);
            
            System.out.println("O livro " +this.getTitulo() + " foi aberto na pagina:" + this.getPagAtual()+ "."); 
        }else{
            System.out.println("O livro " +this.getTitulo() + " já está aberto.");
        }

    }

    @Override
    public void fechar() {
        if(this.getAberto()){
            this.setAberto(false);
            System.out.println("O livro " +this.getTitulo() + "foi fechado.");          
        }else{
            System.out.println("O livro " +this.getTitulo() + " já está fechado.");
        }
    }

    @Override
    public void folhear() {
    }

    @Override
    public void avancarPag() {
        if (!this.getAberto()) {
            System.out.println("O livro está fechado. Abra-o primeiro.");
        } else {
            this.setPagAtual(this.getPagAtual() + 1);
            
        }
    }

    @Override
    public void voltarPag() {
    }

    //GETTERS E SETTERS
    private String getTitulo() {
        return this.titulo;
    }

    private void setTitulo(String t) {
        this.titulo = t;
    }

    private String getAutor() {
        return this.autor;
    }

    private void setAutor(String a) {
        this.autor = a;
    }

    private int getTotPaginas() {
        return this.totPaginas;
    }

    private void setTotPaginas(int t) {
        this.totPaginas = t;
    }

    private int getPagAtual() {
        return this.pagAtual;
    }

    private void setPagAtual(int p) {
        this.pagAtual = p;
    }

    private boolean getAberto() {
        return this.aberto;
    }

    private void setAberto(boolean a) {
        this.aberto = a;
    }

    private String getLeitor() {
        return leitor;
    }

    private void setLeitor(String l) {
        this.leitor = l;
    }
}
