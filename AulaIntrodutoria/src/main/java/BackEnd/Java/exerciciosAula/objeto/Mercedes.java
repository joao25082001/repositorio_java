/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.Java.exerciciosAula.objeto;
        

/**
 *
 * @author jvtenorio
 */
public class Mercedes extends Carro{
    
    public Mercedes(){
     this.setMarca("mercedes");
    };

    @Override
    public String acelerar() {
        return "mercedes pode fazer de 0" + this.getVelocidade() +
         "em 6segundos";// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
   

  
}
