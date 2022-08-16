/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex03;

import java.util.Scanner;

/**
 *
 * @author 2201338
 */
public class entradas {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
        System.out.println("Informe o login: ");
        String user = entrada.nextLine();
        */
        System.out.println("Informe o seu nome completo: ");
        String nome = entrada.next();
        
        System.out.println("Nome completo: "+nome);
    }
    
    
}
