/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author Davi
 */
public class pessoa {
    
    private String nome;
    private String endereco;
    private String telefone;

    public pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "pessoa{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + '}';
    }
    
    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Endereço: "+endereco);
        System.out.println("Telefone: "+telefone);        
    }
    
    public static void main(String[] args) {
        
        pessoa p1 = new pessoa("Davi","Rua 22 n47","(62)98765-0013");
        System.out.println(p1);
        System.out.println("==============");
        p1.imprimir();
    }
    
    
    
}
