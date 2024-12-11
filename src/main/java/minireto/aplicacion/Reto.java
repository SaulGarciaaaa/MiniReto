/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minireto.aplicacion;

import java.time.LocalDateTime;

/**
 *
 * @author DAM125
 */
public class Reto {
    private int nReto;// Es autoincrementado, vamos que si se crean 4 retos pues el ultimo sera nReto=3
    private Usuario creador;
    private String nombreReto;
    private LocalDateTime dateTimeCreacion;
    private ActividadDeportiva tipo;
    private double distancia;
    private double desnivelNegativo;
    private double desnivelPositivo;//desnivel validir con condicional
    private String periodoRealizacion; // No esta mal, se pide un texto
    private String comentario;
    private Waypoint[] puntosPaso;
    private int[] valoraciones;
    private int contadorWaypoint;    

    public Reto(int nReto, Usuario creador, String nombreReto, LocalDateTime dateTimeCreacion, ActividadDeportiva tipo, double distancia, double desnivelNegativo, double desnivelPositivo, String periodoRealizacion, String comentario, Waypoint[] puntosPaso, int[] valoraciones, int contadorWaypoint) {
        this.nReto = nReto;
        this.creador = creador;
        this.nombreReto = nombreReto;
        this.dateTimeCreacion = dateTimeCreacion;
        this.tipo = tipo;
        this.distancia = distancia;
        this.periodoRealizacion = periodoRealizacion;
        this.comentario = comentario;
        this.puntosPaso = puntosPaso;
        this.valoraciones = valoraciones;
        this.contadorWaypoint = contadorWaypoint;
        contadorWaypoint++;
        if(desnivelNegativo<=0){
            this.desnivelNegativo=desnivelNegativo;
        }else{
            this.desnivelNegativo=0;
        }
        if(desnivelPositivo>=0){
            this.desnivelPositivo=desnivelPositivo;
        }else{
            this.desnivelPositivo=0;
        }
    }
  
    public void registraInfoWaypoints(){
        Scanner teclado= new Scanner(System.in);
        
        System.out.println(" indica el tipo de waypont o punto de control: ");
        String tipo= teclado.nextLine();
        System.out.println(" escribe el nombre de waypont: ");
        String nombre= teclado.nextLine();
           System.out.println("indica a que distancia se encuentra del inicio el waypoint: ");
        double distancia=teclado.nextDouble();
        System.out.println(" indica el reto: ");
        String reto= teclado.nextLine();
           
        System.out.println(" indica la latitud: ");
        double latitud= teclado.nextDouble();
        System.out.println(" indica la longitud: ");
        double longitud= teclado.nextDouble();
        Waypoint waypoint= new Waypoint(this.contadorWaypoint,reto,nombre,distancia,tipo,latitud,longitud);
    }

}
