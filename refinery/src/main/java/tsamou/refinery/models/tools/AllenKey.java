package tsamou.refinery.models.tools;

import jakarta.persistence.*;

@Entity
@Table (name = "allen_keys")
public class AllenKey  extends Tools{

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

    @Column (name = "size")
    private String size;

    @Column (name = "set")
    private Boolean set;

    public AllenKey() {
    }

    public AllenKey(Long serialNum, String brand, String name, String madeIn, String headStyle, Boolean set) {
        this.serialNum = serialNum;
        this.brand = brand;
        this.name = name;
        this.madeIn = madeIn;
        this.headStyle = headStyle;
        this.set = set;
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

    public Boolean getSet() {
        return set;
    }

    public void setSet(Boolean set) {
        this.set = set;
    }
}
