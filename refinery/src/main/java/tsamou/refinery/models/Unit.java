package tsamou.refinery.models;

import jakarta.persistence.*;

import java.io.Serializable;

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

    public Unit(){

    }



    public Unit(String name, Integer number){
        this.name = name;
        this.number = number;
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
}
