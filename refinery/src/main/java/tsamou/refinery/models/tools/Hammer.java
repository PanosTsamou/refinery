package tsamou.refinery.models.tools;

import jakarta.persistence.*;
import tsamou.refinery.models.ToolBox;

import java.util.List;

@Entity
@Table (name = "hammers")
public class Hammer extends Tools{

    @Column (name = "type")
    private String type;

    @Column (name = "weight")
    private Float weight;

    @Column (name = "material")
    private String material;

    public Hammer() {
    }

    public Hammer(Long serialNum, String brand, String name, String madeIn, List<ToolBox> toolBoxes, String type, Float weight, String material) {
        super(serialNum, brand, name, madeIn, toolBoxes);
        this.type = type;
        this.weight = weight;
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
