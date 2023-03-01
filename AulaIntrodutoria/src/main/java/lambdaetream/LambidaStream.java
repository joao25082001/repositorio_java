/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdaetream;

import java.util.List;
import java.util.Arrays;
import java.util.SplittableRandom;
import java.util.stream.Collector;
import java.util.stream.Collectors;
/**
 *
 * @author jvtenorio
 */
public class LambidaStream {
static int gerarIdade(int min, int max){
 return new SplittableRandom().nextInt(min,max);
}
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("joao", "marcio", "maria", "pedro",
                "raquel");
        nomes.forEach((n) -> System.err.println(n));
        System.out.println("lisra de pessoas");
       List<pessoa>pessoas = nomes.stream().map((n) -> new pessoa(n,gerarIdade(15,30))).collect
        (Collectors.toList());
        System.out.println("lista maiores de idade");
        List<pessoa> pessoasMaiores= pessoas.stream().filter((p) -> p.getIdade()
        >= 18).collect(Collectors.toList());
       pessoasMaiores.forEach((p)-> System.out.println(p.getNome()+ ""+ p.getIdade
        ()));
        System.out.println("lista ordenada");
        List<pessoa> pessoasOrdenadas = pessoasMaiores.stream().sorted(p1,p2) ->
      (p1.getIdade() - p2.getIdade()).collect(Collectors.toList());
        System.out.println("soma idade");
         Integer soma = pessoasOrdenadas.stream().map(p -> p.getIdade()).reduce
        (0,(soma)-> somaIdade+=idade);
         System.out.println(total);
              }
}
