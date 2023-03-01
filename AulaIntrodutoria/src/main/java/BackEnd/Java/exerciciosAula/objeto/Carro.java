/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.Java.exerciciosAula.objeto;

/**
 *
 * @author jvtenorio
 */
public class Carro {

    private String marca;
    private String modelo;
    public String chassi;;
    public int placa;
    public int roda;
    public int bancos;
    private int velocidade;
    
    public Carro(){
        System.out.println("construindo carro");
    };
    public Carro(String marca){
        this.marca = marca;
    };
    
    
    
    public String acelerar(){
     return velocidade + "km por hora";
    };

    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }
   
    public void setMarca(String marca) {
        this.marca = marca;
    };
    public String getModelo(){
     return this.modelo = modelo;
    };
    public void setModelo(String modelo){
     this.modelo = modelo;
    };
    
}
