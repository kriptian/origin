

package EjerciciosIF;

import java.util.Scanner;
public class E5 {
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
     int N;
        System.out.print("Escriba un numero: ");
        N = teclado.nextInt(); 
        if(N%2==0)
           System.out.println("Es multiplo de 2");    
        else
            System.out.println("No es multiplo de 2");
}
}