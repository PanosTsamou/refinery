package tsamou.refinery.models;

import jakarta.persistence.*;

import java.util.List;

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

    @OneToMany (mappedBy = "department")
    private List <Employee> employees;

    @OneToMany (mappedBy = "department")
    private List <WorkingOrder> workingOrders;

    public Department() {
    }

    public Department(String name, Integer staff_power, List<Employee> employees, List<WorkingOrder> workingOrders) {
        this.name = name;
        this.staff_power = staff_power;
        this.employees = employees;
        this.workingOrders = workingOrders;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
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

    public Integer getStaff_power() {
        return staff_power;
    }

    public void setStaff_power(Integer staff_power) {
        this.staff_power = staff_power;
    }

    public List<WorkingOrder> getWorkingOrders() {
        return workingOrders;
    }

    public void setWorkingOrders(List<WorkingOrder> workingOrders) {
        this.workingOrders = workingOrders;
    }
}
