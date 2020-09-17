package exerciciobancoguanabara;

public class ContaBanco {

    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //METODOS
    public void estadoAtual(){
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
   
    public void abrirConta(String tp) {
        this.setTipo(tp);
        this.setStatus(true);
        if (tp == "CC") {
            setSaldo(50);
            System.out.println("Conta aberta com sucesso.");
        } else if ("CP".equals(tp)) {
            setSaldo(150);
            System.out.println("Conta aberta com sucesso.");
        } else {
            System.out.println("Tipo invalido. Digite Novamente.");
        }

    }

    public void fecharConta() {
        if (getStatus() == false) {
            System.out.println("Conta inativa");
        } else if (this.getSaldo() > 0) {
            System.out.println("A conta deve estar vazia para ser fechada.");
        } else if (this.getSaldo() < 0) {
            System.out.println("A conta possui débitos, eles devem ser quitados para que a conta seja fechada.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada.");
            
        }
    }

    public void depositar(float v) {
        if (this.getStatus() == true) { // getStatus() já seria considerado verdadeiro.
            //this.saldo = this.saldo + v;
            this.setSaldo(getSaldo() + v);
            System.out.println("Deposito de R$" + v + " realizado na conta de " + this.getDono());
        } else {
            System.out.println("Esta conta está inativa.");
        }

    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque de R$" + v + " realizado.");
            } else {
                System.out.println("Saldo Insuficiente.");
            }
        } else {
            System.out.println("Esta conta está inativa.");
        }
    }

    public void pagarMensal() {
        float v = 0;

        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }

        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso.");
        }else{
            System.out.println("(\"Esta conta está inativa.");
        }
    }

    //CONSTRUTOR
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    //SETTERS E GETTERS
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int nC) {
        this.numConta = nC;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tp) {
        this.tipo = tp;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dn) {
        this.dono = dn;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float sd) {
        this.saldo = sd;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }
}
