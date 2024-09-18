package tsamou.refinery.models;

import jakarta.persistence.*;

@Entity
@Table (name = "Working_Orders")
public class WorkingOrder {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "Id")
    private Long Id;

    @Column (name = "order_number")
    private Long orderNumber;

    @Column (name = "title")
    private String title;

    @Column (name = "date")
    private String date;

    @Column (name = "description")
    private String description;

    @ManyToOne
    @JoinColumn (name = "ordered_employee_id")
    private Employee orderBy;

    @ManyToOne
    @JoinColumn (name = "department_id")
    private Department department;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "work_permit_id")
    private WorkPermit workPermit;

    public WorkingOrder() {
    }

    public WorkingOrder(Long orderNumber, String title, String date, String description, Employee orderBy, Department department, WorkPermit workPermit) {
        this.orderNumber = orderNumber;
        this.title = title;
        this.date = date;
        this.description = description;
        this.orderBy = orderBy;
        this.department = department;
        this.workPermit = workPermit;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Employee getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Employee orderBy) {
        this.orderBy = orderBy;
    }

    public WorkPermit getWorkPermit() {
        return workPermit;
    }

    public void setWorkPermit(WorkPermit workPermit) {
        this.workPermit = workPermit;
    }
}
