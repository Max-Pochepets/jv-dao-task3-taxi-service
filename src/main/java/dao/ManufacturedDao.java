package dao;

import java.util.List;
import java.util.Optional;
import model.Manufacturer;

public interface ManufacturedDao {
    void add(Manufacturer manufacturer);
    
    Optional<Manufacturer> get(Long id);
    
    List<Manufacturer> getAll();
    
    void update(Long id);
    
    void update(Manufacturer manufacturer);
    
    void delete(Long id);
    
    void delete(Manufacturer manufacturer);
}
