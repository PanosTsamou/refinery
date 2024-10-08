package tsamou.refinery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tsamou.refinery.models.WorkingOrder;
import tsamou.refinery.repository.WorkingOrderRepository;
import tsamou.refinery.utilities.WorkingOrderHelper;

import java.util.List;
import java.util.Optional;

@RestController
public class WorkingOrderController {

    @Autowired
    WorkingOrderRepository workingOrderRepository;

    @GetMapping ("/workingOrders")
    public List <WorkingOrder> getAllWorkingOrders (){return workingOrderRepository.findAll();}

    @GetMapping ("/workingOrders/{id}")
    public Optional <WorkingOrder> getWorkingOrderById (@PathVariable Long id){return workingOrderRepository.findById(id);}

    @PostMapping ("/workingOrders")
    public ResponseEntity <WorkingOrder> saveWorkingOrder(@RequestBody WorkingOrder order){
        workingOrderRepository.save(order);
        return new ResponseEntity<>(order, HttpStatus.CREATED);
    }

    @PutMapping ("/workingOrders/{id}")
    public ResponseEntity <WorkingOrder> updateWorkingOrder (@RequestBody WorkingOrder order, @PathVariable Long id){
        WorkingOrder workingOrderToBeUpdated = workingOrderRepository.findById(id).get();
        WorkingOrderHelper.updateWorkingOrder(workingOrderToBeUpdated,order);
        workingOrderRepository.save(workingOrderToBeUpdated);
        return new ResponseEntity<>(workingOrderToBeUpdated, HttpStatus.OK);
    }

    @DeleteMapping ("/workingOrders/{id}")
    public void deleteWorkingOrder (@PathVariable Long id){
        workingOrderRepository.deleteById(id);
    }

}
