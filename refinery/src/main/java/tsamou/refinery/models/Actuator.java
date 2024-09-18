package tsamou.refinery.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Actuators")
public class Actuator {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column (name = "Id")
    private Long id;

    @Column (name = "Name")
    private String name;

    @Column (name = "Brand")
    private String brand;

    @Column (name = "Model")
    private String model;

    @Column (name = "Type")
    private String type;

    @Column (name = "Year")
    private Integer year;

    @Column (name = "Stocking")
    private Boolean stocking;

    @Column (name = "Stock_Level")
    private Integer stockLevel;

    @Column (name = "Value")
    private Integer value;

    @ManyToOne
    @JoinColumn (name = "section_id")
    private Section section;

    public Actuator() {
    }

    public Actuator(String name, String brand, String model, String type, Integer year, Boolean stocking, Integer stockLevel, Integer value, Section section) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.year = year;
        this.stocking = stocking;
        this.stockLevel = stockLevel;
        this.value = value;
        this.section = section;
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
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Boolean getStocking() {
        return stocking;
    }

    public void setStocking(Boolean stocking) {
        this.stocking = stocking;
    }

    public Integer getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(Integer stockLevel) {
        this.stockLevel = stockLevel;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }
}
