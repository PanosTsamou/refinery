package tsamou.refinery.models;

import jakarta.persistence.*;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "staff_power")
    private Integer staff_power;

    public Department() {
    }

    public Department(String name, Integer staff_power) {
        this.name = name;
        this.staff_power = staff_power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStaff_power() {
        return staff_power;
    }

    public void setStaff_power(Integer staff_power) {
        this.staff_power = staff_power;
    }
}
