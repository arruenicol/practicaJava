package genC181802.desafio2;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoja una opción: \n1. Suma\n2. Resta\n3. Multiplicación\n4. División");
        int opcion = sc.nextInt();

        while (opcion < 5 ) {

            System.out.println("Digite el primer numero: ");
            float numUno = sc.nextFloat();
            System.out.println("Digite el segundo numero: ");
            float numDos = sc.nextFloat();

            if (opcion == 1) {
                System.out.println("Resultado: " + (numUno + numDos));
            } else if (opcion == 2) {
                System.out.println("Resultado: " + (numUno - numDos));
            } else if (opcion == 3) {
                System.out.println("Resultado: " + (numUno * numDos));
            } else if (opcion == 4) {
                System.out.println("Resultado: " + (numUno / numDos));
            }
            sc.close();
        }
        System.out.println("Esa no es una opción");
        /*
        double aleatorio = Math.random();
        int maximo = Math.max(3, 9)
        System.out.println("Número aleatorio del 0 a 1"+aleatorio);
        System.out.println("El mayor es: "+maximo);

         */
    }
}
