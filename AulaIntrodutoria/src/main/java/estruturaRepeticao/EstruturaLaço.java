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
public class EstruturaLaço {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        };
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("while digite um numero");
        Integer num1 = leitura.nextInt();
        while (num1 != 42) {
            System.out.println("adivinhe o numero");
            num1 = leitura.nextInt();

        };
        System.out.println("acertou");
 
          System.out.println("digite um numero");
        Integer num2 = leitura.nextInt();
        do {
          System.out.println("digite um numero");
             num2 = leitura.nextInt();
        } while (num2!=42);
        System.out.println("acertou doooo");
   
    }

}

