/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minireto.aplicacion;

/**
 *
 * @author DAM125
 */
public class Waypoint {
    private int numeroWaypoint; //Segun el numero de puntos que se han creado anteriormente podria ser 300
    private String reto;
    private String nombreReto;
    private double distanciaInicio;
    private String tipo;//Puente, collado, rio....
    private double latitud;
    private double longitud;

    public Waypoint(int numeroWaypoint, String reto, String nombre, double distanciaInicio, String tipo, double latitud, double longitud) {
        this.numeroWaypoint = numeroWaypoint;
        this.reto = reto;
        this.nombreReto = nombre;
        this.distanciaInicio = distanciaInicio;
        this.tipo = tipo;
        this.latitud= latitud;
        this.longitud= longitud;
    }

    public String getNombreReto() {
        return nombreReto;
    }
    
    @Override
    public String toString(){
    
    return String.format("WAYPOINT:%d %nNombre: %s Tipo: %s %n\tDistancia del inicio: %,.2f Coordenadas: %dlongitud %dlatitud ",numeroWaypoint,nombreReto,tipo, distanciaInicio,longitud,latitud);
    
    }
