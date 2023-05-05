/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author dam
 */
public class Parada {
    int codigo;
    String denominacion;
    int frecuencia;
    String primera;
    String ultima;

    public Parada(int codigo, String denominacion) {
        this.codigo = codigo;
        this.denominacion = denominacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Parada other = (Parada) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
}
