package tsamou.refinery.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "Section")
public class Section {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name =  "Id")
    private Long id;

    @Column (name =  "Name")
    private String name;

    @OneToMany (mappedBy = "section")
    private List<Actuator> actuators;

    @OneToMany (mappedBy = "section")
    private List<Tank> tanks;

    @OneToMany (mappedBy = "section")
    private List<Meter> meters;

    @ManyToOne
    @JoinColumn (name = "unit_id")
    private Unit unit;

    public Section() {
    }

    public Section(String name, List<Actuator> actuators, List<Tank> tanks, List<Meter> meters, Unit unit) {
        this.name = name;
        this.actuators = actuators;
        this.tanks = tanks;
        this.meters = meters;
        this.unit = unit;
    }

    public Section(String name) {
        this.name = name;
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

    public List<Actuator> getActuators() {
        return actuators;
    }

    public void setActuators(List<Actuator> actuators) {
        this.actuators = actuators;
    }

    public List<Tank> getTanks() {
        return tanks;
    }

    public void setTanks(List<Tank> tanks) {
        this.tanks = tanks;
    }

    public List<Meter> getMeters() {
        return meters;
    }

    public void setMeters(List<Meter> meters) {
        this.meters = meters;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
