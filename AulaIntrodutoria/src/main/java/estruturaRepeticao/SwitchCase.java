/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaRepeticao;

import java.util.Scanner;

/**
 *
 * @author jvtenorio
 */
public class SwitchCase {

/**
 *
 * @author jvtenorio
 */
    public static void main(String[] args) {
        // cenario: digite um numero
        // e faça um print de qual dia da semana
        // esse numero representa
        Scanner leitura = new Scanner(System.in);
        System.out.println("digite um numero");
        Integer numDigitado = leitura.nextInt();
        switch (numDigitado) {
            case 1:
                System.out.println("segunda");
                break;
            case 2:
                System.out.println("terça");
                break;
            case 3:
                System.out.println("quarta");
                break;
            case 4:
                System.out.println("quinta");
                break;
            case 5:
                System.out.println("sexta");
                break;

            default:
                System.out.println("numero invalido!!!");
                break;

        }
        String plano = "prata";
                switch(plano){
                case "prata": System.out.println("medio");;
         break;
                case "bronze":System.out.println("pobre");;
         break;
                case "ouro":System.out.println("alta");
         break;
                default:System.out.println("sla");
                break;
                };
              
         
    }
}


