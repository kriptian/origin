

package EjerciciosIF;

import java.util.Scanner;

public class E6 {
     public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
    String  pal1,pal2,pal3;
    System.out.print("Escriba una palabra: " );
        pal1 = teclado.next(); 
    System.out.print("Escriba una palabra: " );
        pal2 = teclado.next();   
    System.out.print("Escriba una palabra: " );
        pal3 = teclado.next();     

        if (pal1.length()> pal2.length() && pal1.length()>pal3.length()){
            System.out.print("La palabra mayor es:" +pal1);
            } else {
           if (pal2.length()>pal3.length()){
    		System.out.print("la palabra mayor es:" +pal2);}
          
        else 
           
               System.out.print("la palabra mayor es:" +pal3);
           }
     }
} 
   