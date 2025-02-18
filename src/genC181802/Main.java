package genC181802;

/*Programas compuestos por clases, son como las celulas del programa.
Las clases se nombran con Mayúscula*/

import java.util.Scanner;

/*Nombre Clase = Nombre Archivo*/
public class Main {

    /*Metodo main, punto de entrada al programa. Siempre presente*/

    public static void main(String[] args) {

        //System.out o "sou" imprime en consola
        System.out.print("Hola Cohorte 18, nuestro primer progra");

        //Scanner.next() recibe un input en consola
        //Instanciar una clase
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");

        String nombre = teclado.nextLine();
        System.out.println("Hola " + nombre);

    }
}