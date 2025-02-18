package genC181802;

public class Operadores {

    public static void main(String[] args) {
        /*operadores aritméticos
            suma
            resta
            multiplicación
            división
            resto
        */

        int a = 10;
        int b = 5;
        final int c = 15; //final crea una constante

        int resultado = 10 + 5; //suma
        System.out.println(resultado);

        resultado = resultado - a; //resta
        System.out.println("Restamos "+a+", resultado: " +resultado);

        resultado = resultado * b; //multiplicación
        System.out.println("Multiplicamos "+a+" por "+b+", resultado: " +resultado);

        resultado = c/b;
        System.out.println("Dividimos "+c+ " entre "+b+", resultado: " +resultado);

        resultado = 10 % 2;
        System.out.println("Resto: "+resultado);


        /*operadores de asignación
            *
            =
            +=
            -=
            *=
            /=
        */

        resultado +=1;
        System.out.println("Nuevo resultado: "+resultado);

        /* operadores unarios
            ++
            --
        */

        resultado++;
        System.out.println("Nuevo resultado: "+resultado);

        ++resultado;
        System.out.println("Resultado: "+resultado);

        resultado--;
        System.out.println("Nuevo resultado: "+resultado);


        /* operadores de comparación - true or false
            == igual que
            < menor que
            > mayor que
            <= menor o igual
            >= mayor o igual
            != distinto de
         */

        a = 10;
        b = 15;
        boolean esVerdadero = resultado == a;
        System.out.println("¿es igual a "+resultado+"? "+esVerdadero);
        System.out.println("¿es menor que "+b+"? "+(a<b));
        System.out.println("¿es mayor que "+b+"? "+(a>b));
        System.out.println("¿es distinto de "+b+"? "+(a!=b));

        /* operadores lógicos
            &&
            ||
            !
        */

        boolean expresionUno = (a <b ) && (a==a);
        System.out.println(expresionUno);

        boolean expresionDos = (a<b) && (a>b);
        System.out.println(expresionDos);

        boolean expresionTres = (a>b) || (a!=b);
        System.out.println(expresionTres);

        boolean expresionCuatro = !(a==b) || !(a>b);
        System.out.println(expresionCuatro);



    }
}