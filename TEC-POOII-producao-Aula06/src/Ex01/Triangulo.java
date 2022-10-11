/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

import javax.swing.JOptionPane;

/**
 *
 * @author Davi
 */
public class Triangulo {
    
    int ladoA,ladoB,ladoC;

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    boolean validarExistencia() {
        if ((ladoA + ladoB > ladoC) && (ladoB + ladoC > ladoA) && (ladoA + ladoC > ladoB)) {
            return true;
        }else{
            return false;
        }
    }
    
    void analiseTriangulo(){
        if(validarExistencia()){
            if((ladoA == ladoB)&&(ladoA == ladoC)){
                //System.out.println("Triângulo equilátero!");
                JOptionPane.showMessageDialog(null,"Triângulo equilátero!");
            }else{
                if((ladoA == ladoB)||(ladoA == ladoC)||(ladoB == ladoC)){
                    //System.out.println("Triângulo isósceles!");
                    JOptionPane.showMessageDialog(null,"Triângulo isósceles!");
                }else{
                    //System.out.println("Triângulo escaleno!");
                    JOptionPane.showMessageDialog(null,"Triângulo escaleno!");
                }
            }
        }else{
            //System.out.println("Triângulo não existe!");
            JOptionPane.showMessageDialog(null,"Triângulo não existe!");
        }
    }    
    
}
