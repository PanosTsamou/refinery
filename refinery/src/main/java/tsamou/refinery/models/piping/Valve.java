package tsamou.refinery.models.piping;

import jakarta.persistence.*;

@Entity
@Table (name = "valves")
public class Valve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "serial_number")
    private Long serialNum;

    @Column (name = "brand")
    private String brand;

    @Column (name = "model_name")
    private String name;

    @Column (name = "made_in")
    private String madeIn;

    @Column (name = "type")
    private String type;

    @Column (name = "diameter")
    private Double diameter;

    @Column (name = "body_material")
    private String bodyMaterial;

    @Column (name = "seal_material")
    private String sealMaterial;

    @Column (name = "connection")
    private String connection;

    public Valve() {
    }

    public Valve(Long serialNum, String brand, String name, String madeIn, String type, Double diameter, String bodyMaterial, String sealMaterial, String connection) {
        this.serialNum = serialNum;
        this.brand = brand;
        this.name = name;
        this.madeIn = madeIn;
        this.type = type;
        this.diameter = diameter;
        this.bodyMaterial = bodyMaterial;
        this.sealMaterial = sealMaterial;
        this.connection = connection;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Long serialNum) {
        this.serialNum = serialNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public String getSealMaterial() {
        return sealMaterial;
    }

    public void setSealMaterial(String sealMaterial) {
        this.sealMaterial = sealMaterial;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }
}
