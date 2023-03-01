/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package breakcontinue;

/**
 *
 * @author jvtenorio
 */
public class breakContinue {

    public static void main(String[] args) {
        String[] carros = new String[]{"ferrari", "bmw", "fusca", "mercedes",
            "gol", "BMW"};
        for (int i = 0; i < carros.length; i++) {
            if (carros[i] == "Bmw i212") {
                System.out.println(carros[i]);
                //continue;
                break;
            }
            System.out.println(carros[i]);
        }

    }
}
