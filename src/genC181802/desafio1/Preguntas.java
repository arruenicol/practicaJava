package genC181802.desafio1;

import java.util.Scanner;

public class Preguntas {
    //Usar println y next(), recibir info por consola e imprimirla
    //Minimo 3 preguntas, concatenar en una linea
    //Espacios entre las palabras
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Cuál es tu nombre?");
    String nombre = sc.nextLine();
    System.out.println("¿Qué día es?");
    String dia = sc.nextLine();
    System.out.println("¿En qué mes estamos?");
    String mes = sc.nextLine();
    System.out.println("Hola " + nombre+", ¡que tengas un lindo "+dia+" y termines "+mes+" sin problemas!");
    }
}
