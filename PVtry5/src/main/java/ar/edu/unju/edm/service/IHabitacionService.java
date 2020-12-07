package ar.edu.unju.edm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Habitacion;

@Service
public interface IHabitacionService {
    
    public void guardarHabitacion(Habitacion habitacion);
    public List<Habitacion> buscarTodasHabitacion();
    public Habitacion conseguirHabitacion(Habitacion habitacion); 
    public void guardarEncontrado(Habitacion habitacion); 
    public Habitacion obtenerHabitacion(int numHabitacion) throws Exception;
    public int retornarId(Habitacion habitacion);
    public void eliminarHabitacion();
    
}
