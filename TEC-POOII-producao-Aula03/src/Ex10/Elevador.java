/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex10;

/**
 *
 * @author Davi
 */
public class Elevador {

    private int capacidade;
    private int totalAndares;
    private int qtdPessoas;
    private int andarAtual;

    public Elevador(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void subir() {
        andarAtual = andarAtual + 1;
        System.out.println("Elevador subindo.. andar atual: " + andarAtual);
    }

    public void descer() {
        andarAtual = andarAtual - 1;
        System.out.println("Elevador descendo.. andar atual: " + andarAtual);
    }

    public void entrar() {
        qtdPessoas = qtdPessoas + 1;
        System.out.println("Entrando no elevador.. QtdPessoas: " + qtdPessoas);
    }

    public void sair() {
        qtdPessoas = qtdPessoas - 1;
        System.out.println("Saindo do elevador.. QtdPessoas: " + qtdPessoas);        
    }

}
