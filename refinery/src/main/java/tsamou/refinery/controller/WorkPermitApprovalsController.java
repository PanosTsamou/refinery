package tsamou.refinery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tsamou.refinery.models.WorkPermitApprovals;
import tsamou.refinery.repository.WorkPermitApprovalsRepository;
import tsamou.refinery.utilities.WorkPermitApprovalsHelper;

import java.util.List;
import java.util.Optional;

@RestController
public class WorkPermitApprovalsController {

    @Autowired
    WorkPermitApprovalsRepository approvalRepository;

    @GetMapping ("/workPermitApprovals")
    public List <WorkPermitApprovals> getAllWorkPermitApprovals() {return approvalRepository.findAll();}

    @GetMapping ("/workPermitApprovals/{id}")
    public Optional <WorkPermitApprovals> getWorkPermitApprovalsById(@PathVariable Long id) {return approvalRepository.findById(id);}

    @PostMapping ("/WorkPermitApprovals")
    public ResponseEntity <WorkPermitApprovals> saveWorkPermitApprovals(@RequestBody WorkPermitApprovals approval){
        approvalRepository.save(approval);
        return new ResponseEntity<>(approval, HttpStatus.CREATED);
    }

    @PutMapping ("/workPermitApprovals/{id}")
    public ResponseEntity <WorkPermitApprovals>  updateWorkPermitApproval(@RequestBody WorkPermitApprovals approval, @PathVariable Long id){
        WorkPermitApprovals approvaltoBeUpdated = approvalRepository.findById(id).get();
        WorkPermitApprovalsHelper.updateWorkPermitApprovals(approvaltoBeUpdated,approval);
        approvalRepository.save(approvaltoBeUpdated);
        return new ResponseEntity<>(approvaltoBeUpdated, HttpStatus.OK);
    }
}
