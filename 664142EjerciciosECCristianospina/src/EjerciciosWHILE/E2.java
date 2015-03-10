/*
 * Construya un programa que le pida palabras al usuario
 *  cuando el usuario escriba la palabra salir, el programa debe finalizar
 */


package EjerciciosWHILE;

/**
 *
 * @author 
 */
import java.util.Scanner;

public class E2 {

    public static void main(String a[]) {
        Scanner teclado = new Scanner(System.in);
        String palabraIngresada = teclado.nextLine();

        while (!(palabraIngresada.equals("salir"))) {
            System.out.println("ingrese una palabra cualquiera o salir para terminar");
            palabraIngresada = teclado.nextLine();
        }
    }
}
