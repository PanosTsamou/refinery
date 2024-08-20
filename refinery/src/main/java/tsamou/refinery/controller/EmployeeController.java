package tsamou.refinery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tsamou.refinery.models.Employee;
import tsamou.refinery.repository.EmployeeRepository;
import tsamou.refinery.utilities.EmployeeHelper;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping ("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return new ResponseEntity<> (employeeRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping ("/employees/{id}")
    public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable Long id){
        return new ResponseEntity<>(employeeRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping ("/employees")
    public  ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PutMapping ("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(Employee employee, @PathVariable Long id){
        Employee employeeToBeUpdated = employeeRepository.findById(id).get();
        EmployeeHelper.updateEmployee(employeeToBeUpdated,employee);
        employeeRepository.save(employeeToBeUpdated);
        return new ResponseEntity<>(employeeToBeUpdated,HttpStatus.OK);
    }
}
