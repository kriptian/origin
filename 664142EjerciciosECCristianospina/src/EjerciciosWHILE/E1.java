/*
 * Realizar un programa que le pida al usuario numeros, cuantos? no sabemos
 * si usuario ingresa el 0, el programa debe terminar, mientras el usuario 
 * ingrese valores diferentes de cero, debe seguir funcionando (pidiendo mas valores)

 */
package EjerciciosWHILE;

/**
 *
 * @author
 */
import java.util.Scanner;

public class E1 {

    public static void main(String a[]) {
        Scanner teclado = new Scanner(System.in);
        int valorIngresado = teclado.nextInt();

        while (valorIngresado != 0) {
            System.out.println("ingrese un valor cualquiera o cero para terminar");
            valorIngresado = teclado.nextInt();
        }

    }
}
