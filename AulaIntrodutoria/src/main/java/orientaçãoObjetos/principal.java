/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientaçãoObjetos;

/**
 *
 * @author jvtenorio
 */
public class principal {
    public static void main(String[] args) {
        Carro ferrari = new Carro();
        Carro fusca = new Carro("fusca","antigo");
        Tesla tesla = new Tesla();
        Carro tesla2 = new Tesla();
        try{
           tesla2.setVelocidadeMaxima(-3);
        }catch(negocioException e){
            System.out.println(e);
        }
     
        ((Tesla) tesla2).setDirigeSozinho(true);
        System.out.println(((( Tesla)tesla2).isDirigeSozinho()));
        Carro[] carros = new Carro[] {fusca,tesla,tesla2};
        for(Carro carro:carros){
            if(Constantes.MARCA_FAMOSA.equals(carro.getMarca())){
                System.out.println("carro de marca famosa");
            }
         if(carro instanceof Tesla){
             System.out.println(((Tesla)carro).isDirigeSozinho());
         }
        }
       Calcular.soma(2, 3);
        tesla2.calcularTaxaAceleração(10.5, 120);
        tesla.isDirigeSozinho();
        BMW bmw = new BMW();
        System.out.println(bmw.calcularTaxaAceleração(110.3,23.1));
           
        ferrari.setMarca("ferrari") ;
        ferrari.setModelo("a20");
        ferrari.setQuilometrosPorLitro (7.20);
        ferrari.setTaxaAceleração (50);
 
        ferrari.acelerar();
        ferrari.frear();
        System.out.println(ferrari.calcularTaxaAceleração(ferrari.getVelocidadeMaxima(),
                0,10, 0));
                System.out.println(ferrari.calcularTaxaAceleração(ferrari.getVelocidadeMaxima(),
                5));
                        System.out.println(ferrari.calcularTaxaAceleração(100,5));

    }
}
