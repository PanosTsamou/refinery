package tsamou.refinery.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Meters")
public class Meter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Brand")
    private String brand;

    @Column (name = "Model")
    private String model;

    @Column (name = "Type")
    private String type;

    @Column (name = "Kind")
    private String kind;

    @Column (name = "Year")
    private Integer year;

    @Column(name = "Status")
    private String status;

    @Column (name = "Value")
    private Double value;

    @Column (name = "Stock")
    private boolean stock;

    @Column (name = "Stock_Level")
    private Integer stock_level;

    public Meter() {
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public Integer getStock_level() {
        return stock_level;
    }

    public void setStock_level(Integer stock_level) {
        this.stock_level = stock_level;
    }

    public Meter(String name, String brand, String model, String type, String kind, Integer year, String status, Double value, boolean stock, Integer stock_level) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.kind = kind;
        this.year = year;
        this.status = status;
        this.value = value;
        this.stock = stock;
        this.stock_level = stock_level;
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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
