/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdaetream;

/**
 *
 * @author jvtenorio
 */
public class pessoa {
    private String nome;
    private Integer idade;

    public pessoa(String nome,Integer idade){
    this.idade = idade;
    this.nome = nome;
    
    }
    public pessoa(){
    
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
