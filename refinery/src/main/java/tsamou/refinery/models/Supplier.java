package tsamou.refinery.models;

import jakarta.persistence.*;
import org.springframework.context.annotation.EnableMBeanExport;

import java.util.List;

@Entity
@Table (name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "name")
    private String name;

    @Column (name = "company")
    private String company;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "address_id",referencedColumnName = "id")
    private Address address;

    @OneToMany (mappedBy = "supplier")
    private List<Warehouse> warehouses;

    public Supplier() {
    }

    public Supplier(String name, String company, Address address) {
        this.name = name;
        this.company = company;
        this.address = address;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
