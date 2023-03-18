public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a Argentina Programa");


        boolean unValorBooleano = false;


        float otroNumero =  10.5f;
        double UnNumeroMasPreciso = 10.5;

        int unNumero = 10;
        int otroNumeroEntero = 1;

        int resultadoSuma = unNumero + otroNumeroEntero;
        int resultadoResta = unNumero + otroNumeroEntero;


        // OPERADOR DE ASIGNACION ( = )
        //OPERADORES ARITMETICOS ( +, -, *, /, %) -> Reducen a un número
        //OPERADORES DE COMPARACION (>, >= ,< ,<= ,==, !=) -> Reducen a un booleano
        //OPERADORES LOGICOS (AND -> Conjunción , OR -> Disyunción , NEGACIÓN  -> &&,||,!)

        boolean esMayor = 10 != 1;

        int edad = 17;
        boolean tieneFiebre = false;

        boolean esMayorDeEdadyEstaSaludable = (edad > 18) && !tieneFiebre;

        if(edad > 18){
            //.....
            //.....  si se cumple se ejecuta, sino se cumple no se ejecuta
            //.....
        }
        else{
            //....
            //...
        }

        char unaLetra = 'a';
        switch (unaLetra){
            case 'a': ///
                break;
            case 'b': ///
                break;
            case 'c': ///
                break;
            default: ///
        }













    }
}