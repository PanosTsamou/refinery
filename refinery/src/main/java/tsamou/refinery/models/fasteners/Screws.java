package tsamou.refinery.models.fasteners;

import jakarta.persistence.*;
import org.hibernate.Length;

@Entity
@Table (name = "screws")
public class Screws {

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

    @Column (name = "head_style")
    private String headStyle;

    @Column (name = "drive_style")
    private String driveStyle;

    @Column (name = "material")
    private String material;

    @Column (name = "exterior_finish")
    private String exteriorFin;

    @Column (name = "length")
    private Float length;

    @Column (name = "thread_size")
    private String size;


    @Column (name = "package")
    private Boolean box;

    @Column (name = "package_size")
    private Integer boxSize;

    @Column (name = "img")
    private String img;

    public Screws() {
    }

    public Screws(Long serialNum, String brand, String name, String madeIn, String headStyle, String driveStyle, String material, String exteriorFin, Float length, String size, Boolean box, Integer boxSize, String img) {
        this.serialNum = serialNum;
        this.brand = brand;
        this.name = name;
        this.madeIn = madeIn;
        this.headStyle = headStyle;
        this.driveStyle = driveStyle;
        this.material = material;
        this.exteriorFin = exteriorFin;
        this.length = length;
        this.size = size;
        this.box = box;
        this.boxSize = boxSize;
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

    public String getHeadStyle() {
        return headStyle;
    }

    public void setHeadStyle(String headStyle) {
        this.headStyle = headStyle;
    }

    public String getDriveStyle() {
        return driveStyle;
    }

    public void setDriveStyle(String driveStyle) {
        this.driveStyle = driveStyle;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getExteriorFin() {
        return exteriorFin;
    }

    public void setExteriorFin(String exteriorFin) {
        this.exteriorFin = exteriorFin;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Boolean getBox() {
        return box;
    }

    public void setBox(Boolean box) {
        this.box = box;
    }

    public Integer getBoxSize() {
        return boxSize;
    }

    public void setBoxSize(Integer boxSize) {
        this.boxSize = boxSize;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
