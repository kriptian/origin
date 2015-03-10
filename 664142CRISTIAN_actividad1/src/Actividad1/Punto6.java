package Actividad1;

import java.util.Scanner;
public class Punto6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l;
    System.out.println("Introduce el lado del cuadrado");
    l= sc.nextInt();
    System.out.println("El perimetro es :" + l*4);
}
}