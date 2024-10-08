package tsamou.refinery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tsamou.refinery.models.Unit;
import tsamou.refinery.repository.UnitRepository;
import tsamou.refinery.utilities.UnitHelper;

import java.util.List;
import java.util.Optional;

@RestController
public class UnitController {
    @Autowired
    UnitRepository unitRepository;

    @GetMapping ("/units")
    public List<Unit> getAllUnits(){
        return unitRepository.findAll();
    }

    @GetMapping ("/units/{id}")
    public Optional<Unit> getUnitById(@PathVariable Long id){
        return unitRepository.findById(id);
    }

    @PostMapping ("/units")
    public  ResponseEntity<Unit> saveUnit (@RequestBody Unit unit){
        unitRepository.save(unit);
        return new ResponseEntity<>(unit, HttpStatus.CREATED);
    }

    @PutMapping ("/units/{id}")
    public ResponseEntity<Unit> updateUnit (@RequestBody Unit unit, @PathVariable Long id){
        Unit unitToBeUpdated = unitRepository.findById(id).get();
        UnitHelper.updateUnit(unitToBeUpdated, unit);
        unitRepository.save(unitToBeUpdated);
        return new ResponseEntity<>(unitToBeUpdated, HttpStatus.OK);
    }

}
