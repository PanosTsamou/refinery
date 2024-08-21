package tsamou.refinery.controller;

import jdk.jfr.BooleanFlag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tsamou.refinery.models.Tools;
import tsamou.refinery.repository.ToolsRepository;
import tsamou.refinery.utilities.ToolsHelper;

import java.util.List;
import java.util.Optional;

@RestController
public class ToolsController {

    @Autowired
    ToolsRepository toolsRepository;

    @GetMapping ("/tools")
    public List<Tools> getAllTools(){
        return toolsRepository.findAll();
    }   @GetMapping ("/tools/{id}")
    public Optional<Tools> getToolsById(@PathVariable Long id){
        return toolsRepository.findById(id);
    }

    @PostMapping ("/tools")
    public ResponseEntity<Tools> saveTools (@RequestBody Tools tool){
        toolsRepository.save(tool);
        return new ResponseEntity<>(tool, HttpStatus.CREATED);
    }

    @PutMapping ("/tools/{id}")
    public ResponseEntity<Tools> updateTools (@RequestBody Tools tool, @PathVariable Long id){
        Tools toolToBeUpdated = toolsRepository.findById(id).get();
        ToolsHelper.updateTools(toolToBeUpdated, tool);
        toolsRepository.save(toolToBeUpdated);
        return new ResponseEntity<>(toolToBeUpdated, HttpStatus.OK);
    }
}
