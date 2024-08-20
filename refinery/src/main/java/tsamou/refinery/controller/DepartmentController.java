package tsamou.refinery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tsamou.refinery.models.Department;
import tsamou.refinery.repository.DepartmentRepository;
import tsamou.refinery.utilities.DepartmentHelper;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping ("/departments")
    public ResponseEntity <List<Department>> getAllDepartments(){
        return new ResponseEntity<> (departmentRepository.findAll(), HttpStatus.OK);
    }
    @GetMapping ("/departments/{id}")
    public ResponseEntity<Optional<Department>> getDepartmentById(@PathVariable  Long id){
        return new ResponseEntity<>(departmentRepository.findById(id), HttpStatus.OK);
    }
   @PostMapping ("/departments")
   public ResponseEntity<Department> postDepartment(@RequestBody Department department){
        departmentRepository.save(department);
        return new ResponseEntity<> (department, HttpStatus.OK);
   }

   @PutMapping ("/departments/{id}")
    public ResponseEntity<Department> putDepartment(@RequestBody Department department, @PathVariable Long id){
        Department departmentToBeUpdated = departmentRepository.findById(id).get();
        DepartmentHelper.updateDeoartment(departmentToBeUpdated,department);
        departmentRepository.save(departmentToBeUpdated);
        return new ResponseEntity<> (departmentToBeUpdated, HttpStatus.OK);
   }
}
