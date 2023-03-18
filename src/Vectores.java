import java.awt.font.FontRenderContext;

public class Vectores {
    public static void main(String[] args) {

        int[]numeros = new int[3];

        numeros[0] = 1; // asignacion
        numeros[1] = 37;
        numeros[2] = 16;
        System.out.println(numeros.length);
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);


        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println(indice);
            System.out.println(numeros[indice]); //imprime por pantalla
        }

        int []numeros2 = new int[] {22,33,44}; //declaro y asigno

        int letras [] = {3,2,1};

        for (int letra: letras
             ) {
            System.out.println(letra);
        }

        String txt1 = "hola!";
        String txt2 = "Chau!!";
        System.out.println(txt1);

        String txt3 = txt1 + txt2;

        System.out.println(txt1.equals("hola"));


    }
}
