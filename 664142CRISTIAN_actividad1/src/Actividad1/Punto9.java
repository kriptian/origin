package Actividad1;

import java.util.Scanner;

public class Punto9 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Ingrese el precio del articulo:");
    	a=sc.nextInt();
        System.out.print("Ingrese el numero de articulos:");
    	b=sc.nextInt();
        System.out.println("El Total a pagar es:"+ (a*b));
    
    
}
}
