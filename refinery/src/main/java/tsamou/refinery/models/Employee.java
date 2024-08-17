package tsamou.refinery.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
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

    @Column(name = "email_address")
    private String email_address;

    @Column(name = "office_phone_number")
    private String office_phone_number;

    @Column(name = "personal_phone_number")
    private String personal_phone_number;

    @Column(name = "working_role")
    private String working_role;

    @Column(name = "working_status")
    private Boolean working_status;

    public Employee() {
    }

    public Employee(String id_number, String first_name, String last_name, String full_name, Integer age, String email_address, String office_phone_number, String personal_phone_number, String working_role, Boolean working_status) {
        this.id_number = id_number;
        this.first_name = first_name;
        this.last_name = last_name;
        this.full_name = full_name;
        this.age = age;
        this.email_address = email_address;
        this.office_phone_number = office_phone_number;
        this.personal_phone_number = personal_phone_number;
        this.working_role = working_role;
        this.working_status = working_status;
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

    public String getEmail_address() {
        return email_address;
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

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
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
}
