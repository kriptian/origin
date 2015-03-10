

package EjerciciosIF;

import java.util.Scanner;
public class E3 {
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        String nombre1,nombre2;
        System.out.print("Ingrese primer nombre:");
        nombre1=teclado.next();
        System.out.print("Ingrese segundo nombre:");
        nombre2=teclado.next();
        if (nombre1.equals(nombre2)) {
            System.out.print("Los nombres son iguales");
        } else {
            System.out.print("Los nombres son distintos");
        }
    }
    
}
