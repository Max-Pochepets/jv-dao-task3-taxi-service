package dao;

import Storage.Storage;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lib.Dao;
import model.Manufacturer;

@Dao
public class ManufacturerDao implements ManufacturerDaoIntf {
    @Override
    public Manufacturer add(Manufacturer manufacturer) {
        Storage.addManufacturer(manufacturer);
        return manufacturer;
    }
    
    @Override
    public Optional<Manufacturer> get(Long id) {
        return Optional.ofNullable(Storage.storage.get(id));
    }
    
    @Override
    public List<Manufacturer> getAll() {
        return new ArrayList<>(Storage.storage.values());
    }
    
    @Override
    public Manufacturer update(Long id, Manufacturer manufacturer) {
        Manufacturer oldValue = Storage.storage.get(id);
        Storage.storage.replace(id, manufacturer);
        return oldValue;
    }
    
    @Override
    public Manufacturer delete(Long id) {
        return Storage.storage.remove(id);
    }
    
    @Override
    public Manufacturer delete(Manufacturer manufacturer) {
        return delete(manufacturer.getId());
    }
}
