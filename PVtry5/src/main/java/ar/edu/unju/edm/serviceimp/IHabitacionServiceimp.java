package ar.edu.unju.edm.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.edm.model.Habitacion;
import ar.edu.unju.edm.repository.IHabitacionRepository;
import ar.edu.unju.edm.service.IHabitacionService;

public class IHabitacionServiceimp implements IHabitacionService {

    private Habitacion auxHabitacion = new Habitacion();
    @Autowired
    private IHabitacionRepository ihabitacionrepository;

    @Override
    public void guardarHabitacion(Habitacion habitacion) {
        ihabitacionrepository.save(habitacion);
        auxHabitacion = habitacion;

    }

    @Override
    public List<Habitacion> buscarTodasHabitacion() {
        return ihabitacionrepository.buscarHabitacion();
    }

    @Override
    public Habitacion conseguirHabitacion(Habitacion habitacion) {
        return auxHabitacion;
    }

    @Override
    public void guardarEncontrado(Habitacion habitacion) {
        auxHabitacion = habitacion;
    }

    @Override
    public Habitacion obtenerHabitacion(int numHabitacion) throws Exception {
        return ihabitacionrepository.findByIduser(numHabitacion);//no se puede el orelsethrow
        // orElseThrow(()-> new Exception("La habitacion no existe"));
    }

    @Override
    public int retornarId(Habitacion habitacion) {
        return habitacion.getNumHabitacion();
    }

    @Override
    public void eliminarHabitacion() {
        auxHabitacion = new Habitacion();
    }
    
}
