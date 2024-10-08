package tsamou.refinery.models.tools;

import jakarta.persistence.*;
import tsamou.refinery.models.ToolBox;

import java.util.List;

@Entity
@Table (name = "pliers")
public class Pliers extends Tools{

    @Column (name = "type")
    private String type;

    public Pliers() {
    }

    public Pliers(Long serialNum, String brand, String name, String madeIn, List<ToolBox> toolBoxes, String type) {
        super(serialNum, brand, name, madeIn, toolBoxes);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
