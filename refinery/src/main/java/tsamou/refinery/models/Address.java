package tsamou.refinery.models;

import jakarta.persistence.*;

@Entity
@Table (name = "addresses")
public class Address {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "number")
    private Integer number;

    @Column (name = "flatNum")
    private Integer flatNum;

    @Column (name = "street")
    private String street;

    @Column (name = "postCode")
    private String postCode;

    @Column (name = "city")
    private String city;

    @Column (name = "phone_number")
    private String phoneNum;

    @Column (name = "e_mail")
    private String mail;

    @OneToOne (mappedBy = "address")
    private Employee employee;

    public Address() {
    }

    public Address(Integer number, Integer flatNum, String street, String postCode, String city, String phoneNum, String mail, Employee employee) {
        this.number = number;
        this.flatNum = flatNum;
        this.street = street;
        this.postCode = postCode;
        this.city = city;
        this.phoneNum = phoneNum;
        this.mail = mail;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getFlatNum() {
        return flatNum;
    }

    public void setFlatNum(Integer flatNum) {
        this.flatNum = flatNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
