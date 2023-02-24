/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Stefanini.aprendendojava.Curso;

/**
 *
 * @author jvtenorio
 */
public class AulaVetor {

    public static void main(String[] args) {
        int[] nota = new int[10];

        nota[2] = 5;
        nota[1] = 2;
        nota[3] = 4;
        nota[4] = 6;
        nota[5] = 8;
        nota[6] = 9;
        nota[7] = 1;
        nota[8] = 2;
        nota[9] = 4;
        nota[0] = 10;
        String[] carros = new String[]{"ferrari", "bmw", "fusca"};
        System.out.println("numero de carros na garagem é:" + carros.length);
        for (String carro : carros) {
            System.out.println(carro);
        };
        for (int i = 0; i < nota.length; i++) {
            System.out.println(nota[i]);
        };
        //Exercicio matrizes:
        String[][] estagiario = new String[][]{{"joao", "castanho"}, {"douglas", "rosa"}, {"caio", "preto"}, {"matheus", "castanho claro"}};
        System.out.println(estagiario.length);
        for (int i = 0; i < estagiario.length; i++) {
            System.out.println("o nome do estagiario é:\n");
            System.out.println(estagiario[i][0]);
            System.out.println("e a cor do seu cabelo é:\n");
            System.out.println(estagiario[i][1]);
        };
         String[] nome = new String[]{"douglas","joao","vitor","matheus","gabriel"};
         for(String nomeReal: nome){
             System.out.println(nomeReal)
         };


    }

}
