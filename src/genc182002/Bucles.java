package genc182002;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {

        //while
        //contador despegue
        int contador = 10;
        System.out.println("Contador de despegue");

        while (contador >= 0) {
            System.out.println(contador);
            contador--;
        }
        System.out.println("¡Despegue!");

        //do-while
        //aunque la condición sea falsa, se ejecuta al menos una vez
        //adivinar numero del 1 al 10

        Scanner teclado = new Scanner(System.in);
        Integer numElegido;
        Integer numMisterioso = (int) (Math.random() * 10) + 1;
        Integer contIntentos = 0;

        do{
            System.out.println("Ingrese un numero del 1 al 10");
            numElegido = teclado.nextInt();
            contIntentos++;
            if (numElegido > numMisterioso){
                System.out.println("El número es menor");
            }else if (numElegido < numMisterioso){
                System.out.println("El número ");
            }else {
                System.out.println("Felicidades, adivinaste");
            }
            System.out.println("Llevas "+contIntentos+" intentos");

        }while(numMisterioso != numElegido);

        teclado.close();

        //do-while calculadora
        Integer opcion=-1;

        do {
            System.out.println("Ingrese un opcion\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir");
        }while(opcion<0||opcion>5);
    }
}
