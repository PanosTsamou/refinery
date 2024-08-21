package tsamou.refinery.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Actuators")
public class Actuator {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column (name = "Id")
    public Long id;

    @Column (name = "Name")
    public String name;

    @Column (name = "Brand")
    public String brand;

    @Column (name = "Model")
    public String model;

    @Column (name = "Type")
    public String type;

    @Column (name = "Year")
    public Integer Year;

    @Column (name = "Stocking")
    public Boolean stocking;

    @Column (name = "Stock_Level")
    public Boolean stockLevel;

    @Column (name = "Value")
    public Boolean value;

    public Actuator() {
    }

    public Actuator(String name, String brand, String model, String type, Integer year, Boolean stocking, Boolean stockLevel, Boolean value) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.type = type;
        Year = year;
        this.stocking = stocking;
        this.stockLevel = stockLevel;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer year) {
        Year = year;
    }

    public Boolean getStocking() {
        return stocking;
    }

    public void setStocking(Boolean stocking) {
        this.stocking = stocking;
    }

    public Boolean getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(Boolean stockLevel) {
        this.stockLevel = stockLevel;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }
}
