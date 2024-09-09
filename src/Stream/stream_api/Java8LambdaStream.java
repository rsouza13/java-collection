package Stream.stream_api;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8LambdaStream {

    public static void main(String[] args) {


        List<Integer> lista= Arrays.asList(1,2,3,4,5);

        System.out.println("Percorendo a lista com Java 1.4");
        for(Iterator i = lista.iterator(); i.hasNext();){
            Integer n = (Integer) i.next();
            System.out.println(n);
        }

        System.out.println("Percorendo a lista a partir do Java 1.5");
        for(Integer n : lista){
            System.out.println(n);
        }


        //Java 8 : Funções Lambda e API STEAM (Fluxo de Dados)
        System.out.println("Percorendo a lista a partir do Java 1.8");
        lista.stream().forEach( n -> System.out.println(n));

        System.out.println("Percorendo a lista com Stream API e filtrando somente os pares");
        List<Integer> listaPares = lista.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        //listaPares.forEach( n -> System.out.println(n) );
        listaPares.forEach(System.out::println);




    }

}
