package genc182002.desafio;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos números desea mostrar?");
        int num = teclado.nextInt();
        teclado.nextLine();
        int a = 0, b =1;

        System.out.print( a + ", " + b + ", ");
        for (int i = 2; i < num ; i++) {
            int fibo = a + b;
            System.out.print(fibo + ", ");
            a = b;
            b = fibo;
        }
    }
}
