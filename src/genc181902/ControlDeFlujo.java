package genc181902;

import java.util.Scanner;

public class ControlDeFlujo {
    //se refiere a condiciones que controlan el flujo del programa

    public static void main(String[] args) {
        /*
            if = "sí"
            else = "si no"
            else if = "o si"
         */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        String nombre = teclado.nextLine();
        System.out.println("Ingresa tu edad:");
        Integer edad = teclado.nextInt();
        teclado.nextLine();
        System.out.println("¿Tienes tu carnet en mano?");
        String carnet = teclado.nextLine();

        //verificar si la edad cumple los requisitos
        if (carnet.equalsIgnoreCase("si")) {
            //if ((edad > 18) &&(carnet.equalsIgnoreCase("si"))){}
            if (edad >= 18) {
                System.out.println("Perfecto, " + nombre + " puedes pasar. ¡Diviértete!");
            } else if (edad == 18) {
                System.out.println("Estás en la edad justa, " + nombre + " puedes pasar.");
            } else {
                System.out.println("Lo sentimos, " + nombre + ", todavía no.");
            }
        } else {
            System.out.println("Lo siento no puedes pasar");
        }

        //muchos posibles escenarios según algún valor
        System.out.println("¿qué día es? responde con un número");
        Integer diaSemana = teclado.nextInt();
        teclado.nextLine();

        //código muy largo, muchos if innecesarios

        if (diaSemana == 1) {
            System.out.println("Hoy es lunes");
        } else if (diaSemana == 2) {
            System.out.println("Hoy es martes");
        } else if (diaSemana == 3) {
            System.out.println("Hoy es miercoles");
        }

        //alternativa -> switch case

        switch (diaSemana) {
            case 1:
                System.out.println("Hoy es lunes, comienza la semana");
                break;
            case 2:
                System.out.println("Hoy es martes, qué pena");
                break;
            case 3:
                System.out.println("Hoy es miercoles, casi la mitad");
                break;
            case 4:
                System.out.println("Hoy es jueves, falta poco");
                break;
            case 5:
                System.out.println("Hoy es viernes");
                break;
            case 6:
                System.out.println("Hoy es sabado, fin de semana");
                break;
            case 7:
                System.out.println("Hoy es domingo, toca descansar");
                break;
            default:
                System.out.println("Ese día no existe");
        }

        System.out.println("Ingrese el nombre del estudiante");
        String nombreEstudiante = teclado.nextLine().toLowerCase();

        switch (nombreEstudiante) {
            case "gabriel":
                System.out.println("Es de la Cohorte 18");
                break;

        }


    }
}
