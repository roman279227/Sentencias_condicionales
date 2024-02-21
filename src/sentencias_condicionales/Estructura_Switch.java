
package sentencias_condicionales;
import java.util.Scanner;


public class Estructura_Switch {
    
    
    
    
     public static void main(String[] args) {
         
    
         
     System.out.println("¿Cuantos apóstoles crees que estaban en la mesa de La Última Cena?");    
         
         
    Scanner teclado= new Scanner(System.in);
    
    int numero=teclado.nextInt();
         
    try{   
    
    switch(numero){
        
        
        case(1) -> System.out.println("Faltan 11 apóstoles");
        case(2) -> System.out.println("Faltan 10 apóstoles");
        case(3) -> System.out.println("Faltan 9 apóstoles");
        
        case(4) -> System.out.println("Faltan 8 apóstoles");
            
        case(5) -> System.out.println("Faltan 7 apóstoles");
        
        case(6) -> System.out.println("Faltan 6 apóstoles");
            
            
            
        case(7) -> System.out.println("Faltan 5 apóstoles");
        
        case(8) -> System.out.println("Faltan 4 apóstoles");
            
        case(9) -> System.out.println("Faltan 3 apóstoles");
        
        case(10) -> System.out.println("Faltan 2 apóstoles");
            
        case(11) -> System.out.println("Falta 1 apóstol");
        
        case(12) -> System.out.println("Correcto");
        
        default -> System.out.println("Te has pasado o no has acertado");
            
    }
    
    }catch(Exception e){
        
        System.err.println("Debes escribir un número");
        
        e.printStackTrace();
        
    }
   }




}
    
    
    
    
    

    
