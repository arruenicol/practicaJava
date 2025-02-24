package genc182102;

import java.util.Scanner;

public class  Funciones {
    //modificaciones de acceso
    //modificador privado encapsula clase acctual
    private static String nombre;

    //modificador acceso public, acceso desde calquier package
    public static String primeroApellido;

    //modificador de acceso protected, acceso desde el mismo package o clases hijas
    protected static String segundoApellido;


    //declaro la función saludo
    public static void saludo(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese su primer apellido: ");
        primeroApellido = teclado.nextLine();
        System.out.println("Ingrese su segundo apellido: ");
        segundoApellido = teclado.nextLine();
        System.out.println("Hola " + nombre + " " + primeroApellido + " " + segundoApellido);
    }

    //funcion no static, requiere instanciar la clase
    public int suma(int a, int b){
        return a+b;
    }

    //funcion static pertenece a la clase, no necesita instancia
    public static int resta(int a, int b){
        return a-b;
    }

    //sobrecarga de métodos
    //redeclarar metodo, volviendo a indicar args o tipo de retorno

    public double suma(double a, double b){
        return a+b;
    }


    public static void main(String[] args) {
        //Funciones miFuncion = new Funciones();
        //System.out.println(miFuncion.nombre);
        saludo();
        //llamado a una función de instancia
        Funciones miFuncion = new Funciones();
        int resultado = miFuncion.suma(10, 20);
        System.out.println("instancia " + miFuncion);
        System.out.println("resultado suma " + resultado);
        System.out.println("suma decimales " + miFuncion.suma(10,5.6));
        //funcion static
        System.out.println("resultado resta " + Funciones.resta(10,5));

    }
}
