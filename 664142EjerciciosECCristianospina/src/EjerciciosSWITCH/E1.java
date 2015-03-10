

package EjerciciosSWITCH;


/**
 *
 * @author 
 */

import java.util.Scanner;

public class E1 {
    
    
    public static void main(String a[]) {
        Scanner teclado = new Scanner(System.in);
        String valorIngresado = teclado.nextLine();

        switch (valorIngresado){
            case "piedra": System.out.println("escojiste piedra");
                            break;
            case "papel": System.out.println("escojiste papel");
                            break;
            case  "tijera": System.out.println("escojiste tijera");
                            break;
            default : System.out.println("debes escojer entre piedra, papel o tijera");
        }
                    
        
    }

    
    
}
