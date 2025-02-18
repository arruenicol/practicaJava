package genc181902;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = teclado.nextInt();
        /* if (num % 2 == 0) {
            System.out.println(num + " es par");
        }else{
            System.out.println(num + " es impar");
        }*/

        String mensaje = (num%2==0) ? "par" : "impar";
        System.out.println(mensaje);

        teclado.close();
    }
}

