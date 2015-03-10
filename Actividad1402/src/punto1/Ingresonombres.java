
package punto1;

import java.util.Scanner;


public class Ingresonombres {
    
    public static void main (String arg[]){
        Scanner teclado= new Scanner (System.in);
        System.out.println("ingrese el primer valor");
        int var =teclado.nextInt();
        System.out.println("ingrese el segundo valor");
        int v= teclado.nextInt();
        
        System.out.println("el resultado es: "+(var*v));
    }
    
}
