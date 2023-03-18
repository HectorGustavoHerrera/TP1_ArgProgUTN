import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;


public class Ejercicio_5 { ////LECTURA Y ESCRITURA DE ARCHIVOS/////



    public static void main(String[] args) throws IOException{

        if(args.length == 0){
            System.out.println("No me enviaron parametros");
        }
        else {
            //["Gustavo", "Herrera", "1", "2", "3",....."9"]
            System.out.println("Me enviaron parametros");
            String nombre = args[0];
            String apellido = args[1];
            System.out.println(saludoPersonalizadoPara(nombre,apellido));

            int resultado = 0;

            for(int i = 2; i < args.length; i++){
                resultado += Integer.parseInt(args[i]); // "1" -> 1
            }

            System.out.println("El resultado es: " + resultado);
        }

        ejemploInterracionUsuario();

        /*String ruta = "C:\\Users\\Gustavo\\Desktop\\UTNArg Programa\\ejemplo.txt";
        ejemploLecturaArchivo(ruta);
        ejemploEscrituraArchivo(ruta);
        ejemploEscrituraArchivo2(ruta);
        System.out.println(Files.getLastModifiedTime(Paths.get(ruta)));*/



    }
    private static void ejemploInterracionUsuario(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombreIngresado = scanner.nextLine();

        System.out.println("Ingrese su apellido");
        String apellidoIngresado = scanner.nextLine();

        System.out.println(saludoPersonalizadoPara(nombreIngresado,apellidoIngresado));

        System.out.println("Ingrese su edad");
        String edadIngresada = scanner.nextLine();

        int edadMasDos = Integer.parseInt(edadIngresada) + 2;
        System.out.println("Tu edad en dos años será de: " + edadMasDos);

    }






    private static void ejemploLecturaArchivo(String ruta) throws IOException {

        for (String unaLinea: Files.readAllLines(Paths.get(ruta))){ // ["Hector","Gustavo"]
            System.out.println(unaLinea);
        }
    }

    private static void ejemploEscrituraArchivo(String ruta) throws IOException {
        String fraseParaAgregar =  System.lineSeparator() + "Julian";
        Files.writeString(Paths.get(ruta),fraseParaAgregar, StandardOpenOption.APPEND);
    }
    private static void ejemploEscrituraArchivo2(String ruta) throws IOException {
        String fraseParaAgregar =  System.lineSeparator() + "Romina";
        Files.write(Paths.get(ruta), fraseParaAgregar.getBytes(), StandardOpenOption.APPEND);
    }

    private static String saludoPersonalizadoPara(String nombre, String apellido){
        return " hola " + nombre + " " + apellido + ", bienvenido";
    }
}
