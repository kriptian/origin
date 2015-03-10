
package Actividad1;

import java.util.Scanner;

public class Punto8 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        System.out.print("Ingrese primer numero:");
    	a=sc.nextInt();
        System.out.print("Ingrese primer numero:");
    	b=sc.nextInt();
        System.out.print("Ingrese primer numero:");
    	c=sc.nextInt();
        System.out.print("Ingrese primer numero:");
    	d=sc.nextInt();
        
        System.out.println("La suma de los numeros es:"+ (a+b+c+d));
        System.out.println("El promedio de los numeros es:"+ ((a+b+c+d)/4));
}
}