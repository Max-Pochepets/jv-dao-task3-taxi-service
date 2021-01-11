package model;

import java.util.List;

public class Car {
    private Long id;
    private String model;
    private Manufacturer manufacturer;
    private List<Driver> driverList;
    
    public Car(String model, Manufacturer manufacturer, List<Driver> driverList) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.driverList = driverList;
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
}