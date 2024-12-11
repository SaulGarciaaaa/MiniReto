/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minireto.aplicacion;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author DAM125
 */
public class Usuario {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    private LocalDate fechanac;
    private String provincia;
    private String contraseña;
    private String telefono;
    private Genero genero;
    private Perfil perfil;

    public Usuario(String nombre, String apellido1, String apellido2, String email, LocalDate fechanac, String provincia, String telefono, String genero) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.fechanac = fechanac;
        this.provincia = provincia;
        this.telefono = telefono;
       if (genero.equalsIgnoreCase("H")) { 
            this.genero = this.genero.Hombre; 
        }else if (genero.equalsIgnoreCase("M")) { 
            this.genero = this.genero.Mujer; 
        }else if (genero.equalsIgnoreCase("o")){ 
            this.genero = this.genero.Otro; 
        } 
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }
    
    public Reto proponerReto(){
        Reto r = new Reto();
        System.out.println("Nombre del reto:");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Tipo de actividad:");
        System.out.println("\t1-SENDERISMO"
                + "\n\t2-RUNNING"
                + "\n\t3-TRAILRUNNING"
                + "\n\t4-ALPINISMO"
                + "\n\t5-ESCALADA"
                + "\n\t6-BICICLETAMONTAÑA"
                + "\n\t7-BICICLETACARRETERA"
                + "\n\t8-DESCENSOMTB"
                + "\n\t9-ESQUIMONTAÑA"
                + "\n\t10-RAQUETA");
        int actividad;
        do{
            actividad = new Scanner(System.in).nextInt();
            ActividadDeportiva tipoActividad;
            switch (actividad) {
                case 1 ->
                    tipoActividad = ActividadDeportiva.SENDERISMO;
                case 2 ->
                    tipoActividad = ActividadDeportiva.RUNNING;
                case 3 ->
                    tipoActividad = ActividadDeportiva.TRAILRUNNING;
                case 4 ->
                    tipoActividad = ActividadDeportiva.ALPINISMO;
                case 5 ->
                    tipoActividad = ActividadDeportiva.ESCALADA;
                case 6 ->
                    tipoActividad = ActividadDeportiva.BICICLETAMONTAÑA;
                case 7 ->
                    tipoActividad = ActividadDeportiva.BICICLETACARRETERA;
                case 8 ->
                    tipoActividad = ActividadDeportiva.DESCENSOMTB;
                case 9 ->
                    tipoActividad = ActividadDeportiva.ESQUIMONTAÑA;
                case 10 ->
                    tipoActividad = ActividadDeportiva.RAQUETA;
                default ->
                    System.out.println("Valor introducido erroneo");
            }
        }while(actividad>10);
        System.out.println("Distancia del reto en km:");
        double km = new Scanner(System.in).nextDouble();
        System.out.println("Desnivel positivo:");
        double desPos = new Scanner(System.in).nextDouble();//null
        System.out.println("Desnivel negativo:");
        double desNeg = new Scanner(System.in).nextDouble();//null
        System.out.println("Desea introducir periodo de realizacion?(Si/No)");
        String validacion = new Scanner(System.in).nextLine();
        String periodoRe = null;
        if (validacion.equalsIgnoreCase("si")) {
            System.out.println("Periodo de realizacion:");
            periodoRe = new Scanner(System.in).nextLine();
        }
        //dificultad y comentario
        return r;
    }
    public void realizarReto(){
        
    }
    public void valorarReto(){
        
    }
}

