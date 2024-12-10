/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package minireto.aplicacion;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Aplicacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean seguir = true;
        do {
            System.out.println("MENU:");
            System.out.println("1. Crear Usuario ");
            System.out.println("2. Registrar Reto ");
            System.out.println("3. Realizar Reto ");
            System.out.println("4. Valorar Reto ");
            System.out.println("5. Ver reto (Con sus puntos de paso/waypoints) ");
            System.out.println("6. Ver retos realizados por un usuario ");
            System.out.println("7. Ver valoraciones de un reto ");
            System.out.println("8. Salir de la aplicacion ");

            System.out.println("¿Que quieres hacer? ");

            int metodo = scanner.nextInt();

            switch (metodo) {

                case 1 -> 

                    

                case 2 ->
                
                
                case 3 ->
                    
                case 4 ->

                     
                case 5 ->      

                case 6 -> 
                    
                case 7 ->
                    
                case 8 ->

                     
                case 9 ->      

                case 10 -> {System.out.println("Saliendo de la aplicacion");
                
                seguir=false;
                
                }
                
                default -> System.out.println("Opcion no valida");
                

            
    } 
}while (seguir);
    }

}