package genc182102;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class MetodosJava {

    public static void llamadoMetodosMath() {
        double numero = 16;
        System.out.println("El numero es: " + numero);
        //llamamos clase math y metodo random
        System.out.println("Numero al azar entre 9 y 1 " + Math.random());
        //clase math y metodo pow
        System.out.println("16 elevado a 2 es " + Math.pow(16, 2));
        //clase math y metodo max
        System.out.println("Entre estos dos valores, el maximo es: " + Math.max(numero, 20.0));
        //clase math y metodo min
        System.out.println("Entre estos dos valores, el maximo es: " + Math.min(numero, 5.0));

    }
    //metodo que llame metodos para los string
    public static void llamadoMetodosString(String nombreUno, String nombreDos){
        System.out.println("Bienvenidos al programa "+nombreUno+" y "+nombreDos);
        //metodo equals()
        System.out.println("Los nombres: " + nombreUno + ", " + nombreDos + " son iguales? La respuesta es "+ (nombreUno.equals(nombreDos) ? "Sí" : "No"));
        //metodo length
        System.out.println("Los nombres " +nombreUno + " y " + nombreDos + " suman una cantidad de " + (nombreUno.length() + nombreDos.length()) + " caracteres");
        //metodo upperCase para convertir el string en mayusculas
        System.out.println("Primer nombre en mayuscula: "+nombreUno.toUpperCase());
        //metodo toLowerCase, minuscula
        System.out.println("Segundo nombre en minuscula: "+nombreDos.toLowerCase());
    }

    //metodo para trabajar con fechas
    public static void llamadoMetodosFechas(){
        //clase para almacenar fecha,fecha actual
        LocalDate fechaDeHoy = LocalDate.now();
        System.out.println("La fecha de hoy es " + fechaDeHoy);
        //metodo .getYear, año de la fecha
        System.out.println("El año actual es " +fechaDeHoy.getYear());
        //metodo getMonth, mes de la fecha
        System.out.println("El mes actual es " +fechaDeHoy.getMonth());
        //metodo getDay, el día de la fecha
        System.out.println("El día de hoy es " +fechaDeHoy.getDayOfWeek());
        //formatear la fecha actual, .format() y ofPattern
        System.out.println("Formato de la fecha (dd/MM/yyyy): "+ fechaDeHoy.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }

    public static void main(String[] args) {
        llamadoMetodosMath();
        llamadoMetodosString("Maria", "Maria");
        llamadoMetodosFechas();
    }

}
