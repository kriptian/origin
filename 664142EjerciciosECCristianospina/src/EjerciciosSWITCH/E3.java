/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosSWITCH;

import java.util.Scanner;
import java.util.Random;

public class E3 {
    
    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 int x;
  System.out.println("Introduzca un numero del 1 al 6");
        System.out.print("Su Numero: ");
        x = sc.nextInt();
       if (x < 1 || x > 6)
           System.out.println("Numero incorrecto");
       else{
           switch(x){  //se muestra el nombre mediante una instrucción switch
                case 1: System.out.println("Su Numero de la suerte es: "+(x = 1 + new Double(Math.random() * 6).intValue()));
                        break;
                case 2: System.out.println("Su Numero de la suerte es: "+(x = 1 + new Double(Math.random() * 6).intValue()));
                        break;
                case 3: System.out.println("Su Numero de la suerte es: "+(x = 1 + new Double(Math.random() * 6).intValue()));
                        break;
                case 4: System.out.println("Su Numero de la suerte es: "+(x = 1 + new Double(Math.random() * 6).intValue()));
                        break;
                case 5: System.out.println("Su Numero de la suerte es: "+(x = 1 + new Double(Math.random() * 6).intValue()));
                        break;
                case 6: System.out.println("Su Numero de la suerte es: "+(x = 1 + new Double(Math.random() * 6).intValue()));
                        break;
               
       }




}
    }
}

    

