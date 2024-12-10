/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package minireto.aplicacion;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Aplicacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("-------- Actividades deportivas --------");
            System.out.println("MENU:");
            System.out.println("1. Crear Usuario ");
            System.out.println("2. Registrar Reto ");
            System.out.println("3. Realizar Reto ");
            System.out.println("4. Valorar Reto ");
            System.out.println("5. Ver reto (Con sus puntos de paso/waypoints) ");
            System.out.println("6. Ver retos realizados por un usuario ");
            System.out.println("7. Ver valoraciones de un reto ");
            System.out.println("8. Ver el perfil");
            System.out.println("9. Ver aplausos de un reto");
            System.out.println("10. Salir de la aplicacion ");
            System.out.println("¿Que quieres hacer? ");

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 ->
                    M1();
                /*
                case 2 -> ;                            
                case 3 ->  ;               
                case 4 ->   ;                
                case 5 ->   ;   
                case 6 ->   ;               
                case 7 ->   ;            
                case 8 ->   ;             
                case 9 ->   ;  
                 */
                case 10 ->
                    System.out.println("Saliendo de la aplicacion");
                default ->
                    System.out.println("Introduce una opcion no valida (1-10)");
            }
        } while (opcion != 10);
    }

    public static void M1() {
        System.out.println("Introduce tu nombre");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Introduce tu primer apellido");
        String ap1 = new Scanner(System.in).nextLine();
        System.out.println("Introduce tu segundo apellido");
        String ap2 = new Scanner(System.in).nextLine();
        System.out.println("Introduce tu email");
        String email = new Scanner(System.in).nextLine();
        boolean fechacomp = false;
        int dia,mes,año;
        do {
            System.out.println("Introduce tu fecha de nacimineto ");
            System.out.println("Introduce el dia de nacimeineto");
             dia = new Scanner(System.in).nextInt();
            System.out.println("Introduce el mes de nacimeineto");
             mes = new Scanner(System.in).nextInt();
            System.out.println("Introduce el año de nacimiento");
             año = new Scanner(System.in).nextInt();
            if (fechaValida(dia, mes, año)==true) {
                fechacomp = true;
            } else {
                System.out.println("Formato de fecha incorrecta");
            }
        } while (fechacomp != true);
        LocalDate fecha = LocalDate.of(año,mes,dia);
        System.out.println("Introduce tu provincia");
        String prov = new Scanner(System.in).nextLine();
        System.out.println("Introduce tu genero 1-Hombre 2-Mujer 3-Otro");
        int genero = new Scanner(System.in).nextInt();
       /* if (existeUsuario(nombre,ap1,ap2)==false) {
               Usuario U1 = new Usuario(nombre, ap1, ap2, email, fecha, prov, genero);
        }else{
            System.out.println("El usuario ya esta creado");
        }
        */
    }

    public static boolean fechaValida(int dia, int mes, int año) {
        boolean valida=false;
        int [] maxdias={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if (mes<1||mes>12||dia<1||dia>31) {
               valida=false;
            }else{
            if (esBisiesto(año)==true) {
                    maxdias[2]=29;
                }
                if (dia<=maxdias[mes]) {
                    valida=true;
                }else{
                    valida=false;
                }
        } 
        return valida;
    }
    public static boolean esBisiesto(int año) {
        boolean compaño = false;
        if (año % 4 == 0) {
            compaño = true;
        }
        return compaño;
    }
   /*
    public static boolean existeUsuario(String nombre,String apellido1,String apellido2) {
        boolean existe=true;
        if (existe) {
            
        }
        return null;
    }
   */
}
