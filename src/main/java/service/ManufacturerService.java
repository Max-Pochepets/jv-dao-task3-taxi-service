package service;

import dao.ManufacturerDao;
import java.util.List;
import lib.Inject;
import lib.Service;
import model.Manufacturer;

@Service
public class ManufacturerService implements ManufacturerServiceIntf {
    
    @Inject
    ManufacturerDao dao;
    
    @Override
    public Manufacturer add(Manufacturer manufacturer) {
        return dao.add(manufacturer);
    }
    
    @Override
    public Manufacturer get(Long id) {
        return dao.get(id).get();
    }
    
    @Override
    public List<Manufacturer> getAll() {
        return dao.getAll();
    }
    
    @Override
    public Manufacturer update(Long id, Manufacturer manufacturer) {
        return dao.update(id, manufacturer);
    }
    
    @Override
    public Manufacturer delete(Long id) {
        return dao.delete(id);
    }
    
    @Override
    public Manufacturer delete(Manufacturer manufacturer) {
        return dao.delete(manufacturer);
    }
}
