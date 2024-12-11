/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minireto.aplicacion;

import java.time.LocalDate;

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
    private enum genero{
        Hombre,Mujer,Otro
    };

    public Usuario(String nombre, String apellido1, String apellido2, String email, LocalDate fechanac, String provincia,int numgen) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.fechanac = fechanac;
        this.provincia = provincia;
        genero gen=genero.Hombre;
        if (numgen==2) {
         gen=genero.Mujer;
        }else if (numgen==3){
            gen=genero.Otro;
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
    
            
}

