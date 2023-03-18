import java.util.ArrayList;

public class Ejercicio_1 {
    public static void main(String[] args) {

        int numeroInicio = 5;
        int numeroFinal = 14;
        var numerosPares = new ArrayList<Integer>();
        var numerosImpares = new ArrayList<Integer>();
        var numerosParesEImpares = new ArrayList<Integer>();
        var buscarNumerosPares = true;



        while(numeroInicio <= numeroFinal){

            numerosParesEImpares.add(numeroInicio);

            if(((numeroInicio % 2) == 0) && buscarNumerosPares == true)
                numerosPares.add(numeroInicio);

            if(((numeroInicio % 2) != 0) && buscarNumerosPares == false)
                numerosImpares.add(numeroInicio);


            numeroInicio++;
        }



        System.out.println("listado general de numeros: " + numerosParesEImpares);
        System.out.println(buscarNumerosPares ? "lista de numeros pares:" + numerosPares:
                                                "lista de numeros impares:" + numerosImpares);


        for (int i = numeroFinal; i < numeroInicio; i++) {
            if(((numeroFinal > numeroInicio)) && (numeroFinal % 2) == 0){
                System.out.println(numeroFinal);
                numeroFinal++;
            }
        }

    }
}
