package tsamou.refinery.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "Tools")
public class Tools {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "Id")
    private Long id;

    @Column (name = "Name")
    private String name;

    @Column (name = "Type")
    private String type;

    @Column (name = "Size")
    private String size;

    @Column (name = "Stock")
    private Boolean stock;

    @Column (name = "Stock_Level")
    private  Integer stock_level;

    @ManyToMany (mappedBy = "tools")
    private List<Employee> employees;

    public Tools() {
    }



    public Tools(String name, String type, String size, Boolean stock, Integer stock_level, List<Employee> employees) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.stock = stock;
        this.stock_level = stock_level;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Boolean getStock() {
        return stock;
    }

    public void setStock(Boolean stock) {
        this.stock = stock;
    }

    public Integer getStock_level() {
        return stock_level;
    }

    public void setStock_level(Integer stock_level) {
        this.stock_level = stock_level;
    }
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
