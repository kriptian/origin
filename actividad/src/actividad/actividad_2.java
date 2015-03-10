
package actividad;

import java.util.Scanner;
        
public class actividad_2 {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int n=1 ;
        
        System.out.print("Introduce 10 números enteros: ");
        
         n = sc.nextInt();
         if(n>=10 && n<=20){
        System.out.print(n);
         System.out.println("este numero esta dentro del rango de 10 a 20  ");
         } 
        
         if(n>=30 && n<=40){
        System.out.print(n);
         System.out.println("este numero esta dentro del rango de 30 a 40  ");
         }
        
         
         if(n>=50 && n<=60){
        System.out.print(n);
         System.out.println("este numero esta dentro del rango de 50 a 60  ");
         }
    
         if(n>=70 && n<=80){
        System.out.print(n);
         System.out.println("este numero esta dentro del rango de 70 a 80  ");
         }
         if(n>=90 && n<=100){
        System.out.print(n);
         System.out.println("este numero esta dentro del rango de 90 a 100  ");
         }
    }
    }
    