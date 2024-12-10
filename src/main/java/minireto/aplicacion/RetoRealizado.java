/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minireto.aplicacion;

import java.time.LocalDateTime;

/**
 *
 * @author Pablo
 */
public class RetoRealizado {
    private String usuario;
    private String nombreReto; 
    private LocalDateTime inicio;
    private LocalDateTime finalizacion;
    private int tiempoMovimiento; //Creo que lo normal seria que almacenara minutos
    private int velocidadMedia;
    private String comentarios;

    public RetoRealizado(LocalDateTime inicio, LocalDateTime finalizacion, int tiempoMovimiento, int velocidadMedia, String comentarios) {
        this.inicio = inicio;
        this.finalizacion = finalizacion;
        this.tiempoMovimiento = tiempoMovimiento;
        this.velocidadMedia = velocidadMedia;
        this.comentarios = comentarios;
    }
    
    private void realizarReto(){
    
    
    
    }
    
    
    
}
