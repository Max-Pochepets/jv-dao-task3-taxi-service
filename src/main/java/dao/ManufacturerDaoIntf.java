package dao;

import java.util.List;
import java.util.Optional;
import model.Manufacturer;

public interface ManufacturerDaoIntf {
    Manufacturer add(Manufacturer manufacturer);
    
    Optional<Manufacturer> get(Long id);
    
    List<Manufacturer> getAll();
    
    Manufacturer update(Long id, Manufacturer manufacturer);

    Manufacturer delete(Long id);
    
    Manufacturer delete(Manufacturer manufacturer);
}
