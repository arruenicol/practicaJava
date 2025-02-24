package genc182402;

import java.util.Arrays;

public class ActividadArreglos {

    /*1. Dados un arreglo de números y un arreglo de Strings, te corresponde llevar a cabo lo siguiente:
    a. En el arreglo de números:
           - Obtener el máximo y el mínimo
           - Contar elementos pares e impares dentro del arreglo
           - Ordenar el arreglo en orden ascendente
           - Buscar duplicados dentro del arreglo
    b. En el arreglo de String:
           - Contar las vocales de cada texto
           - Ordenar alfabéticamente
           - Encontrar el texto más largo
           - Concatenar todos los textos sin usar +2.

     **Ejecución y Pruebas:** Ejecuta el programa y verifica lo solicitado mediante impresiones en consola.*/


        public static void main(String[] args) {
            int[] numeros = {10, 5, 20, 15, 25, 10, 30, 15, 5, 40, 40};

            //maximo - minimo
            int maximo = numeros[0];
            int minimo = numeros[0];

            for (int num : numeros) {
                maximo = Math.max(maximo, num);
                minimo = Math.min(minimo, num);
            }
            System.out.println(Arrays.stream(numeros).max().getAsInt()); //si está vacío el array: Arrays.stream(numeros).max().orElse(Integer.MIN_VALUE)
            System.out.println(Arrays.stream(numeros).min().getAsInt());
            System.out.println("Número maximo es: " + maximo);
            System.out.println("Número minimo es: " + minimo);

            //orden ascendente
            Arrays.sort(numeros);
            System.out.println("Menor a mayor" + Arrays.toString(numeros));

            //duplicados
            for (int i = 0; i < numeros.length; i++) {
                for (int j = i + 1; j < numeros.length; j++) {
                    if (numeros[i] == numeros[j]) {
                        System.out.println(numeros[i]);
                    }
                }
            }


            String[] mascotas = {"Perro", "Cabra", "Caballo", "Pez", "Gato", "Loro", "Araña", "Capibara", "Hamster", "Vaca", "Cocodrilo"};


            //cantidad de vocales
            for (String palabra : mascotas) {
                int numVocales = 0;
                for (int i = 0; i < palabra.length(); i++) {
                    char vocal = palabra.charAt(i);
                    if (("aeiou".indexOf(vocal) != -1)) {
                        numVocales++;
                    }
                }
                System.out.println("número de vocales de la palabra " + palabra + "nes " + numVocales);
            }
            //ordenar alfabeticamente

            Arrays.sort(mascotas);
            System.out.println(Arrays.toString(mascotas));

            //texto más largo
            String textoMasLargo = "";
            for (String palabra : mascotas) {
                if (palabra.length() > textoMasLargo.length()) {
                    textoMasLargo = palabra;
                }
            }
            System.out.println("\nLa palabra más larga es: " + textoMasLargo);

            //concatenar sin +
            StringBuilder sb = new StringBuilder();
            for (String mascota : mascotas) {
                sb.append(mascota).append(" ");
            }
            System.out.println(sb);

        }

    }

