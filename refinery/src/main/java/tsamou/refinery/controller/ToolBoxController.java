package tsamou.refinery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tsamou.refinery.models.ToolBox;
import tsamou.refinery.repository.ToolBoxRepository;
import tsamou.refinery.utilities.ToolBoxHelper;

import java.util.List;
import java.util.Optional;

@RestController
public class ToolBoxController {

    @Autowired
    ToolBoxRepository toolBoxRepository;

    @GetMapping ("/toolboxes")
    public List<ToolBox> getAllToolBoxes(){
        return toolBoxRepository.findAll();
    }
    @GetMapping ("/toolboxes/{id}")
    public Optional<ToolBox> getToolBoxById(@PathVariable Long id){
        return toolBoxRepository.findById(id);
    }

    @PostMapping ("/toolboxes")
    public ResponseEntity<ToolBox> saveToolBox (@RequestBody ToolBox toolBox){
        toolBoxRepository.save(toolBox);
        return new ResponseEntity<>(toolBox, HttpStatus.CREATED);
    }

    @PutMapping ("/toolboxes/{id}")
    public ResponseEntity<ToolBox> updateTools (@RequestBody ToolBox toolBox, @PathVariable Long id){
        ToolBox toolBoxToBeUpdated = toolBoxRepository.findById(id).get();
        ToolBoxHelper.updateTools(toolBoxToBeUpdated, toolBox);
        toolBoxRepository.save(toolBoxToBeUpdated);
        return new ResponseEntity<>(toolBoxToBeUpdated, HttpStatus.OK);
    }
}
