package tsamou.refinery.models.tools;

import jakarta.persistence.*;
import tsamou.refinery.models.ToolBox;

import java.util.List;

@Entity
@Table (name = "Files")
public class File extends Tools{


    @Column (name = "type")
    private String type;

    @Column (name = "metal_type")
    private String metal;

    @Column (name = "shape")
    private String shape;

    @Column (name = "length")
    private Float length;

    @Column (name = "width")
    private Float width;


    public File() {
    }

    public File(Long serialNum, String brand, String name, String madeIn, List<ToolBox> toolBoxes, String type, String metal, String shape, Float length, Float width) {
        super(serialNum, brand, name, madeIn, toolBoxes);
        this.type = type;
        this.metal = metal;
        this.shape = shape;
        this.length = length;
        this.width = width;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }
}
