/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author 2201338
 */
public class Horario {
    
    int hora;
    int minuto;
    int segundo;

    public Horario() {
    }

    public Horario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    void exibir(){
        System.out.println(hora+":"+minuto+":"+segundo);
    }
    
    void horaEmSegundos(){        
        System.out.println("Segundos: "+hora*3600);
    }
    

}
