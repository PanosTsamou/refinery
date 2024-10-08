package tsamou.refinery.models.tools;

import jakarta.persistence.*;
import tsamou.refinery.models.ToolBox;

import java.util.List;

@Entity
@Table (name = "hacksaws")
public class Hacksaw extends Tools{


    @Column (name = "type")
    private String type;

    @Column (name = "material")
    private String material;

    @Column (name = "blade_material")
    private String bladeMat;

    @Column (name = "surface")
    private String surface;

    @Column (name = "foldable")
    private Boolean foldable;

    @Column (name = "electric")
    private Boolean electric;

    @Column (name = "corded")
    private Boolean corded;

    public Hacksaw() {
    }

    public Hacksaw(Long serialNum, String brand, String name, String madeIn, List<ToolBox> toolBoxes, String type, String material, String bladeMat, String surface, Boolean foldable, Boolean electric, Boolean corded) {
        super(serialNum, brand, name, madeIn, toolBoxes);
        this.type = type;
        this.material = material;
        this.bladeMat = bladeMat;
        this.surface = surface;
        this.foldable = foldable;
        this.electric = electric;
        this.corded = corded;
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

    public String getBladeMat() {
        return bladeMat;
    }

    public void setBladeMat(String bladeMat) {
        this.bladeMat = bladeMat;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public Boolean getFoldable() {
        return foldable;
    }

    public void setFoldable(Boolean foldable) {
        this.foldable = foldable;
    }

    public Boolean getElectric() {
        return electric;
    }

    public void setElectric(Boolean electric) {
        this.electric = electric;
    }

    public Boolean getCorded() {
        return corded;
    }

    public void setCorded(Boolean corded) {
        this.corded = corded;
    }
}
