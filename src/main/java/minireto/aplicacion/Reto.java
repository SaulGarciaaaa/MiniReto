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
    private double desnivelPositivo;
    private String periodoRealizacion; // No esta mal, se pide un texto
    private String comentario;
    private Waypoint[] puntosPaso;
    private int[] valoraciones;
}
