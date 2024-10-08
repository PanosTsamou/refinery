package tsamou.refinery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tsamou.refinery.models.Address;
import tsamou.refinery.repository.AddressRepository;
import tsamou.refinery.utilities.AddressHelper;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    AddressRepository addressRepository;

    @GetMapping ("/addresses")
    public List<Address> getAllAddresses(){return addressRepository.findAll();}

    @GetMapping ("/addresses/{id}")
    public Optional<Address> getAddressById (@PathVariable Long id){ return addressRepository.findById(id);}

    @PostMapping ("/addresses")
    public ResponseEntity<Address> saveAddress(@RequestBody Address address){
        addressRepository.save(address);
        return new ResponseEntity<>(address, HttpStatus.CREATED);
    }

    @PutMapping ("/addresses/{id}")
    public ResponseEntity<Address> updateAddress(@RequestBody Address address, @PathVariable Long id){
        Address addressToBeUpdate = addressRepository.findById(id).get();
        AddressHelper.updateAddress(addressToBeUpdate, address);
        addressRepository.save(addressToBeUpdate);
        return new ResponseEntity<> (addressToBeUpdate, HttpStatus.OK);
    }

    @DeleteMapping ("/addresses/{id}")
    public void deleteAddressById(@PathVariable Long id){
        addressRepository.deleteById(id);
    }
}
