/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.Java.exerciciosAula;

/**
 *
 * @author jvtenorio
 */
public class operadorTernario {

    public static void main(String[] args) {
        int nota = 7;
        System.out.println(nota >= 7 ? "aprovado" : "reprovado");
        boolean bloqueado = true;
        String frase;
        if (bloqueado) {
            System.out.println("bloqueado");
        } else {
            System.out.println("desbloqueado");
        };
    }
}
