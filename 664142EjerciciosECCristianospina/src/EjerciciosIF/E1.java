/*
 * Realice un programa que pida dos numeros e indique cual es el mayor
 */
package EjerciciosIF;

/**
 *
 * @author
 */
import java.util.Scanner;

public class E1 {

    public static void main(String a[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int valorA = teclado.nextInt();
        int valorB = teclado.nextInt();
        if (valorA == valorB) {
            System.out.println("Son iguales");
        }
        if (valorA > valorB) {
            System.out.println("el primer numero es mayor");
        } else {
            System.out.println("b es el mayor");
        }

    }

}
