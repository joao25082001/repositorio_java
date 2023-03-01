/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientaçãoObjetos;

/**
 *
 * @author jvtenorio
 */
public class Tesla extends Carro{
    
   private boolean dirigeSozinho;
   public Tesla(){
   super();
   }
      @Override
    public double calcularTaxaAceleração(double velocidadeFinal, double tempoFinal) {
            System.out.println("sobre o tesla");
        return velocidadeFinal / tempoFinal; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    public boolean eleDirigeSozinho(){
    return dirigeSozinho;
    }

    public boolean isDirigeSozinho() {
        return dirigeSozinho;
    }

    public void setDirigeSozinho(boolean dirigeSozinho) {
        this.dirigeSozinho = dirigeSozinho;
    }
}
