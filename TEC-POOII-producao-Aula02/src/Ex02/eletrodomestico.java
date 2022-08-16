/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

/**
 *
 * @author 2201338
 */
public class eletrodomestico {
    
    String nome;
    float potencia;
    float tempo;
    
    eletrodomestico(){
        
    }

    public eletrodomestico(String nome, float potencia, float tempo) {
        this.nome = nome;
        this.potencia = potencia;
        this.tempo = tempo;
    }
    
    float wattsDia(){
        return potencia * tempo;
    }
    
    
    
    
    
}
