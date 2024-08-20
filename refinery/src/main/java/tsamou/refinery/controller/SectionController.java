package tsamou.refinery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tsamou.refinery.models.Section;
import tsamou.refinery.repository.SectionRepository;
import tsamou.refinery.utilities.SectionHelper;

import java.util.List;
import java.util.Optional;

@RestController
public class SectionController {

    @Autowired
    SectionRepository sectionRepository;

    @GetMapping ("/sections")
    public ResponseEntity<List<Section>> getAllSections(){
        return new ResponseEntity<>(sectionRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping ("/sections/{id}")
    public ResponseEntity<Optional<Section>> getSectionById(@PathVariable Long id){
        return new ResponseEntity<>(sectionRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping ("/sections")
    public ResponseEntity<Section> saveSection(@RequestBody Section section){
        sectionRepository.save(section);
        return  new ResponseEntity<>(section, HttpStatus.OK);
    }

    @PutMapping ("/sections/{id}")
    public ResponseEntity<Section> updateSection(@RequestBody Section section, @PathVariable Long id){
        Section sectionToBeUpdated = sectionRepository.findById(id).get();
        SectionHelper.updateSection(sectionToBeUpdated, section);
        sectionRepository.save(sectionToBeUpdated);
        return new ResponseEntity<>(sectionToBeUpdated, HttpStatus.OK);
    }
}
