/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosIF;


import java.util.Scanner;

public class E4 {
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int a ;
         System.out.print("Ingrese numero:");
         a=teclado.nextInt();
         
         if(a>=0) {
            System.out.println("es positivo");
        }
         else {
            System.out.println("es negativo");
        }
    
}
}