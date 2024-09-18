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

    @ManyToOne
    @JoinColumn (name = "section_id")
    private Section section;

    public Tank() {
    }

    public Tank(String name, String type, Double volume, String storing, Section section) {
        this.name = name;
        this.type = type;
        this.volume = volume;
        this.storing = storing;
        this.section = section;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }
}
