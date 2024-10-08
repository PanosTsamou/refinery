package tsamou.refinery.models.tools;

import jakarta.persistence.*;
import tsamou.refinery.models.ToolBox;

import java.util.List;

@Entity
@Table (name = "drills")
public class Drill  extends Tools{


    @Column (name = "type")
    private String type;

    @Column (name = "material")
    private String material;

    @Column (name = "surface")
    private String surface;

    @Column (name = "cut_length")
    private Float cutLength;

    @Column (name = "overall_length")
    private Float Length;

    @Column (name = "size")
    private Float size;

    @Column (name = "set")
    private Boolean set;

    public Drill() {
    }

    public Drill(Long serialNum, String brand, String name, String madeIn, List<ToolBox> toolBoxes, String type, String material, String surface, Float cutLength, Float length, Float size, Boolean set) {
        super(serialNum, brand, name, madeIn, toolBoxes);
        this.type = type;
        this.material = material;
        this.surface = surface;
        this.cutLength = cutLength;
        Length = length;
        this.size = size;
        this.set = set;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public Float getCutLength() {
        return cutLength;
    }

    public void setCutLength(Float cutLength) {
        this.cutLength = cutLength;
    }

    public Float getLength() {
        return Length;
    }

    public void setLength(Float length) {
        Length = length;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public Boolean getSet() {
        return set;
    }

    public void setSet(Boolean set) {
        this.set = set;
    }
}
