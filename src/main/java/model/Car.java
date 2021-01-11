package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    private Long id;
    private String model;
    private Manufacturer manufacturer;
    private List<Driver> driverList;
    
    public Car(String model, Manufacturer manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
    
    public void addDriver(Driver driver) {
        if (driverList == null) {
            driverList = new ArrayList<>();
        }
        driverList.add(driver);
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public Manufacturer getManufacturer() {
        return manufacturer;
    }
    
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public List<Driver> getDriverList() {
        return driverList;
    }
    
    public void setDriverList(List<Driver> driverList) {
        this.driverList = driverList;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(model, car.model)
               && Objects.equals(manufacturer, car.manufacturer)
               && Objects.equals(driverList, car.driverList);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(model, manufacturer, driverList);
    }
}
