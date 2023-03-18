public class Monotributo {
    /* Problema: Determinar que categoria del monotrobuto corresponde una determinada persona
           Entrada: Ingresos, superficie,energia electrica
           Salida: Categoria:
         */
    public static void main(String[] args) {

        //Docente
        //float ingreso = 500;  // miles
        //int superficie = 0;   //m2
        //int consumoElectrico = 330; //kw

        //Carpintero
        float ingreso = 1000;  // miles
        int superficie = 30;   //m2
        int consumoElectrico = 1000; //kw

        char categoria = 'x';


        //A     $748.382,07     30 m2    3330 Kw
        if((ingreso <= 748) &&
                (superficie <= 30) &&
                (consumoElectrico <= 3300)){
            categoria = 'A';
        }
        else{
            //B     $1.112.459,83   45 m2    5000 Kw
            if((ingreso <= 1112) &&
                    (superficie <= 45) &&
                    (consumoElectrico <= 5500)){
                categoria = 'B';
            }else {
                //C     $1.557.443,75   60 m2    6700 Kw
                if((ingreso <= 1557) &&
                        (superficie <= 60) &&
                        (consumoElectrico <= 6700)){
                    categoria = 'C';
                } else {
                    //D     $1.934.273,04   85 m2    10000 Kw
                }
                    if((ingreso <= 1934) &&
                            (superficie <= 85) &&
                            (consumoElectrico <= 10000)){
                        categoria = 'C';
                }
            }
        }



        //E     $2.277.684,56   110 m2   13000 Kw
        //F     $2.847.105,70   150 m2   16500 Kw
        //G     $3.416.526,83   200 m2   20000 Kw
        //H     $4.229.985,60   200 m2   20000 Kw

        System.out.println(categoria);


    }
}
