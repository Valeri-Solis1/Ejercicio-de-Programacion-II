package Ejercicios;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    System.out.print ("ingrese el primer numero: ");
    int numero1 = scanner.nextInt();

    System.out.print ("ingrese el segundo numero: ");
    int numero2 = scanner.nextInt();


    System.out.println("Que operacion quieres realizar");
    System.out.println("1: suma");
    System.out.println("2: resta");
    System.out.println("3: multiplicacion");
    System.out.println("4: division");

    System.out.println("eligue una opcion del 1 al 4");
    int opcion = scanner.nextInt();

    switch (opcion) {
        case 1:
        System.out.println("resultado: " + (numero1 + numero2));
            break;

        case 2:
        System.out.println("resultado: " + (numero1 - numero2));
            break;

        case 3: 
        System.out.println("resultado: " + (numero1 * numero2));
            break;

        case 4:
        if (numero2 !=0) {
            System.out.println("resultado: " + (numero1 / numero2));
        } else {
            System.out.println("ERROR: NO SE PUEDE DIVIDIR POR CERO");
            
        }
        break;
        default:
        System.out.println("opcion no valida");
            break;
    } 

    }
}
