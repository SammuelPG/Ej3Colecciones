/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author dam
 */
public class usuario {
    String nombre;
    String contrasena;
    String tipo;

    public usuario(String nombre, String contrasena, String tipo) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getTipo() {
        return tipo;
    }
  
}
