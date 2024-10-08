package tsamou.refinery.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "unit")
public class Unit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "number")
    private Integer number;

    @OneToMany (mappedBy = "unit")
    private List<Employee> employees;

    @OneToMany (mappedBy = "unit")
    private List<Section> sections;


    public Unit(){

    }


    public Unit(String name, Integer number, List<Employee> employees, List<Section> sections) {
        this.name = name;
        this.number = number;
        this.employees = employees;
        this.sections = sections;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }
}
