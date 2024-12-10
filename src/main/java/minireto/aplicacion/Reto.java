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

    enum actividadDeportiva {
        SENDERISMO, RUNNING, TRAILRUNNING, ALPINISMO, ESCALADA, BICICLETAMONTAÑA, BICICLETACARRETERA, DESCENSOMTB, ESQUIMONTAÑA, RAQUETA
    };

    enum nivelDificultad {
        EXTREMA, MUYDIFICIL, DIFICIL, NORMAL, FACIL
    };
    private int nReto;// Es autoincrementado, vamos que si se crean 4 retos pues el ultimo sera nReto=4
    private String creador;
    private String nombreReto;
    private LocalDateTime dateTimeCreacion;
    private actividadDeportiva tipo;
    private double distancia;
    private double desnivelNegativo;
    private double desnivelPositivo;
    private String periodoRealizacion; // No esta mal, se pide un texto
    private String comentario;
    private Waypoint[] puntosPaso;
}
