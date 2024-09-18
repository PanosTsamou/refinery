package tsamou.refinery.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "work_permit")
public class WorkPermit {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "permit_number")
    private Integer per_num;

    @Column (name = "date")
    private String date;

    @OneToOne (mappedBy = "workPermit")
    private WorkingOrder workingOrder;


    @ManyToOne
    @JoinColumn (name = "applicant_id")
    private Employee applicant;

//    @ManyToOne
//    @JoinColumn (name = "supervisor_employee_id")
//    private Employee supervisor_approved;
//    @ManyToOne
//    @JoinColumn (name = "unit_employee_id")
//    private Employee unit_approved;
//
//    @Column (name = "unit_notes")
//    private String unit_notes;
//
//    @Column (name = " supervisor_notes")
//    private String supervisor_notes;

    @Column (name = "gas_detector")
    private Boolean gas_detector;

    @Column (name = "safety_equipment")
    private Boolean safety_equipment;

    @Column (name = "bronze_tools")
    private Boolean bronze_tools;

//    @Column (name = "supervisor_approval")
//    private Boolean supervisor_approval;
//
//    @Column (name = "unit_approval")
//    private Boolean unit_approval;

    @Column (name = "work_status")
    private String work_status;

    @OneToMany(mappedBy = "workPermit")
    private List <WorkPermitApprovals> approvals;

    public WorkPermit() {
    }

    public WorkPermit(Integer per_num, String date, WorkingOrder workingOrder, Employee applicant, Boolean gas_detector, Boolean safety_equipment, Boolean bronze_tools, String work_status, List<WorkPermitApprovals> approvals) {
        this.per_num = per_num;
        this.date = date;
        this.workingOrder = workingOrder;
        this.applicant = applicant;
        this.gas_detector = gas_detector;
        this.safety_equipment = safety_equipment;
        this.bronze_tools = bronze_tools;
        this.work_status = work_status;
        this.approvals = approvals;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPer_num() {
        return per_num;
    }

    public void setPer_num(Integer per_num) {
        this.per_num = per_num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Employee getApplicant() {
        return applicant;
    }

    public void setApplicant(Employee applicant) {
        this.applicant = applicant;
    }

    public Boolean getGas_detector() {
        return gas_detector;
    }

    public void setGas_detector(Boolean gas_detector) {
        this.gas_detector = gas_detector;
    }

    public Boolean getSafety_equipment() {
        return safety_equipment;
    }

    public void setSafety_equipment(Boolean safety_equipment) {
        this.safety_equipment = safety_equipment;
    }

    public Boolean getBronze_tools() {
        return bronze_tools;
    }

    public void setBronze_tools(Boolean bronze_tools) {
        this.bronze_tools = bronze_tools;
    }

    public WorkingOrder getWorkingOrder() {
        return workingOrder;
    }

    public void setWorkingOrder(WorkingOrder workingOrder) {
        this.workingOrder = workingOrder;
    }

    public String getWork_status() {
        return work_status;
    }

    public void setWork_status(String work_status) {
        this.work_status = work_status;
    }

    public List<WorkPermitApprovals> getApprovals() {
        return approvals;
    }

    public void setApprovals(List<WorkPermitApprovals> approvals) {
        this.approvals = approvals;
    }
}
//    public Employee getUnit_approved() {
//        return unit_approved;
//    }
//
//    public void setUnit_approved(Employee unit_approved) {
//        this.unit_approved = unit_approved;
//    }
//
//    public Employee getSupervisor_approved() {
//        return supervisor_approved;
//    }
//
//    public void setSupervisor_approved(Employee supervisor_approved) {
//        this.supervisor_approved = supervisor_approved;
//    }
//
//    public String getUnit_notes() {
//        return unit_notes;
//    }
//
//    public void setUnit_notes(String unit_notes) {
//        this.unit_notes = unit_notes;
//    }
//
//    public String getSupervisor_notes() {
//        return supervisor_notes;
//    }
//
//    public void setSupervisor_notes(String supervisor_notes) {
//        this.supervisor_notes = supervisor_notes;
//    }

//    public Boolean getSupervisor_approval() {
//        return supervisor_approval;
//    }
//
//    public void setSupervisor_approval(Boolean supervisor_approval) {
//        this.supervisor_approval = supervisor_approval;
//    }
//
//    public Boolean getUnit_approval() {
//        return unit_approval;
//    }
//
//    public void setUnit_approval(Boolean unit_approval) {
//        this.unit_approval = unit_approval;
//    }

