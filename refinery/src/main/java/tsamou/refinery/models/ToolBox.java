package tsamou.refinery.models;

import jakarta.persistence.*;
import org.apache.catalina.startup.Tool;
import tsamou.refinery.models.tools.Tools;

import java.util.List;

@Entity
@Table (name = "Tools")
public class ToolBox {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "Id")
    private Long id;

    @OneToOne (mappedBy = "toolBox")
    private Employee employees;

    @ManyToMany
    @JoinTable(
            name = "toolbox_and_tools",
            joinColumns = @JoinColumn (name = "toolbox_id"),
            inverseJoinColumns = @JoinColumn (name = "tools_id")
    )
    private List<Tools> tools;

    public ToolBox() {
    }

    public ToolBox(Employee employees, List<Tools> tools) {
        this.employees = employees;
        this.tools = tools;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployees() {
        return employees;
    }

    public void setEmployees(Employee employees) {
        this.employees = employees;
    }

    public List<Tools> getTools() {
        return tools;
    }

    public void setTools(List<Tools> tools) {
        this.tools = tools;
    }
}
