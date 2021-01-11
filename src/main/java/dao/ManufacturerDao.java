package dao;

import Storage.Storage;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import model.Manufacturer;

public class ManufacturerDao implements ManufacturerDaoIntf {
    @Override
    public void add(Manufacturer manufacturer) {
        Storage.addManufacturer(manufacturer);
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
    public void update(Long id, Manufacturer manufacturer) {
        Storage.storage.replace(id, manufacturer);
    }
    
    @Override
    public void delete(Long id) {
        Storage.storage.remove(id);
    }
    
    @Override
    public void delete(Manufacturer manufacturer) {
        Optional<Manufacturer> first = Storage.storage.values().stream()
                .filter(m -> m.equals(manufacturer))
                .findFirst();
        first.ifPresent(value -> Storage.storage.remove(value.getId()));
    }
}
