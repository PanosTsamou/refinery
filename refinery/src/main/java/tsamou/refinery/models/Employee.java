package tsamou.refinery.models;


import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Id_number")
    private String id_number;

    @Column(name =  "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "full_name")
    private String full_name;

    @Column(name = "age")
    private Integer age;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "address_id")
    private Address address;

    @Column(name = "office_phone_number")
    private String office_phone_number;

    @Column(name = "personal_phone_number")
    private String personal_phone_number;

    @Column(name = "working_role")
    private String working_role;

    @Column(name = "working_status")
    private Boolean working_status;

    @ManyToOne
    @JoinColumn (name = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn (name = "unit_id")
    private Unit unit;

    @ManyToMany
    @JoinTable(
            name = "toolbox",
            joinColumns = @JoinColumn (name = "employee_id"),
            inverseJoinColumns = @JoinColumn (name = "tool_id")
    )
    private List<Tools> tools;

    @OneToMany (mappedBy = "orderBy")
    private List<WorkingOrder> working_orders;

    @OneToMany (mappedBy = "applicant")
    private List<WorkPermit> work_permits;

    @OneToMany (mappedBy = "authorizer")
    private List <WorkPermitApprovals> approvals;

    public Employee() {
    }

    public Employee(String id_number, String first_name, String last_name, String full_name, Integer age, Address address, String office_phone_number, String personal_phone_number, String working_role, Boolean working_status, Department department, Unit unit, List<Tools> tools, List<WorkingOrder> working_orders, List<WorkPermit> work_permits, List<WorkPermitApprovals> approvals) {
        this.id_number = id_number;
        this.first_name = first_name;
        this.last_name = last_name;
        this.full_name = full_name;
        this.age = age;
        this.address = address;
        this.office_phone_number = office_phone_number;
        this.personal_phone_number = personal_phone_number;
        this.working_role = working_role;
        this.working_status = working_status;
        this.department = department;
        this.unit = unit;
        this.tools = tools;
        this.working_orders = working_orders;
        this.work_permits = work_permits;
        this.approvals = approvals;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Tools> getTools() {
        return tools;
    }

    public void setTools(List<Tools> tools) {
        this.tools = tools;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_number() {
        return id_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getFull_name() {
        return full_name;
    }

    public Integer getAge() {
        return age;
    }


    public String getOffice_phone_number() {
        return office_phone_number;
    }

    public String getPersonal_phone_number() {
        return personal_phone_number;
    }

    public String getWorking_role() {
        return working_role;
    }

    public Boolean getWorking_status() {
        return working_status;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public void setOffice_phone_number(String office_phone_number) {
        this.office_phone_number = office_phone_number;
    }

    public void setPersonal_phone_number(String personal_phone_number) {
        this.personal_phone_number = personal_phone_number;
    }

    public void setWorking_role(String working_role) {
        this.working_role = working_role;
    }

    public void setWorking_status(Boolean working_status) {
        this.working_status = working_status;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public List<WorkingOrder> getWorking_orders() {
        return working_orders;
    }

    public void setWorking_orders(List<WorkingOrder> working_orders) {
        this.working_orders = working_orders;
    }

    public List<WorkPermit> getWork_permits() {
        return work_permits;
    }

    public void setWork_permits(List<WorkPermit> work_permits) {
        this.work_permits = work_permits;
    }

    public List<WorkPermitApprovals> getApprovals() {
        return approvals;
    }

    public void setApprovals(List<WorkPermitApprovals> approvals) {
        this.approvals = approvals;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
