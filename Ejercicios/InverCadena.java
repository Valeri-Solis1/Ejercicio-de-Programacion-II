package Ejercicios;

import java.util.Scanner;

public class InverCadena {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingrese cualquier texto: ");
        String texto = scanner.nextLine();

        String textoInver= new StringBuilder(texto).reverse().toString();

        System.out.println("Tu texto invertido es: ");
        System.out.println(textoInver);
        scanner.close();
    }
}
