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
                System.out.println("El número es mayor");
            }else {
                System.out.println("Felicidades, adivinaste");
            }
            System.out.println("Llevas "+contIntentos+" intentos");

        }while(numMisterioso != numElegido);

        /*Integer opcion;

        // Do While para crear de la calculadora
        do {
            System.out.println("Ingresa una opción: \n 1: Sumar \n 2: Restar \n 3: Multiplicar \n 4: Dividir");
            System.out.print("Ingresa una opción: ");
            opcion = teclado.nextInt();

            if (opcion < 1 || opcion > 4) {
                System.out.println("Opción inválida, intenta de nuevo.");
            }

        } while (opcion < 1 || opcion > 4); // Cambiado de 0 a 1 para el rango
        */

        // Aquí puedes agregar la lógica para realizar la operación elegida


        //for
        for(int i=0; i <=10 ;i++){
            System.out.println(i);
        }

        //for despegue
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }
        System.out.println("Despegue!");

        //tabla multiplicar de un n°
        System.out.println("Ingresa un numero");
        Integer numero = teclado.nextInt();

        for (int i =0; i <=10; i++){
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }

        teclado.close();

    }
}
