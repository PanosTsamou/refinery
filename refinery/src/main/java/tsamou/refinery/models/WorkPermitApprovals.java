package tsamou.refinery.models;

import jakarta.persistence.*;
import org.springframework.context.annotation.EnableMBeanExport;

@Entity
@Table (name = "work_permit_approvals")
public class WorkPermitApprovals {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "description")
    private String description;

    @Column (name = "approved")
    private  Boolean approved;

    @ManyToOne
    @JoinColumn (name = "work_permit_id")
    private WorkPermit workPermit;

    @ManyToOne
    @JoinColumn (name = "authorizer_id")
    private Employee authorizer;

    public WorkPermitApprovals() {
    }

    public WorkPermitApprovals(String description, Boolean approved, WorkPermit workPermit, Employee authorizer) {
        this.description = description;
        this.approved = approved;
        this.workPermit = workPermit;
        this.authorizer = authorizer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public WorkPermit getWorkPermit() {
        return workPermit;
    }

    public void setWorkPermit(WorkPermit workPermit) {
        this.workPermit = workPermit;
    }

    public Employee getAuthorizer() {
        return authorizer;
    }

    public void setAuthorizer(Employee authorizer) {
        this.authorizer = authorizer;
    }
}
