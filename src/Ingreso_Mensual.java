import java.util.Scanner;

public class Ingreso_Mensual {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String tipoIngreso = "x";
        float valorMinimo = 489.083f;
        int auto = 3;
        int modelo = 5;
        int casa = 3;
        float valorMinimoVigente = 700000;

        System.out.println("Ingrese un valor de ingreso de salario");
        float ingreso = sc.nextFloat();
        System.out.println("Ingrese cantidad de vehiculos");
        int cantidad = sc.nextInt();
        System.out.println("Ingrese antiguedad del vehiculo");
        int antiguedad = sc.nextInt();
        System.out.println("Ingrese cuantos inmuebles tiene");
        int inmuebles = sc.nextInt();
        System.out.println("Indique cual es el valor de su activo");
        float valorActivo = sc.nextFloat();


        if ((ingreso <= 489.083) && (cantidad <= auto) && (antiguedad <= 5) && (valorActivo <= 700000)) {
            tipoIngreso = "Segmento bajo";
        } else {
            if ((ingreso >= 489.083) && (cantidad >= auto) && (antiguedad >= 5) && (valorActivo >= 700000)) {
                tipoIngreso = "Segmento medio";
            } else {
                if ((ingreso < 489.083) && (cantidad < auto) && (antiguedad < 5) && (valorActivo < 700000)) {
                    tipoIngreso = "Segmento medio - alto";
                }
            }
        }
        System.out.println("los ingreso de mayor capacidad son de: " + tipoIngreso);
    }
}