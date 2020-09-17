package aula05exerciciobanco;

public class Classes {

    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //METODOS
    public void abrirConta(String tp) {
        setTipo(tp);
        setStatus(true);
        if ("CC".equals(tp)) {
            setSaldo(50);
        } else if (tp.equals("CP")) {
            setSaldo(150);
        } else {
            System.out.println("Tipo invalido. Digite Novamente.");

        }

    }

    public boolean fecharConta() {
        if (getStatus() == false) {
            System.out.println("Conta inativa");
        } else if (getSaldo() > 0) {
            System.out.println("A conta deve estar vazia para ser fechada.");
        } else if (getSaldo() < 0) {
            System.out.println("A conta possui débitos, eles devem ser quitados para que a conta seja fechada.");
        } else {
            setStatus(false);
        }
    }

    public float depositar(float v) {
        if (getStatus() == true) { // getStatus() já seria considerado verdadeiro.
            setSaldo(getSaldo() + v);
        } else {
            System.out.println("Esta conta está inativa.");
        }

    }

    public float sacar(float v) {
        if (getStatus()) {
            if (getSaldo() >= v) {
                setSaldo() = saldo - v;
            } else {
                System.out.println("Saldo Insuficiente.");

            }
        }
    }

    public float pagarMensal() {
         float v;
         
        if(getTipo().equals("CC")){
            v = 12;
        }else if(getTipo.equals("CP")){
            v=20;
        }
        
        if(getStatus()){
            setSaldo(saldo - v);
        }
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
