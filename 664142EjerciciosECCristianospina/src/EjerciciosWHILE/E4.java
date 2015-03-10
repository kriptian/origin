
package EjerciciosWHILE;

import java.util.Scanner;
import java.util.Random;

public class E4 {
    
     public static void main(String a[]) {
         
         Scanner t = new Scanner(System.in);
        Random r = new Random();
 
        String ingresarUsuario = "";
        String ingresarMaquina = "";
         
         
        System.out.println("Piedra, papel o tijera?");
        ingresarUsuario = t.next();
         
        while(!(ingresarUsuario.equals("piedra") || ingresarUsuario.equals("papel") || ingresarUsuario.equals("tijera"))){
            System.out.println("Piedra, papel o tijera?");
            ingresarUsuario = t.next();
        }
 
        System.out.println("Usuario: " + ingresarUsuario);
 
        switch(r.nextInt(3)){
            case 0: ingresarMaquina = "piedra";
            break;
            case 1: ingresarMaquina = "papel";
            break;
            case 2: ingresarMaquina = "tijera";
        }
 
        System.out.println("Maquina: " + ingresarMaquina);
 
        Comparar(ingresarUsuario,ingresarMaquina);
    }
    public static void Comparar(String ingreso1, String ingreso2){
        if(ingreso2.equals(ingreso1)){
            System.out.println("Empate");
        }else{
            if(ingreso1.equals("piedra")){
                if(ingreso2.equals("tijera")){
                    System.out.println("Gana piedra");
                }else{
                    System.out.println("Gana papel");
                }
            }
 
            if(ingreso1.equals("papel")){
                if(ingreso2.equals("piedra")){
                    System.out.println("Gana papel");
                }else{
                    System.out.println("Gana tijeras");
                }
            }
 
            if(ingreso1.equals("tijera")){
                if(ingreso2.equals("papel")){
                    System.out.println("Gana tijera");
                }else{
                    System.out.println("Gana piedra");
                }
            }
        }
         
    }
 
}