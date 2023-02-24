/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Stefanini.aprendendojava.Curso;

/**
 *
 * @author jvtenorio
 */
public class UltimaAulaVetor {

    public static void main(String[] args) {
        String[] meses = new String[]{"janeiro", "fevereiro", "Março", "abril"};
        int[] nota = new int[10];
        nota[0] = 10;
        nota[2] = 1;
        int[][] matriz = new int[5][5];
        matriz[0][1] = 5;
        matriz[2][4] = 10;
        matriz[3][2] = 15;
        for (int[] matrizOne : matriz) {
            for (int matrizTwo : matrizOne) {
                System.out.println(matrizTwo);
            };
        };
        for (int i = 0; i < nota.length; i++) {
            System.out.println(nota[i]);
        };
        for (String mes : meses) {
            System.out.println(mes);
        };

    }
}
