/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientaçãoObjetos;

/**
 *
 * @author jvtenorio
 */
public  class Carro {

    private String marca;
    private String modelo;
    private int velocidadeMaxima;
    private int taxaAceleração;
    private double quilometrosPorLitro;

    public Carro() {
        System.out.println("construindo carro");
    }

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;

    }

    public String calcularTaxaAceleração(int velocidadeFinal, int tempoFinal) {
        return "" + ((velocidadeFinal - 0) / (tempoFinal - 0) * 3.6);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public int getTaxaAceleração() {
        return taxaAceleração;
    }

    public double getQuilometrosPorLitro() {
        return quilometrosPorLitro;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) throws  negocioException {
        if (velocidadeMaxima < 0) {
            throw new negocioException("valor invalido");
        }
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setTaxaAceleração(int taxaAceleração) {
        this.taxaAceleração = taxaAceleração;
    }

    public void setQuilometrosPorLitro(double quilometrosPorLitro) {
        this.quilometrosPorLitro = quilometrosPorLitro;
    }

    void acelerar() {
        System.out.println("acelerando...");
    }

    void frear() {
        System.out.println("freando...");
    }

    public double calcularTaxaAceleração(double velocidadeFinal, double tempoFinal) {
        return (velocidadeFinal - 0
                / (tempoFinal - 0) * 2.6);
    }

    ;
    double calcularTaxaAceleração(double velocidadeFinal,
            double velocidadeInicial, double tempoFinal, double tempoInicial) {
        return (velocidadeFinal - velocidadeInicial
                / (tempoFinal - tempoInicial) * 2.6);

    }
;
}
