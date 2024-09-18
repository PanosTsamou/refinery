package tsamou.refinery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tsamou.refinery.models.WorkPermit;
import tsamou.refinery.repository.WorkPermitRepository;
import tsamou.refinery.utilities.WorkPermitHelper;

import java.util.List;
import java.util.Optional;

@RestController
public class WorkPermitController {

    @Autowired
    WorkPermitRepository workPermitRepository;

    @GetMapping ("/workPermit")
    public List <WorkPermit> getAllWorkPermit () {return workPermitRepository.findAll();}

    @GetMapping ("/workPermit/{id}")
    public Optional <WorkPermit> getWorkPermitById (@PathVariable Long id){ return workPermitRepository.findById(id);}

    @PostMapping ("/workPermit")
    public ResponseEntity <WorkPermit> saveWorkPermit (@RequestBody WorkPermit permit){
        workPermitRepository.save(permit);
        return new ResponseEntity<>(permit, HttpStatus.CREATED);
    }

    @PutMapping ("/workPermit/{id}")
    public ResponseEntity<WorkPermit> updateWorkPermit (@RequestBody WorkPermit permit, @PathVariable Long id){
        WorkPermit permitToBeUpdated = workPermitRepository.findById(id).get();
        WorkPermitHelper.updateWorkPermit(permitToBeUpdated,permit);
        workPermitRepository.save(permitToBeUpdated);
        return new ResponseEntity<>(permitToBeUpdated, HttpStatus.OK);
    }

    @DeleteMapping ("/workPermit/{id}")
    public void deleteWorkPermit (@PathVariable Long id){
        workPermitRepository.deleteById(id);
    }
}
