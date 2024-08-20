package tsamou.refinery.models;

import jakarta.persistence.*;

@Entity
@Table (name = "Section")
public class Section {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name =  "Id")
    private Long id;

    @Column (name =  "Name")
    private String name;

    public Section() {
    }

    public Section(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
