package service;

import java.util.List;
import java.util.Optional;
import model.Manufacturer;

public interface ManufacturerServiceIntf {
    Manufacturer add(Manufacturer manufacturer);
    
    Manufacturer get(Long id);
    
    List<Manufacturer> getAll();
    
    Manufacturer update(Long id, Manufacturer manufacturer);
    
    Manufacturer delete(Long id);
    
    Manufacturer delete(Manufacturer manufacturer);
}
