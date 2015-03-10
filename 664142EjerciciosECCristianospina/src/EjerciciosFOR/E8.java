

package EjerciciosFOR;

import java.util.Scanner;
public class E8 {
    
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        
         int i;
         int[] numeros = new int[10];
         
         System.out.println("Ingrese los numero del arreglo ");
        for (i = 1; i <=10; i++) {
            System.out.print("numero" + i + "= ");
            numeros[i]=teclado.nextInt();
        }
}
}