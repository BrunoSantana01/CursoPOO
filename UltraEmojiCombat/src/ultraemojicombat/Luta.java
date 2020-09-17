/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author brusa
 */
public class Luta {

    //ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rouds;
    private boolean aprovada;

    // METODOS PUBLICOS
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiante = l1;
            this.desafiado = l2;
        } else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }

    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("=====================RESULTADO DA LUTA=====================");
            System.out.println("###DESAFIADO###");
            this.desafiado.apresentar();
            System.out.println("###DESAFIANTE###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0,1,2
            switch (vencedor) {
                case 0: // Empate
                    System.out.println("EMPATOU!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                    
                case 1: //Desafiado vence
                    System.out.println("Vitória do "+  this.desafiado.getNome()+ "!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2://Desafiante vendeFF
                    System.out.println("Vitória do " +this.desafiante.getNome()+"!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer.");
        }
        System.out.println("==========================================");
    }

    // METODOS ESPECIAIS
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRouds() {
        return rouds;
    }

    public void setRouds(int rouds) {
        this.rouds = rouds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
