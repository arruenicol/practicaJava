package genc181902;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComisionApp {

    // Implementar Código de la Aplicación de Comisiones:
            // En la clase `ComisionApp`, escribe el código para calcular la comisión basándote en las ventas ingresadas por el usuario.
            // Pide al usuario que ingrese sus ventas.
            // Utiliza estructuras condicionales (**`if`**, **`else if`**, **`else`**) para evaluar las ventas y determinar la comisión según las siguientes condiciones:
            // "30%" para ventas superiores a $100,000.
            // "20%" para ventas entre $50,001 y $90,999.
            // "10%" para ventas entre $10,001 y $40,999.
            // "N/A" (No aplica) para ventas inferiores a $10,000.
    // Imprimir Detalles de la Comisión:
            // Modifica la salida para imprimir las ventas ingresadas y la comisión calculada.
    // Manejo de Entrada Inválida:
            // Agrega validación para manejar el caso en que el usuario ingrese ventas negativas o una entrada no válida.
            // Muestra mensajes indicando que la entrada es inválida en estos casos.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el monto");
        if (sc.hasNextDouble()) {
            double monto = sc.nextDouble();
            double comision;
            String porcentaje;
            if (monto < 0 ) {
                System.out.println("El monto no puede ser negativo");
            }else{
                if (monto > 100000) {
                    comision = monto *0.3;
                    porcentaje = "30%";
                }else if (monto >= 50001 && monto <= 90999) {
                    comision = monto *0.2;
                    porcentaje = "20%";
                }else if (monto >= 10001 && monto <= 40999) {
                    comision = monto *0.1;
                    porcentaje = "10%";
                }else{
                    comision=0.0;
                    porcentaje="no aplica";
                }
                System.out.println("Venta ingresada: " + monto);
                System.out.println("Comision " + porcentaje+ ": " + comision);
            }
        }else{
            System.out.println("Número inválido");
        }
        sc.close();

    }

}
