/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.Java.exerciciosAula.objeto.executor;

import BackEnd.Java.exerciciosAula.objeto.Bmw;
import BackEnd.Java.exerciciosAula.objeto.Carro;
import BackEnd.Java.exerciciosAula.objeto.Mercedes;

/**
 *
 * @author jvtenorio
 */
public class Executor {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        Mercedes mercedes = new Mercedes();
        System.out.println(mercedes.acelerar());
        Carro carro1 = new Carro();
        carro1.setMarca("bmw");
        carro1.setModelo("213a");
        carro1.chassi = "12344";
        carro1.placa = 1123;
        carro1.bancos = 2;
        carro1.roda = 4;
        carro1.setVelocidade(130);
        
        
        Carro carro2 = new Carro("mercedes");
        System.out.println(soma(10,4));
        System.out.println(soma(10,10,10));
        System.out.println(carro2.getMarca());
        System.out.println(carro1.getMarca()+ "\n" + carro1.getModelo());
        System.out.println(carro1.acelerar());
    };
    public static int soma(int a, int b, int c){
     return a + b + c;
    };
    public static int soma(int a, int b){
     return a + b;
    };
    
}
