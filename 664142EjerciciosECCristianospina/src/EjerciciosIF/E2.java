/*
 *Construya un programa que indique si el numero ingresado es cero
 */

package EjerciciosIF;

/**
 *
 * @author 
 */

import java.util.Scanner;

public class E2 {
    public static void main(String a[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int valorIngresado = teclado.nextInt();
        
        if (valorIngresado == 0) {
            System.out.println("ingresó cero");
        }
        else {
            System.out.println("Ingresó un número diferente de cero");
        }

    }
    
   }
