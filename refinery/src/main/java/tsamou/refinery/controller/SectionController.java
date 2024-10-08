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
    public List<Section> getAllSections(){
        return sectionRepository.findAll();
    }

    @GetMapping ("/sections/{id}")
    public Optional<Section> getSectionById(@PathVariable Long id){
        return sectionRepository.findById(id);
    }

    @PostMapping ("/sections")
    public ResponseEntity<Section> saveSection(@RequestBody Section section){
        sectionRepository.save(section);
        return  new ResponseEntity<>(section, HttpStatus.CREATED);
    }

    @PutMapping ("/sections/{id}")
    public ResponseEntity<Section> updateSection(@RequestBody Section section, @PathVariable Long id){
        Section sectionToBeUpdated = sectionRepository.findById(id).get();
        SectionHelper.updateSection(sectionToBeUpdated, section);
        sectionRepository.save(sectionToBeUpdated);
        return new ResponseEntity<>(sectionToBeUpdated, HttpStatus.OK);
    }
}
