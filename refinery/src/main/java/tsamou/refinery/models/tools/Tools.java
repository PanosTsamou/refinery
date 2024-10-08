package tsamou.refinery.models.tools;

import jakarta.persistence.*;
import tsamou.refinery.models.ToolBox;

import java.util.List;

@Entity
@Inheritance (strategy = InheritanceType.JOINED)
public class Tools {
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

    @ManyToMany (mappedBy = "tools")
    private List<ToolBox> toolBoxes;

    public Tools() {
    }

    public Tools(Long serialNum, String brand, String name, String madeIn, List<ToolBox> toolBoxes) {
        this.serialNum = serialNum;
        this.brand = brand;
        this.name = name;
        this.madeIn = madeIn;
        this.toolBoxes = toolBoxes;
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

    public List<ToolBox> getToolBoxes() {
        return toolBoxes;
    }

    public void setToolBoxes(List<ToolBox> toolBoxes) {
        this.toolBoxes = toolBoxes;
    }
}
