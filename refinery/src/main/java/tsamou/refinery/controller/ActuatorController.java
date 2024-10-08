package tsamou.refinery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tsamou.refinery.models.Actuator;
import tsamou.refinery.repository.ActuatorRepository;
import tsamou.refinery.utilities.ActuatorHelper;

import java.util.List;
import java.util.Optional;

@RestController
public class ActuatorController {

    @Autowired
    ActuatorRepository actuatorRepository;

    @GetMapping ("/actuators")
    public List<Actuator>  getAllActuators (){
        return actuatorRepository.findAll();
    }

    @GetMapping ("/actuators/{id}")
    public Optional<Actuator> getActuatorById (@PathVariable Long id){
        return actuatorRepository.findById(id);
    }

    @PostMapping ("/actuators")
    public ResponseEntity<Actuator> saveActuator (@RequestBody Actuator actuator){
        actuatorRepository.save(actuator);
        return new ResponseEntity<>(actuator, HttpStatus.CREATED);
    }

    @PutMapping ("/actuators/{id}")
    public ResponseEntity<Actuator>  updateActuator(@RequestBody Actuator actuator, @PathVariable Long id){
        Actuator actuatorToBeUpdated = actuatorRepository.findById(id).get();
        ActuatorHelper.updateActuator(actuatorToBeUpdated, actuator);
        actuatorRepository.save(actuatorToBeUpdated);
        return new ResponseEntity<>(actuatorToBeUpdated, HttpStatus.OK);
    }
    @DeleteMapping ("/actuators/{id}")
    public ResponseEntity<Actuator> deleteActuator(@PathVariable Long id){
        Actuator deletedActuator = actuatorRepository.findById(id).get();
        actuatorRepository.deleteById(id);
        return new ResponseEntity<>(deletedActuator, HttpStatus.OK);
    }
}
