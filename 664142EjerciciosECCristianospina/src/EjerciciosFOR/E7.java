

package EjerciciosFOR;

public class E7 {
    
       public static void main(String[] args) {
        int i;       
        int[] numeros = new int[20];
        int suma=0;
  
        //lectura de datos y llenar el array
       
        for (i = 1; i <=20; i++) {
            
         
            if (i % 2 == 0)
            {
            suma=suma+(i);
       
        
        System.out.println("la suma de las posiciones pares es:" + suma);
        
       
    }
}
    
}
}