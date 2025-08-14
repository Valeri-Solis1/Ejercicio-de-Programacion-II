package Ejercicios;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escriba una palabra en minuscula: ");
        String palabra = scanner.nextLine();
        
        int numVocales = 0;
        int numConsonantes = 0;

        // mientras i sea menor que la cantidad de letras, el ciclo se repite
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i); // obtener letra en posición i

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                numVocales++;
            } else {
                numConsonantes++;
            }
        }

        System.out.println("Número de vocales: " + numVocales);
        System.out.println("Número de consonantes: " + numConsonantes);
    }
}

