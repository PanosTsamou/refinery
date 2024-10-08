package tsamou.refinery.models.piping;

import jakarta.persistence.*;

@Entity
@Table (name = "pipes")
public class Pipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "serial_number")
    private Long serialNum;

    @Column (name = "brand")
    private String brand;

    @Column (name = "made_in")
    private String madeIn;

    @Column (name = "material")
    private String material;

    @Column (name = "diameter")
    private Float diameter;

    @Column (name = "thikness")
    private Float thickness;

    @Column (name = "img")
    private  String img;

    public Pipe() {
    }

    public Pipe(Long serialNum, String brand, String madeIn, String material, Float diameter, Float thickness, String img) {
        this.serialNum = serialNum;
        this.brand = brand;
        this.madeIn = madeIn;
        this.material = material;
        this.diameter = diameter;
        this.thickness = thickness;
        this.img = img;
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

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Float getDiameter() {
        return diameter;
    }

    public void setDiameter(Float diameter) {
        this.diameter = diameter;
    }

    public Float getThickness() {
        return thickness;
    }

    public void setThickness(Float thickness) {
        this.thickness = thickness;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
