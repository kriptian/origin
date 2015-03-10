/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosWHILE;

import java.util.Scanner;

public class E3 {
     public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int valor;
        do {
            System.out.print("Ingrese un numero:");
            valor=teclado.nextInt();
         
        } while (valor!=0);
        System.out.println("Termino el juego");
    }
}