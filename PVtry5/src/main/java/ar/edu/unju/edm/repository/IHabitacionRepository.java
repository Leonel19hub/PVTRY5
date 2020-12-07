package ar.edu.unju.edm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.model.Habitacion;

@Repository
public interface IHabitacionRepository extends CrudRepository<Habitacion,Integer>{
    
    @Query("from room e order by e.Iduser")
    public Habitacion findByIduser(int iduser);
    public List<Habitacion> buscarHabitacion();
}
