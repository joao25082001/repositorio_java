/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientaçãoObjetos;

/**
 *
 * @author jvtenorio
 */
public class BMW extends Carro implements Esportivo{
    public BMW(){
    super();
    }

    @Override
    public double calcularTaxaAceleração(double velocidadeFinal, double tempoFinal) {
        return velocidadeFinal / tempoFinal; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void acionarTurbo(){
        System.out.println("modo turbo");
    }
    

}
