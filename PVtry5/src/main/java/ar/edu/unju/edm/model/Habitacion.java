package ar.edu.unju.edm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Habitacion implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "idHabitacion", nullable = false)
    private int numHabitacion;

    @Column(name = "DetalleHabitacion", nullable = false)
    private String detalleHabitacion;

    @Column(name = "Precio", nullable = false)
    private double precio;

    @Column(name = "Disponibilidad", nullable = false)
    private boolean disponibilidad;

    @Column(name = "TipoUsuario", nullable = false)
    private String tipoHabitacion;


    public Habitacion() {
    }

    public Habitacion(int numHabitacion, String detalleHabitacion, double precio, boolean disponibilidad, String tipoHabitacion) {
        this.numHabitacion = numHabitacion;
        this.detalleHabitacion = detalleHabitacion;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getNumHabitacion() {
        return this.numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String getDetalleHabitacion() {
        return this.detalleHabitacion;
    }

    public void setDetalleHabitacion(String detalleHabitacion) {
        this.detalleHabitacion = detalleHabitacion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return this.disponibilidad;
    }

    public boolean getDisponibilidad() {
        return this.disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getTipoHabitacion() {
        return this.tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    @Override
    public String toString() {
        return "{" +
            " numHabitacion='" + getNumHabitacion() + "'" +
            ", detalleHabitacion='" + getDetalleHabitacion() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", disponibilidad='" + isDisponibilidad() + "'" +
            ", tipoHabitacion='" + getTipoHabitacion() + "'" +
            "}";
    }

    
}
