package tsamou.refinery.models;

import jakarta.persistence.*;

@Entity
@Table (name = "Tanks")
public class Tank {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "Id")
    private Long id;

    @Column (name = "Name")
    private String name;

    @Column (name = "Type")
    private String type;

    @Column (name = "Volume")
    private Double volume;

    @Column (name = "Storing")
    private String storing;

    public Tank() {
    }

    public Tank(String name, String type, Double volume, String storing) {
        this.name = name;
        this.type = type;
        this.volume = volume;
        this.storing = storing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public String getStoring() {
        return storing;
    }

    public void setStoring(String storing) {
        this.storing = storing;
    }
}
