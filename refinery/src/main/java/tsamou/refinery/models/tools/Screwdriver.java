package tsamou.refinery.models.tools;

import jakarta.persistence.*;
import tsamou.refinery.models.ToolBox;

import java.util.List;

@Entity
@Table (name = "screwdrivers")
public class Screwdriver extends Tools{

    @Column (name = "head_style")
    private String headStyle;

    @Column (name = "material")
    private String material;

    @Column (name = "length")
    private Float length;

    @Column (name = "head_size")
    private Float headSize;

    @Column (name = "set")
    private Boolean set;

    @Column (name = "magnetic")
    private Boolean magnetic;

    @Column (name = "rotating_cap")
    private Boolean rotatingCap;

    @Column (name = "insulated")
    private Boolean insulated;

    @Column (name = "adjustable_torque")
    private Boolean adjTorque;

    @Column (name = "electric_current_checker")
    private Boolean electricChecker;

    public Screwdriver() {
    }

    public Screwdriver(Long serialNum, String brand, String name, String madeIn, List<ToolBox> toolBoxes, String headStyle, String material, Float length, Float headSize, Boolean set, Boolean magnetic, Boolean rotatingCap, Boolean insulated, Boolean adjTorque, Boolean electricChecker) {
        super(serialNum, brand, name, madeIn, toolBoxes);
        this.headStyle = headStyle;
        this.material = material;
        this.length = length;
        this.headSize = headSize;
        this.set = set;
        this.magnetic = magnetic;
        this.rotatingCap = rotatingCap;
        this.insulated = insulated;
        this.adjTorque = adjTorque;
        this.electricChecker = electricChecker;
    }
    public String getHeadStyle() {
        return headStyle;
    }

    public void setHeadStyle(String headStyle) {
        this.headStyle = headStyle;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Float getHeadSize() {
        return headSize;
    }

    public void setHeadSize(Float headSize) {
        this.headSize = headSize;
    }

    public Boolean getSet() {
        return set;
    }

    public void setSet(Boolean set) {
        this.set = set;
    }

    public Boolean getMagnetic() {
        return magnetic;
    }

    public void setMagnetic(Boolean magnetic) {
        this.magnetic = magnetic;
    }

    public Boolean getRotatingCap() {
        return rotatingCap;
    }

    public void setRotatingCap(Boolean rotatingCap) {
        this.rotatingCap = rotatingCap;
    }

    public Boolean getInsulated() {
        return insulated;
    }

    public void setInsulated(Boolean insulated) {
        this.insulated = insulated;
    }

    public Boolean getAdjTorque() {
        return adjTorque;
    }

    public void setAdjTorque(Boolean adjTorque) {
        this.adjTorque = adjTorque;
    }

    public Boolean getElectricChecker() {
        return electricChecker;
    }

    public void setElectricChecker(Boolean electricChecker) {
        this.electricChecker = electricChecker;
    }

}
