package tsamou.refinery.models.fasteners;

import jakarta.persistence.*;

@Entity
@Table (name = "nuts")
public class Nuts {

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

    @Column (name = "style")
    private String style;


    @Column (name = "material")
    private String material;

    @Column (name = "exterior_finish")
    private String exteriorFin;

    @Column (name = "height")
    private Float height;

    @Column (name = "thread_size")
    private String size;


    @Column (name = "package")
    private Boolean box;

    @Column (name = "package_size")
    private Integer boxSize;

    @Column (name = "img")
    private String img;

    public Nuts() {
    }

    public Nuts(Long serialNum, String brand, String name, String madeIn, String style, String material, String exteriorFin, Float height, String size, Boolean box, Integer boxSize, String img) {
        this.serialNum = serialNum;
        this.brand = brand;
        this.name = name;
        this.madeIn = madeIn;
        this.style = style;
        this.material = material;
        this.exteriorFin = exteriorFin;
        this.height = height;
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

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
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

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
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
