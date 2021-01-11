package Storage;

import java.util.HashMap;
import java.util.Map;
import model.Manufacturer;

public class Storage {
    private static Long id;
    
    public static final Map<Long, Manufacturer> storage = new HashMap<>();
    
    public static void addManufacturer(Manufacturer manufacturer) {
        manufacturer.setId(id);
        storage.put(id++, manufacturer);
    }
}
