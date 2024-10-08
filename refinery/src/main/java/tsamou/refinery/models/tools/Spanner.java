package tsamou.refinery.models.tools;

import jakarta.persistence.*;
import tsamou.refinery.models.ToolBox;

import java.util.List;

@Entity
@Table (name = "spanners")
public class Spanner extends Tools{


    @Column (name = "head_style")
    private String headStyle;

    @Column (name = "size")
    private String size;

    @Column (name = "set")
    private Boolean set;


    public Spanner() {
    }

    public Spanner(Long serialNum, String brand, String name, String madeIn, List<ToolBox> toolBoxes, String headStyle, String size, Boolean set) {
        super(serialNum, brand, name, madeIn, toolBoxes);
        this.headStyle = headStyle;
        this.size = size;
        this.set = set;
    }

    public String getHeadStyle() {
        return headStyle;
    }

    public void setHeadStyle(String headStyle) {
        this.headStyle = headStyle;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Boolean getSet() {
        return set;
    }

    public void setSet(Boolean set) {
        this.set = set;
    }

}
