package tsamou.refinery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tsamou.refinery.models.Tank;
import tsamou.refinery.repository.TankRepository;
import tsamou.refinery.utilities.TankHelper;

import java.util.List;
import java.util.Optional;

@RestController
public class TankController {

    @Autowired
    TankRepository tankRepository;

    @GetMapping ("/tanks")
    public List<Tank>  getAllTanks(){
       return tankRepository.findAll();
    }

    @GetMapping ("/tanks/{id}")
    public Optional<Tank> getTankById(@PathVariable Long id){
        return  tankRepository.findById(id);
    }

    @PostMapping ("/tanks")
    public ResponseEntity<Tank> saveTank (@RequestBody Tank tank){
        tankRepository.save(tank);
        return new ResponseEntity<>(tank, HttpStatus.CREATED);
    }

    @PutMapping ("/tanks/{id}")
    public ResponseEntity<Tank> updateTank(@RequestBody Tank tank, @PathVariable Long id){
        Tank tankToBeUpdated = tankRepository.findById(id).get();
        TankHelper.updateTank(tankToBeUpdated, tank);
        tankRepository.save(tankToBeUpdated);
        return new ResponseEntity<>(tankToBeUpdated, HttpStatus.OK);
    }

    @DeleteMapping ("/tanks/{id}")
    public ResponseEntity<Tank> deleteTank(@PathVariable Long id){
        Tank deletedTank = tankRepository.findById(id).get();
        tankRepository.deleteById(id);
        return new ResponseEntity<>(deletedTank, HttpStatus.OK);
    }
}
