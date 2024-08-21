package tsamou.refinery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tsamou.refinery.models.Meter;
import tsamou.refinery.repository.MeterRepository;
import tsamou.refinery.utilities.MeterHelper;

import java.util.List;
import java.util.Optional;

@RestController
public class MeterController {

    @Autowired
    MeterRepository meterRepository;

    @GetMapping ("/meters")
    public List<Meter> getAllMeters(){
        return meterRepository.findAll();
    }

    @GetMapping ("/meters/{id}")
    public  Optional<Meter> getMeterById(@PathVariable Long id){
        return meterRepository.findById(id);
    }

    @PostMapping ("/meters")
    public ResponseEntity<Meter> saveMeter(@RequestBody Meter meter){
        meterRepository.save(meter);
        return new ResponseEntity<>(meter,HttpStatus.CREATED);
    }

    @PutMapping ("/meters/{id}")
    public ResponseEntity<Meter> updateMeter (@RequestBody Meter meter, @PathVariable Long id){
        Meter meterToBeUpdated = meterRepository.findById(id).get();
        MeterHelper.updateMeter(meterToBeUpdated, meter);
        meterRepository.save(meterToBeUpdated);
        return new ResponseEntity<>(meterToBeUpdated, HttpStatus.OK);
    }

    @DeleteMapping ("/meters/{id}")
    public ResponseEntity<Meter> deleteMeter(@PathVariable Long id){
        Meter deletedMeter = meterRepository.findById(id).get();
        meterRepository.deleteById(id);
        return new ResponseEntity<>(deletedMeter, HttpStatus.OK);
    }
}
