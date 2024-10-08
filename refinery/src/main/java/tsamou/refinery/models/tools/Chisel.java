package tsamou.refinery.models.tools;

import jakarta.persistence.*;
import tsamou.refinery.models.ToolBox;

import java.util.List;

@Entity
@Table (name = "chisel")
public class Chisel extends Tools{

    @Column (name = "type")
    private String type;

    @Column (name = "blade_material")
    private String bladeMat;

    @Column (name = "handle_material")
    private String handleMat;

    @Column (name = "width")
    private Float width;

    public Chisel() {
    }

    public Chisel(Long serialNum, String brand, String name, String madeIn, List<ToolBox> toolBoxes, String type, String bladeMat, String handleMat, Float width) {
        super(serialNum, brand, name, madeIn, toolBoxes);
        this.type = type;
        this.bladeMat = bladeMat;
        this.handleMat = handleMat;
        this.width = width;
    }

    public String getBladeMat() {
        return bladeMat;
    }

    public void setBladeMat(String bladeMat) {
        this.bladeMat = bladeMat;
    }

    public String getHandleMat() {
        return handleMat;
    }

    public void setHandleMat(String handleMat) {
        this.handleMat = handleMat;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
