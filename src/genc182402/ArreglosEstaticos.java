package genc182402;

import java.util.Arrays;
import java.util.Scanner;

public class ArreglosEstaticos {
    //los arrays tienen una longitud fija por naturaleza, no puedo aumentar su longitud

    public static void main(String[] args) {
    int[] numerosUnoAlDiez = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //imprime la dirección de memoria
        System.out.println(numerosUnoAlDiez);

        //imprime arreglo fijo
        System.out.println("Los numeros del 1 al 10 son: " + Arrays.toString(numerosUnoAlDiez).replace("[", "").replace("]", "").trim());

        //acceder a indice del arreglo mediante posición
        System.out.println("El elemento en el índice 5 es "+numerosUnoAlDiez[4]);

        int[] numerosVacio = new int[5];
        System.out.println("El arreglo tiene los siguientes elementos " + Arrays.toString(numerosVacio));

        numerosVacio[0] = 1;
        numerosVacio[1] = 2;

        System.out.println("Ahora tiene estos " + Arrays.toString(numerosVacio));

        //acceder a posición que no existe -> excepción
        System.out.println("Elemento en posición 5 "+ numerosVacio[4]);

        //recorrer un arreglo
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numerosVacio.length; i++) {
            System.out.println("Ingresa un valor para el elemento en la posición " + i+ ": ");
            numerosVacio[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("El elemento en la posición " + i + " ahora es " + numerosVacio[i]);
        }

        //calcular suma de los numeros del arreglo
        int suma = 0;
        for (int i = 0; i < numerosVacio.length; i++) {
            System.out.println("La suma va en "+suma);
            suma += numerosVacio[i];

        }

        //llamar de nuevo el array con los elementos
        System.out.println("El arreglo tiene los siguientes valores "+ Arrays.toString(numerosVacio));

        //foreach
        for (int elemento : numerosVacio) {
            System.out.println("El elemento tiene un valor de " + elemento);
        }

        // for + variable con la que me refiero a cada elemento
        int sumaEach = 0;
                for (int numero : numerosVacio){
                    sumaEach += numero;
                }
        System.out.println("La suma total es "+sumaEach);

    }

}
